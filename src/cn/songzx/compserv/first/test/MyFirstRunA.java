/**   
* @Title: MyFirstRunA.java 
* @Package cn.songzx.compserv.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午5:10:47 
* @version V1.0   
*/
package cn.songzx.compserv.first.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import cn.songzx.compserv.first.mycallable.MyFirstCallableA;

/**
 * @ClassName: MyFirstRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午5:10:47
 * 
 */
public class MyFirstRunA {

	public static void main(String[] args) {
		try {
			MyFirstCallableA callableA = new MyFirstCallableA("usernameA", 5000);
			MyFirstCallableA callableB = new MyFirstCallableA("usernameB", 4000);
			MyFirstCallableA callableC = new MyFirstCallableA("usernameC", 3000);
			MyFirstCallableA callableD = new MyFirstCallableA("usernameD", 2000);
			MyFirstCallableA callableE = new MyFirstCallableA("usernameE", 1000);

			List<Callable> callableList = new ArrayList<Callable>();
			callableList.add(callableA);
			callableList.add(callableB);
			callableList.add(callableC);
			callableList.add(callableD);
			callableList.add(callableE);

			ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			CompletionService csRef = new ExecutorCompletionService(executor);
			for (int i = 0; i < 5; i++) {
				csRef.submit(callableList.get(i));
			}

			for (int i = 0; i < 5; i++) {
				System.out.println("等待打印第" + (i + 1) + "个返回值！");
				System.out.println(csRef.take().get());
			}
			// 按乱序打印的效果，说明一个Future对应当前先执行完的Callable任务
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}

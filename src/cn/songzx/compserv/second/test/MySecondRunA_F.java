/**   
* @Title: MySecondRunA.java 
* @Package cn.songzx.compserv.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午7:34:48 
* @version V1.0   
*/
package cn.songzx.compserv.second.test;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

import cn.songzx.compserv.second.mycallable.MySecondCalllableA;
import cn.songzx.compserv.second.mycallable.MySecondCalllableB;

/**
 * @ClassName: MySecondRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午7:34:48
 * 
 */
public class MySecondRunA_F {
	public static void main(String[] args) {
		try {
			MySecondCalllableA callableA = new MySecondCalllableA();
			MySecondCalllableB callableB = new MySecondCalllableB();
			Executor executor = Executors.newSingleThreadExecutor();
			CompletionService csRef = new ExecutorCompletionService(executor);
			csRef.submit(callableB);// 先执行B
			csRef.submit(callableA);// 后执行A
			for (int i = 0; i < 2; i++) {
				System.out.println("zzzzzzzzzzzzzzzzzzz" + " " + csRef.poll());
			}
			Thread.sleep(6000L);
			// 调整线程执行顺序后，任务A并未打印，任务B抛出异常
			System.out.println("A处" + " " + csRef.poll().get());
			System.out.println("B处" + " " + csRef.poll().get());
			System.out.println("Main End！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}

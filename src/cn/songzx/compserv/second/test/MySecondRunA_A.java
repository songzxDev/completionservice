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
public class MySecondRunA_A {
	public static void main(String[] args) {
		try {
			MySecondCalllableA callableA = new MySecondCalllableA();
			MySecondCalllableB callableB = new MySecondCalllableB();
			Executor executor = Executors.newSingleThreadExecutor();
			CompletionService csRef = new ExecutorCompletionService(executor);
			csRef.submit(callableA);
			csRef.submit(callableB);
			for (int i = 0; i < 2; i++) {
				// 虽然MySecondCalllableB出现异常，但并没有调用FutureTask类的get()方法，所以不抛出异常
				System.out.println("zzzzzzzzzzzzzzzzzzz" + " " + csRef.take());
			}
			System.out.println("Main End！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

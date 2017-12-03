/**   
* @Title: MyFirstRunD_A.java 
* @Package cn.songzx.compserv.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午5:37:47 
* @version V1.0   
*/
package cn.songzx.compserv.first.test;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import cn.songzx.compserv.first.mycallable.MyFirstCallableB;
import cn.songzx.compserv.first.mycallable.MyFirstCallableC;

public class MyFirstRunD_B {

	public static void main(String[] args) {
		try {
			MyFirstCallableB callableB = new MyFirstCallableB();
			MyFirstCallableC callableC = new MyFirstCallableC();
			Executor executor = Executors.newCachedThreadPool();

			CompletionService csRef = new ExecutorCompletionService(executor);
			csRef.submit(callableB);
			csRef.submit(callableC);
			for (int i = 0; i < 2; i++) {
				// poll(long timeout,TimeUnit unit)的作用是等待指定的timeout时间，
				// 在timeout时间内获取到值时立即向下继续执行，如果超时也立即向下执行。
				System.out.println("zzzzzzzzzzzzzzzz" + " " + csRef.poll(6, TimeUnit.SECONDS).get());
				System.out.println("X");
			}
			System.out.println("Main End！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}

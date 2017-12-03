/**   
* @Title: MyFirstRunB_A.java 
* @Package cn.songzx.compserv.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午5:24:04 
* @version V1.0   
*/
package cn.songzx.compserv.first.test;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: MyFirstRunB_A
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午5:24:04
 * 
 */
public class MyFirstRunB_A {

	public static void main(String[] args) {
		try {
			ExecutorService executorService = Executors.newCachedThreadPool();
			CompletionService csRef = new ExecutorCompletionService(executorService);
			for (int i = 0; i < 10; i++) {
				csRef.submit(new Callable<String>() {

					@Override
					public String call() throws Exception {
						long sleepValue = (int) (Math.random() * 1000);
						System.out.println("sleep=" + sleepValue + " " + Thread.currentThread().getName());
						Thread.sleep(sleepValue);
						return "宋桢熙：" + sleepValue + " " + Thread.currentThread().getName();
					}

				});
			}
			for (int i = 0; i < 10; i++) {
				System.out.println(csRef.take().get());// take()方法取得最先完成任务的Future对象，谁执行时间最短谁最先返回
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}

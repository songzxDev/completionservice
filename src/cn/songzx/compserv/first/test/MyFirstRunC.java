/**   
* @Title: MyFirstRunC.java 
* @Package cn.songzx.compserv.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午5:32:01 
* @version V1.0   
*/
package cn.songzx.compserv.first.test;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: MyFirstRunC
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午5:32:01
 * 
 */
public class MyFirstRunC {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		CompletionService csRef = new ExecutorCompletionService(executorService);
		for (int i = 0; i < 1; i++) {
			csRef.submit(new Callable<String>() {

				@Override
				public String call() throws Exception {
					Thread.sleep(3000L);
					System.out.println("3秒过去了！");
					return "宋桢熙 3s";
				}

			});
		}
		for (int i = 0; i < 1; i++) {
			/*
			 * 方法poll()作用是获取并移除表示下一个已完成任务的Future，如果不存在这样的任务则返回null，方法poll()无阻塞效果
			 */
			System.out.println(csRef.poll());
		}
	}

}

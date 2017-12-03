/**   
* @Title: MyThirdRunA.java 
* @Package cn.songzx.compserv.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午8:00:39 
* @version V1.0   
*/
package cn.songzx.compserv.third.test;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import cn.songzx.compserv.third.entity.MyThirdUserinfo;
import cn.songzx.compserv.third.myrunnable.MyThirdRunnableA;

public class MyThirdRunA {
	public static void main(String[] args) {
		try {
			MyThirdUserinfo userinfo = new MyThirdUserinfo();
			MyThirdRunnableA myRunnable = new MyThirdRunnableA(userinfo);
			Executor executor = Executors.newCachedThreadPool();
			CompletionService csRef = new ExecutorCompletionService(executor);
			Future<MyThirdUserinfo> future = csRef.submit(myRunnable, userinfo);
			System.out.println(future.get().getUsername() + " " + future.get().getPassword());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}

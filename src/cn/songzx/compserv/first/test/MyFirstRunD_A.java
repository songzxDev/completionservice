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
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

import cn.songzx.compserv.first.mycallable.MyFirstCallableB;
import cn.songzx.compserv.first.mycallable.MyFirstCallableC;

public class MyFirstRunD_A {

	public static void main(String[] args) {
		MyFirstCallableB callableB = new MyFirstCallableB();
		MyFirstCallableC callableC = new MyFirstCallableC();
		Executor executor = Executors.newCachedThreadPool();

		CompletionService csRef = new ExecutorCompletionService(executor);
		csRef.submit(callableB);
		csRef.submit(callableC);
		for (int i = 0; i < 2; i++) {
			System.out.println("zzzzzzzzzzzzzzzz" + " " + csRef.poll());
		}
		System.out.println("Main End！");
	}

}

/**   
* @Title: MyFirstCallableB.java 
* @Package cn.songzx.compserv.first.mycallable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午5:38:43 
* @version V1.0   
*/
package cn.songzx.compserv.first.mycallable;

import java.util.concurrent.Callable;

public class MyFirstCallableC implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(10000L);
		System.out.println("MyFirstCallableC " + System.currentTimeMillis());
		return "returnC";
	}

}

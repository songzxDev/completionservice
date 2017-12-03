/**   
* @Title: MySecondCalllableA.java 
* @Package cn.songzx.compserv.second.mycallable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午7:29:34 
* @version V1.0   
*/
package cn.songzx.compserv.second.mycallable;

import java.util.concurrent.Callable;

public class MySecondCalllableA implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("MySecondCalllableA begin " + System.currentTimeMillis());
		Thread.sleep(1000L);
		System.out.println("MySecondCalllableA   end " + System.currentTimeMillis());
		return "returnA";
	}

}

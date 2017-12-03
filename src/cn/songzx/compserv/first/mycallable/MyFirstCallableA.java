/**   
* @Title: MyFirstCallableA.java 
* @Package cn.songzx.compserv.first.mycallable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午5:07:56 
* @version V1.0   
*/
package cn.songzx.compserv.first.mycallable;

import java.util.concurrent.Callable;

/**
 * @ClassName: MyFirstCallableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午5:07:56
 * 
 */
public class MyFirstCallableA implements Callable<String> {

	private String username;
	private long sleepValue;

	/**
	 * @Date: 2017年12月3日下午5:09:36
	 * @Title: MyFirstCallableA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param username
	 * @param sleepValue
	 */
	public MyFirstCallableA(String username, long sleepValue) {
		super();
		this.username = username;
		this.sleepValue = sleepValue;
	}

	/**
	 * @Date: 2017年12月3日下午5:07:57
	 * @Title: call
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @throws Exception
	 * @return 返回值类型
	 */
	@Override
	public String call() throws Exception {
		System.out.println(username);
		Thread.sleep(sleepValue);
		return "return " + username;
	}

}

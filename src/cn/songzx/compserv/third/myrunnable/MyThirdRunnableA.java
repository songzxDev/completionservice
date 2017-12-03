/**   
* @Title: MyThirdRunnableA.java 
* @Package cn.songzx.compserv.third.myrunnable 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午7:58:53 
* @version V1.0   
*/
package cn.songzx.compserv.third.myrunnable;

import cn.songzx.compserv.third.entity.MyThirdUserinfo;

/**
 * @ClassName: MyThirdRunnableA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午7:58:53
 * 
 */
public class MyThirdRunnableA implements Runnable {
	private MyThirdUserinfo userinfo;

	/**
	 * @Date: 2017年12月3日下午7:59:28
	 * @Title: MyThirdRunnableA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param userinfo
	 */
	public MyThirdRunnableA(MyThirdUserinfo userinfo) {
		super();
		this.userinfo = userinfo;
	}

	/**
	 * @Date: 2017年12月3日下午7:58:53
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		userinfo.setUsername("usernameValue");
		userinfo.setPassword("passwordValue");
		System.out.println("Run 运行了！");
	}

}

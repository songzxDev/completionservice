/**   
* @Title: MyThirdUserinfo.java 
* @Package cn.songzx.compserv.third.entity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年12月3日 下午7:57:32 
* @version V1.0   
*/
package cn.songzx.compserv.third.entity;

/**
 * @ClassName: MyThirdUserinfo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年12月3日 下午7:57:32
 * 
 */
public class MyThirdUserinfo {

	private String username;
	private String password;

	/**
	 * @Date: 2017年12月3日下午7:58:03
	 * @Title: MyThirdUserinfo.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	public MyThirdUserinfo() {
		super();
	}

	/**
	 * @Date: 2017年12月3日下午7:58:08
	 * @Title: MyThirdUserinfo.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param username
	 * @param password
	 */
	public MyThirdUserinfo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}

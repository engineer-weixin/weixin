/**
 * 
 */
package org.com.engineer.weixin.core;

import java.io.Serializable;

/**
 * 微信通用接口凭证
 * @author zhuyuyin
 * @since JDK 1.8
 * @version 1.0
 */
public class AccessToken implements Serializable{
	private static final long serialVersionUID = -335970633938998257L;
	private static AccessToken instance = null;
	private AccessToken(){
		
	}
	/**
	 * 获取凭证实例
	 * @return
	 */
	public static AccessToken getInstance(){
		if(null == instance){
			instance = new AccessToken();
		}
		return instance;
	}
	//获取的凭证
	private String token;
	//有效时间 单位：秒
	private int expiresIn;
	
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the expiresIn
	 */
	public int getExpiresIn() {
		return expiresIn;
	}
	/**
	 * @param expiresIn the expiresIn to set
	 */
	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}
	/**
	 * 强制将凭证置空
	 * @return instance
	 */
	public AccessToken refresh(){
		instance = new AccessToken();
		return instance;
	}
}

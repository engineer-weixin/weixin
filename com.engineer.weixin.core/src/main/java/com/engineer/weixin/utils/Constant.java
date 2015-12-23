/**
 * 
 */
package com.engineer.weixin.utils;

/**
 * 微信接口通用常量
 * 
 * @author zhuyuyin
 * @since JDK 1.8
 */
public class Constant {
	/**
	 * 获取微信接口凭证url
	 * {0}:APPID </br>
	 * {1}:APPSECRET
	 */
	public static final String GET_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid={0}&secret={1}";
	/**
	 * 创建自定义菜单url
	 * {0}:ACCESS_TOKEN
	 */
	public static final String CREATE_MENU_URL = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token={0}";
}

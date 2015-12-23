/**
 * 
 */
package com.engineer.weixin.utils;

import java.util.Date;

import com.engineer.weixin.core.AccessToken;

/**
 * 微信常用工具类
 * 
 * @author zhuyuyin
 * @since JDK 1.8
 */
public class WeiXinUtils {
	private static Date Get_AccessToken_Time;
	private static int Expires_Period = 7200;

	public static String AccessToken() {
		String accessToken = "";
		return accessToken;
	}

	public static AccessToken getAccessToken(String appId, String appSecret) {
		String url = String.format(Constant.GET_TOKEN_URL, appId, appSecret);
		
		return null;
	}
}

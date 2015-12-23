/**
 * 
 */
package com.engineer.weixin.utils;

import java.io.Closeable;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Http/Https请求工具类
 * @author zhuyuyin
 * @since JDK 1.8 HttpClient 4.3.6
 */
public class HttpUtils {
	
	/**
	 * 创建加密连接
	 * @return {@link CloseableHttpClient}
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 */
	public static CloseableHttpClient getSSLClient() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
		SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
			
			public boolean isTrusted(X509Certificate[] chian, String authType) throws CertificateException {
				return true;
			}
		}).build();
		SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext);
		return HttpClients.custom().setSSLSocketFactory(socketFactory).build();
	}
	/**
	 * 
	 * http请求Get方法.
	 * <p>
	 * 根据请求的url地址使用已创建的httpClient获取返回值
	 * <p>
	 * @author zhuyuyin 2015年12月23日 下午11:22:15
	 * @param httpClient
	 * @param url
	 * @return 返回 xml或json格式数据
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static String get(HttpClient httpClient,String url) throws ClientProtocolException, IOException{
		HttpResponse response = httpClient.execute(new HttpGet(url));
		return response.toString();
	}
}

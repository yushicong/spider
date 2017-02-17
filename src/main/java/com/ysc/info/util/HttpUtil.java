package com.ysc.info.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.*;
import java.net.*;

/**
 * <b>类描述：</b><br/>  
 * <b>@author </b>yushicong<br/>  
 * <b>修改时间：</b>Apr 26, 2012 9:46:22 AM<br/> 
 * <b>修改备注：</b><br/> 
 *
 */
public class HttpUtil {

	private static final Logger logger = Logger.getLogger(HttpUtil.class);

	private static HttpUtil instance;

	private HttpUtil() {

	}

	public static synchronized HttpUtil getInstance() {
		if (instance == null) {
			instance = new HttpUtil();
		}
		return instance;
	}

	/** post发送http请求，获取字符串数据
	 * 
	 * @param    URL
	 * @return
	 */
	public  String sendUrlOfPost(String urlBody,String urlParam){
		URL url = null;
		StringBuffer sResult = new StringBuffer();
		HttpURLConnection httpConnection = null;
		InputStream httpIS = null;
		BufferedReader http_reader = null;
		try {
			url = new URL(urlBody);
			httpConnection = (HttpURLConnection) url.openConnection();
			
			// 设置连接主机超时(单位:毫秒)
			httpConnection.setConnectTimeout(30000);
			// 设置从主机读取数据超时(单位:毫秒)
			httpConnection.setReadTimeout(30000);

			httpConnection.setRequestMethod("POST"); // POST方式提交数据
			httpConnection.setDoOutput(true);
			PrintWriter out = null;
			out = new PrintWriter(new OutputStreamWriter(httpConnection.getOutputStream(), "UTF-8"));
			out.write(urlParam);
			// 发送请求
			out.flush();
			out.close();
			int responseCode = httpConnection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				// 发送正常
				// 读取数据
				httpIS = httpConnection.getInputStream();
				http_reader = new BufferedReader(new java.io.InputStreamReader(httpIS, "UTF-8"));
				String line = null;
				while ((line = http_reader.readLine()) != null) {
					//if (sResult.length() > 0) {
					//	sResult.append("\n");
					//}
					sResult.append(line);
				}
				logger.debug("[URL][response][success]" + sResult);
			} else {
				logger.info("[URL][response][failure][code : " + responseCode + " ]");
			}
		} catch (IOException e) {
			logger.error("[HttpUtil]sendStrOfPost error", e);
		} finally {
			try {
				if (http_reader != null)
					http_reader.close();
				if (httpIS != null)
					httpIS.close();
				if (httpConnection != null)
					httpConnection.disconnect();
			} catch (IOException e) {
				logger.error("[HttpUtil]finally error", e);
			}
		}
		return sResult.toString();
	}


	/**
	 * 发送GET请求
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public String sendUrlOfGet(String request) throws Exception {
		URL url = null;
		StringBuffer sResult = new StringBuffer();
		HttpURLConnection httpConnection = null;
		InputStream httpIS = null;
		BufferedReader http_reader = null;
		try {
			url = new URL(request);
			httpConnection = (HttpURLConnection) url.openConnection();
			httpConnection.setConnectTimeout(120000);
			httpConnection.setReadTimeout(120000);
			httpConnection.setRequestMethod("GET"); // Get方式提交数据
			httpConnection.setDoOutput(true);
			int responseCode = httpConnection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				httpIS = httpConnection.getInputStream();
				http_reader = new BufferedReader(new java.io.InputStreamReader(httpIS, "UTF-8"));
				String line = null;
				while ((line = http_reader.readLine()) != null) {
					/*if (sResult.length() > 0) {
						sResult.append("\n");
					}*/
					sResult.append(line);
				}
				logger.debug("[URL][response][success]" + sResult);
			} else {
				logger.info("[URL][response][failure][code : " + responseCode + " ]");
			}
		} finally {
			try {
				if (http_reader != null)
					http_reader.close();
				if (httpIS != null)
					httpIS.close();
				if (httpConnection != null)
					httpConnection.disconnect();
			} catch (IOException e) {
				logger.error("[HttpUtil]finally error", e);
			}
		}
		return sResult.toString();
	}
	/**
	 * 发送GET请求
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public String sendUrlOfGetProxy(String request) throws Exception {
		URL url = null;
		StringBuffer sResult = new StringBuffer();
		HttpURLConnection httpConnection = null;
		InputStream httpIS = null;
		BufferedReader http_reader = null;
		try {
			url = new URL(request);
			Thread.sleep(100);
			String ipProxy = HttpProxy.getNewInstance().getRandomHost();
			int portProxy = HttpProxy.getNewInstance().getPort();
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ipProxy, portProxy));
			httpConnection = (HttpURLConnection) url.openConnection(proxy);
			httpConnection.setConnectTimeout(120000);
			httpConnection.setReadTimeout(120000);
			httpConnection.setRequestMethod("GET"); // Get方式提交数据
			httpConnection.setDoOutput(true);
			int responseCode = httpConnection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				httpIS = httpConnection.getInputStream();
				http_reader = new BufferedReader(new java.io.InputStreamReader(httpIS, "UTF-8"));
				String line = null;
				while ((line = http_reader.readLine()) != null) {
					/*if (sResult.length() > 0) {
						sResult.append("\n");
					}*/
					sResult.append(line);
				}
				logger.debug("[URL][response][success]" + sResult);
			} else {
				logger.info("[URL][response][failure][code : " + responseCode + " ]");
			}
		} finally {
			try {
				if (http_reader != null)
					http_reader.close();
				if (httpIS != null)
					httpIS.close();
				if (httpConnection != null)
					httpConnection.disconnect();
			} catch (IOException e) {
				logger.error("[HttpUtil]finally error", e);
			}
		}
		if(StringUtils.isBlank(sResult.toString())){
			Thread.sleep(50000);
			this.sendUrlOfGetProxy(request);
		}
		return sResult.toString();
	}
	
	/**
	 * 
	 * @Description: 获得到第一个url的第一个界面跳转第二个界面的url
	 * @author yushicong
	 * @data 2014-11-14 下午05:57:40
	 */
	public String getRedirectedURL(String url){
		String finalLocation = url;
		CloseableHttpClient httpclient = null;
		HttpGet httpget = null;
		CloseableHttpResponse response = null;
		try {
			httpclient = HttpClients.createDefault();	
			httpget = new HttpGet(url);
			HttpClientContext httpClientContext = HttpClientContext.create();
			response = httpclient.execute(httpget, httpClientContext);
			
			URI location = URIUtils.resolve(httpget.getURI(), httpClientContext
					.getTargetHost(), httpClientContext.getRedirectLocations());
			finalLocation = location.toASCIIString();
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				if (null != response) {
					response.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return finalLocation;
	}
	
	/**
	 * 
	 * @Description: 判断第一个url界面是否有跳转到第二个界面 
	 * @author yushicong
	 * @data 2014-11-14 下午05:57:40
	 */
	public boolean httpRequestRedirected(String url){
		boolean isRedirected = false;
		String finalLocation = getRedirectedURL(url);
		if(null == finalLocation || !url.trim().equalsIgnoreCase(finalLocation)){
			isRedirected = true;
		}
		return isRedirected;
	}
	
	/**
	 * GET请求获取JSON数据
	 * @param url
	 * @return
	 */
	public static String getJsonStringFromUrl(String url) throws Exception{
		@SuppressWarnings("deprecation")
		HttpClient client = new org.apache.http.impl.client.DefaultHttpClient();
		HttpGet get = new HttpGet(url);
		HttpResponse response = client.execute(get);
		HttpEntity entity = response.getEntity();
		return EntityUtils.toString(entity);
	}
	
	public static void main(String[] args) throws Exception{
		String info = new HttpUtil().sendUrlOfGetProxy("http://www.tvmao.com/program/GUANXI-GUANXI1-20120102.html");
		System.out.println(info);
	}
}

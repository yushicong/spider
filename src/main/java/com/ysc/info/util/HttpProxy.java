package com.ysc.info.util;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.apache.log4j.Logger;

import java.net.URL;
import java.util.Random;

/**
 * Http代理 ip类
 * 
 */
public class HttpProxy {
	private Logger logger = Logger.getLogger(this.getClass());
	private static HttpProxy httpProxy = new HttpProxy();  
	private static int port = 8181;	 //代理端口号，默认8181
	//当前轮转坐标
	private static int proxyIpNum = -1;
	//可用代理ip列表
	private static String[] proxyIps = new String[] { 			    		
	"10.11.11.12",
	"10.31.1.31",
	"10.31.101.55",
	"10.35.25.32",
	"10.36.41.32",
	"10.43.4.32",
	"10.51.1.31"
	};
	
	private HttpProxy(){}
	
	public static HttpProxy getNewInstance(){
		if(httpProxy == null){
			httpProxy = new HttpProxy();
		}
		return httpProxy;
	}
	/**
	 * 随机形式获得ip
	 */
	private String getRandomIp() {
		int ipCount = proxyIps.length;
		Random random = new Random();
		return proxyIps[random.nextInt(ipCount)];
	}	
	/**
	 * 轮转形式获得ip
	 */
	private String getOrderIp() {
		if(proxyIpNum == proxyIps.length - 1){
			proxyIpNum = -1;
		}
		proxyIpNum = proxyIpNum + 1;
		logger.info("-----------------Proxy ip: "+proxyIps[proxyIpNum]+" -----------------------");
		return proxyIps[proxyIpNum];
	}
	/**代理 ip地址(无序)*/
	public String getRandomHost() {
		return getRandomIp();
	}
	/**代理 ip地址(有序)*/
	public String getOrderHost() {
		return getOrderIp();
	}
	/**代理 ip端口号*/
	public int getPort() {
		return port;
	}
	public void test1() throws Exception{
	   String url="http://tv.cntv.cn/index.php?action=zhibo-jiemu3&channel=btv1&date=2011-01-01";//想采集的网址
	   WebClient wc = WebClientUtil.getNewInstanceProxy();
	   Page page = wc.getPage(url);
       System.out.println(page.getWebResponse().getContentAsString());
	}
	public void test2(String ip) throws Exception{
		String  url="http://tv.cntv.cn/index.php?action=zhibo-jiemu3&channel=btv1&date=2011-01-01";//想采集的网址
	    URL link=new URL(url); 
	    WebClient wc=new WebClient();
	    WebRequest request=new WebRequest(link); 
	    request.setCharset("UTF-8");
	    request.setProxyHost(ip);
	    request.setProxyPort(8181);
	    request.setAdditionalHeader("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:6.0.2) Gecko/20100101 Firefox/6.0.2");
	    wc.getOptions().setJavaScriptEnabled(true);//开启js解析。对于变态网页，这个是必须的
	    wc.getOptions().setCssEnabled(false);
	    wc.getOptions().setThrowExceptionOnFailingStatusCode(false);
	    wc.getOptions().setThrowExceptionOnScriptError(false);
	    wc.getOptions().setTimeout(30000);
	    //准备工作已经做好了
	    HtmlPage page=null;
	    page = wc.getPage(request);
	    System.out.println(page.getWebResponse().getContentAsString());
	}
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < proxyIps.length; i++) {
			new HttpProxy().test2(proxyIps[i]);
		}
/*		for(int i = 0; i < 20; i++){
			WebClient wc = WebClientUtil.getNewInstanceProxy();
		}*/
//		new HttpProxy().test2("10.35.25.32");
	}
	
}
package com.ysc.info.util;

import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;


public class WebClientUtil {
	private Logger logger = Logger.getLogger(this.getClass());
	private WebClientUtil(){};
	
	public static WebClient getNewInstance(){
		return newWebClient(false);
	}
	
	public static WebClient getJavaScriptEnabledNewInstance(){
		return newWebClient(true);
	}
	
	private static WebClient newWebClient(boolean javaScriptEnabled){
		WebClient webClient = new WebClient();
		webClient.getOptions().setJavaScriptEnabled(javaScriptEnabled);
		webClient.waitForBackgroundJavaScript(3000);
		webClient.getOptions().setCssEnabled(false);
		webClient.setAjaxController(new NicelyResynchronizingAjaxController());
		webClient.getOptions().setTimeout(30000);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		return webClient;
	}

	public static WebClient getNewInstanceProxy(){
		return newWebClientProxy(false);
	}
	
	public static WebClient getJavaScriptEnabledNewInstanceProxy(){
		return newWebClientProxy(true);
	}
	/**
	 * 
	 * @Description:  代理iP(ip有限)慎用
	 * @author yushicong
	 * @data 2014-12-2 下午04:29:56
	 */
	private static WebClient newWebClientProxy(boolean javaScriptEnabled){
		String ipProxy = HttpProxy.getNewInstance().getRandomHost();
		int portProxy = HttpProxy.getNewInstance().getPort();
		WebClient webClient = new WebClient(BrowserVersion.CHROME,ipProxy,portProxy);
		webClient.getOptions().setJavaScriptEnabled(javaScriptEnabled);
		webClient.waitForBackgroundJavaScript(3000);
		webClient.getOptions().setCssEnabled(false);
		webClient.setAjaxController(new NicelyResynchronizingAjaxController());
		webClient.getOptions().setTimeout(30000);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		return webClient;
	}
	/**
	 *
	 * @Description:  自行拼接的请求头
	 * @author yushicong
	 * @data 2014-12-2 下午04:29:56
	 */
	public static WebClient pingWriteClientProxy(){
		String ipProxy = HttpProxy.getNewInstance().getRandomHost();
		int portProxy = HttpProxy.getNewInstance().getPort();
		WebClient webClient = new WebClient(BrowserVersion.FIREFOX_24,ipProxy,portProxy);
		webClient.getOptions().setJavaScriptEnabled(false);
		webClient.getOptions().setCssEnabled(false);
		webClient.setWebConnection(new HttpWebConnection(webClient) {
			public WebResponse getResponse(WebRequest request) throws IOException {
				if(request.getHttpMethod() == HttpMethod.POST) {
					request.removeAdditionalHeader("Cache-Control");
				}
				else {
					request.setAdditionalHeader("Cache-Control","max-age=0");
				}
				WebResponse response = super.getResponse(request);
				return response;
			}
		});
		webClient.addRequestHeader("Host", "tv.sohu.com");
		webClient.addRequestHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64; rv:43.0) Gecko/20100101 Firefox/43.0");
		webClient.addRequestHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		webClient.addRequestHeader("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");
		webClient.addRequestHeader("Accept-Encoding", "gzip, deflate");
		webClient.addRequestHeader("Connection", "keep-alive");
		return webClient;
	}
	/**
	 * 功能描述: 获取对应URL的资源，默认10次重试机会<br/> 
	 * @param _webCilent
	 * @param URL
	 * @return 
	 * @author yushicong
	 * 日期:Sep 15, 2014 2:43:42 PM
	 */
	public static HtmlPage getPage(WebClient _webCilent,String URL){
		return getPage(_webCilent,URL,10);
	}
	
	public static HtmlPage getPage(WebClient _webCilent,String URL,int trytimes){
		HtmlPage page = null;
		while(trytimes > 0 ){
			try{
				page = _webCilent.getPage(URL);
				break;
			}catch(Exception e){
				trytimes--;
			}
		}
		if(null == page){

		}
		return page;
	}
	
	
	public static String getNodeListValue(List<DomNode> nodeList){
		if(null != nodeList && nodeList.size() != 0){
			StringBuffer sb = new StringBuffer();
			for(DomNode node: nodeList){
				if(sb.length() > 0){sb.append(",");}
				sb.append(node.asText());
			}
			return sb.toString();
		}
		return null;
	}
	
}

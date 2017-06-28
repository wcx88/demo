package com.wcx.mod.common.utils;

import javax.servlet.ServletContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


public class SpringUtil 
{
//	public static Object getBean(ServletContext sc,String beanName)
//	{
//		WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(sc);
//		return wac.getBean(beanName);
//	}
	
	
	public static WebApplicationContext context = null;
	
	public static void getInstance(ServletContext sc) {
		// servlet方式加载("springMVC"是你的servlet-name配置的值)
		//context = (WebApplicationContext) sc.getAttribute("org.springframework.web.servlet.FrameworkServlet.CONTEXT.springMVC");

		// listener方式加载
		//context = WebApplicationContextUtils.getWebApplicationContext(sc);
		
		// 文件方式
		//context = (WebApplicationContext) new ClassPathXmlApplicationContext("spring/applicationContext.xml");

	}
	
	public static WebApplicationContext getContext() {
		if(context==null){
			context = ContextLoader.getCurrentWebApplicationContext();
		}
		return context;
	}
	public static Object getBean(String beanName) {
		return getContext().getBean(beanName);
	}
}

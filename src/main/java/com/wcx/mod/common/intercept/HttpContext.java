package com.wcx.mod.common.intercept;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 该类封装着当前请求的HttpServletRequest对象和HttpServletResponse对象。
 * 
 * @author 
 *
 */
public final class HttpContext {
	private static final ThreadLocal<HttpContext> LOCAL_HTTP_CONTEXT = new ThreadLocal<HttpContext>();
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	private HttpContext() {
	}
	
	static void set(HttpServletRequest request, HttpServletResponse response) {
		HttpContext context = new HttpContext();
		context.request = request;
		context.response = response;
		LOCAL_HTTP_CONTEXT.set(context);
	}
	
	static void remove() {
		LOCAL_HTTP_CONTEXT.remove();
	}
	
	public static HttpServletRequest getRequest() {
		return LOCAL_HTTP_CONTEXT.get().request;
	}
	
	public static HttpServletResponse getResponse() {
		return LOCAL_HTTP_CONTEXT.get().response;
	}
}

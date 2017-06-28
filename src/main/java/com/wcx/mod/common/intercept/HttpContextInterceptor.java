package com.wcx.mod.common.intercept;

import static com.wcx.mod.common.intercept.HttpContext.remove;
import static com.wcx.mod.common.intercept.HttpContext.set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 该拦截器设置和删除HTTP上下文。
 * 
 * @author 
 *
 */
public class HttpContextInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		set(request, response);
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		remove();
	}
}

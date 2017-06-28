package com.wcx.mod.common.intercept;


import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSONObject;

/**
 * 该拦截器拦截会话
 * 
 * @author 
 *
 */
public class LoginSessionInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if(request.getSession().getAttribute("logonUser") == null) {
		    if("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
				PrintWriter out = response.getWriter();
				JSONObject json = new JSONObject();
				json.put("code", -9);
				json.put("note", "会话过期");
				out.print(json.toJSONString());
			} else {
				request.getRequestDispatcher("/login/timeout").forward(request, response);
			}
        	return false;
		}
		return true;
	}
	
}

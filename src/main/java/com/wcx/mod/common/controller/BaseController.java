package com.wcx.mod.common.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wcx.mod.common.intercept.HttpContext;

public abstract class BaseController {
	protected static final Logger log = Logger.getLogger(BaseController.class);
	public String json(Object obj) {
		printString(getResponse(), JSONObject.toJSONString(obj));
		return null;
	}

	public String json(JSONObject json) { 
		printJSON(getResponse(), json);
		return null;
	}

	public String json (JSONArray json) {
        printJSON(getResponse(), json);
        return null;
    }
	

	public static HttpServletRequest getRequest(){
		return HttpContext.getRequest();
	}
	public static HttpServletResponse getResponse(){
		return HttpContext.getResponse();
	}
	
	public static HttpSession getSession(){
		return HttpContext.getRequest().getSession();
	}
	
	/**
	 * ajax return json
	 * @param response
	 * @param jsonArray
	 */
	protected void printJSON(HttpServletResponse response, JSONObject json){
		PrintWriter out = null;
		try{
			out = response.getWriter();
			out.print(json.toJSONString());
		}catch (Exception e){
			log.error(e.getMessage());
		}
		finally{
			out.close();
		}
	}
	
	/**
	 * ajax return json
	 * @param response
	 * @param jsonArray
	 */
	protected void printJSON(HttpServletResponse response, JSONArray json){
		PrintWriter out = null;
		try{
			out = response.getWriter();
			out.print(json.toJSONString());
		}catch (Exception e){
			log.error(e.getMessage());
		}
		finally{
			out.close();
		}
	}
	
	/**
	 * ajax return string
	 * @param response
	 * @param object
	 */
	protected void printString(HttpServletResponse response, String str){
		PrintWriter out  = null;
		try{
			out = response.getWriter();
			out.print(str);
		}
		catch (Exception e){
			log.error(e.getMessage());
		}
		finally{
			out.close();
		}
	}

}

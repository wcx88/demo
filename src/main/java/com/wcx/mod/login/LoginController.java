package com.wcx.mod.login;

import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wcx.mod.common.controller.BaseController;
import com.wcx.mod.common.utils.SpringUtil;
import com.wcx.mod.user.entity.UserEntity;
import com.wcx.mod.user.service.UserService;


@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{
	@RequestMapping("/index")
	public String index (HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
		return "login/login";
	}
	
	@RequestMapping("/timeout")
	public String timeout (HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
		return "login/timeout";
	}
	@RequestMapping("/logout")
	public String logout (HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
		request.getSession().removeAttribute("logonUser");
		return "login/login";
	}

	@RequestMapping("/login")
	public String login (HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		modelMap.put("userId", userId);

		UserService userService =(UserService)SpringUtil.getBean("userService");
		UserEntity user = userService.getUser(userId);
		if(user != null) {
			if(password != null && password.equals(user.getPassword())) {
				modelMap.put("message", "登录成功");
				user.setLastLoginTime(new Timestamp(System.currentTimeMillis()));
				userService.updateUser(user);
				request.getSession().setAttribute("logonUser", user);
				
				return "user/user_index";
			} else {
				modelMap.put("message", "密码不正确");
			}
		} else {
			modelMap.put("message", "用户不存在");
		}
		return "login/login_detail";
	}
}

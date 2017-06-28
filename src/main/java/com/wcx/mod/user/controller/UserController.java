package com.wcx.mod.user.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.wcx.mod.common.controller.BaseController;
import com.wcx.mod.common.utils.SpringUtil;
import com.wcx.mod.user.entity.UserEntity;
import com.wcx.mod.user.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
	
	@RequestMapping("/index")
	public String index (ModelMap modelMap) {
		HttpServletRequest req = getRequest();
		HttpServletResponse resp = getResponse();
		System.out.println("test66");
		modelMap.put("name", "wcx66");
		return "user/user_index";
	}
	@RequestMapping("/{userId}/get")
	@ResponseBody
	public void getUser (@PathVariable String userId) {
		log.info("getUser111" + userId);
		UserService userService =(UserService)SpringUtil.getBean("userService");
		UserEntity user = userService.getUser(userId);
		json(user);
	}
	
	@RequestMapping("/{userId}/update")
	@ResponseBody
	public void updateUser (@PathVariable String userId) {
		log.info("updateUser" + userId);
//		UserBean user = (UserBean) SpringUtil.getBean("user");
//		user.setUserId(user.getUserId() + "-->" + userId);
//		user.setLastLoginTime(new Date());
//		json(user);
	}

	@RequestMapping("/list")
	public String userList (ModelMap modelMap) {
		return "user/user_list";
	}
	@RequestMapping("/list/{pageNo}/{pageSize}")
	@ResponseBody
	public void queryUserList (@PathVariable int pageNo, @PathVariable int pageSize) {
		UserService userService =(UserService)SpringUtil.getBean("userService");
		List<UserEntity> list = userService.queryUserList(pageNo, pageSize);
		JSONObject jsonRet = new JSONObject();
		jsonRet.put("code", 1);
		jsonRet.put("note", "ok");
		jsonRet.put("records", list);
		jsonRet.put("totalcount", userService.queryUserListCount());
		json(jsonRet);
	}
}

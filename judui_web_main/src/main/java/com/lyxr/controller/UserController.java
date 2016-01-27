package com.lyxr.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lyxr.domain.JuduiUser;
import com.lyxr.output.ResultProxy;
import com.lyxr.service.UserService;
import com.lyxr.util.Common;
import com.lyxr.util.JsonHelper;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	private ResultProxy resultProxy;
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * 用户登录
	 * @param name
	 * @param pwd
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/login")
	public String login(@RequestParam("username")String name ,@RequestParam("password")String pwd,HttpServletRequest request,HttpServletResponse response) throws IOException{
		resultProxy = new ResultProxy();
		try {
			JuduiUser juduiUser =  userService.login(name, pwd);
			if(juduiUser!=null){
				request.setAttribute("user", juduiUser);
				resultProxy.setCode(Common.Code.SUCCESS);
				resultProxy.setInfo( JsonHelper.toJsonStr(juduiUser));
				resultProxy.setMsg(Common.Msg.SUCCESS);
				logger.info("用户登录成功");
			}else{
				resultProxy.setCode(Common.Code.ERROR);
				resultProxy.setInfo("用户名或密码错误");
				resultProxy.setMsg(Common.Msg.FAILURE);
				logger.info("用户为null");
			}
		} catch (Exception e) {
			resultProxy.setCode(Common.Code.ERROR);
			resultProxy.setInfo("用户名或密码错误");
			resultProxy.setMsg(Common.Msg.FAILURE);
			logger.info("用户名或密码错误");
			e.printStackTrace();
		}
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print(JsonHelper.toJsonStr(resultProxy));
		return null;
	}
	
	
}

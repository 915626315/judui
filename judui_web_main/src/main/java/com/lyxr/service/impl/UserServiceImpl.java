package com.lyxr.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyxr.IDao.JuduiUserMapper;
import com.lyxr.domain.JuduiUser;
import com.lyxr.service.UserService;
import com.lyxr.util.MD5Util;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private JuduiUserMapper juduiUserMapper;
	
	public JuduiUser login(String username, String password) {
		JuduiUser juduiUser = juduiUserMapper.islogin(username, MD5Util.string2MD5(password));
		return juduiUser;
	}

}

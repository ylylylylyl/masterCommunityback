package com.yangling.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangling.mapper.UserMapper;
import com.yangling.pojo.User;
import com.yangling.service.UserService;
import com.yangling.utils.UUIDUtils;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	public String regist(User user) {
		// TODO Auto-generated method stub
		
		user.setId(UUIDUtils.getNumUUID());
		userMapper.insertSelective(user);
		
		return "success";
	}
}

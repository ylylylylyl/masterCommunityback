package com.yangling.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yangling.pojo.Result;
import com.yangling.pojo.User;
import com.yangling.service.UserService;

@Controller("userControllor")
@RequestMapping("/user")
public class userControllor {
	@Autowired
	UserService us;
	@Autowired 
	Result result;
	@Autowired
	User user;
//	@RequestMapping("/regist")
//	@ResponseBody
	public String regist() {
//		System.out.println(name);
		
		return "222";

		
	}
//	public Result regist(User user) {
//		System.out.println(user.getName());
//		String r = us.regist(user);
//		if(r.equals("success")) {
//			result.setCode("200");
//			result.setMsg("�ɹ�");
//		}else {
//			result.setCode("201");
//			result.setMsg("ʧ��");
//		}
//		return result;
//
//		
//	}
	@RequestMapping("/ttt")
	@ResponseBody
	public String ttt(String id) {
		System.out.println(id);
		return "22"+id;

		
	}
	@RequestMapping(value = "/regist", method = RequestMethod.POST,produces="application/json;charset=utf-8")
	@ResponseBody
	public Result login(@RequestBody Map map) {
		String username = (String) map.get("name");
		String pwd = (String)map.get("pwd");
		System.out.println(username);
		user.setName(username);
		user.setPwd(pwd);
		String r = us.regist(user);
		if(r.equals("success")) {
			result.setCode("200");
			result.setMsg("成功");
		}else {
			result.setCode("201");
			result.setMsg("失败");
		}
		System.out.println(result);
		return result;

		
	}
}

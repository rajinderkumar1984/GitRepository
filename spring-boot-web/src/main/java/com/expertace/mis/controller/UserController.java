package com.expertace.mis.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@GetMapping("/user-list")
	public String userList(Map<String, Object> model) {
		return "user-list";
	}

	@GetMapping("/edit-user")
	public String editUser(Map<String, Object> model) {
		return "edit-user";
	}

	@PostMapping("/save-user")
	public @ResponseBody String saveUser(Map<String, Object> model) {
		return "{'status':'success','operation':'delete-user','user-id':'123120'}";
	}

	@PostMapping("/delete-user")
	public @ResponseBody String deleteUser(Map<String, Object> model) {
		return "{'status':'success','operation':'delete-user','user-id':'123120'}";
	}
}
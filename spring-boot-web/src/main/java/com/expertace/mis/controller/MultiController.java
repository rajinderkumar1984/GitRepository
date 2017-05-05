package com.expertace.mis.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MultiController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@GetMapping("/")
	public String dashBoard(Map<String, Object> model) {
		return "dash-board";
	}

	@GetMapping("/notice-board")
	public String noticeBoard(Map<String, Object> model) {
		return "notice-board";
	}
}
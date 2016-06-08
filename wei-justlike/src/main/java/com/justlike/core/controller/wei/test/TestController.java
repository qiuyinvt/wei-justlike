package com.justlike.core.controller.wei.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wei/test")
public class TestController {
	
	@RequestMapping("/hello")
	public String toIndex(HttpServletRequest request,Model model){		
		System.out.println("haha");		
		return "wei/test/hello";
	}
}

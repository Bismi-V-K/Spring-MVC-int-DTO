package com.bismi.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bismi.lc.api.DtoClass;

@Controller
public class AppController {

	@RequestMapping("/")
	public String home() {
		return "home-page";
	}
	
	@RequestMapping("/process")
	public String resultpage(DtoClass dto,Model model) {
		System.out.println("username is "+dto.getUserName());
		System.out.println("crushname is "+dto.getCrushName());
		model.addAttribute("userinfo",dto);
		return "res-page";
	}
}

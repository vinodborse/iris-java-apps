package com.vinod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/sample-vinod")
	public ModelAndView m1() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("sample.jsp");
		mv.addObject("result", "VINOD is here......");
		System.out.println("VINOD is here......");
		return mv;
	}
}

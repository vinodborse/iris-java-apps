package com.vinod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping("/sample")
	public ModelAndView sampleMethod1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sample.jsp");
		mv.addObject("result", "We are in sample method1......");
		System.out.println("We are in sample method1......");
		return mv;
	}
	
	public void sampleMethod2() {
		System.out.println("We are in sample method2......");
	}
	
	public void sampleMethod3() {
		System.out.println("We are in sample method3......");
	}
}

package com.reddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class AdminController {

	@RequestMapping("/welcome")
	public String helloWorld(){
 
		ModelAndView model = new ModelAndView("AdminLogin");
		//model.addObject("msg", "hello world");
 
		return "AdminLogin";//new ModelAndView("AdminLogin","name","Narasimha reddy");
	}
	
	/*@RequestMapping("/login")
	public String helloWorld1( Model model){
	//	ModelAndView model1 = new ModelAndView("loginpage.html");
		//model.setViewName("loginpage");
	//	model1.addObject("message", "my name");
		model.addAttribute("message", "hello world");
		 System.out.println("Narasimha");
		return "loginpage";// new ModelAndView("AdminLogin.html","name","Narasimha reddy");
	}*/
}

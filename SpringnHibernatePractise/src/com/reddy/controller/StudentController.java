package com.reddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reddy.bean.Login;
import com.reddy.bean.Register;


@Controller("/SpringnHibernatePractise")
public class StudentController {
	
	@RequestMapping("/register")
	public String getRegisterpage(ModelMap map)
	{
		System.out.println("register");
		Register rb=new Register();
		map.addAttribute("reg", rb);
		
		return "Register";

}
	@RequestMapping("/login")
	public String getloginpage(ModelMap map)
	{
		System.out.println("login");
		Login lb=new Login();
		map.addAttribute("log", lb);
		
		return "Login";
	}
}



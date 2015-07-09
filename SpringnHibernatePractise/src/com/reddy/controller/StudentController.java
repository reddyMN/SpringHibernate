package com.reddy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.reddy.bean.Login;
import com.reddy.bean.Register;
import com.reddy.service.StudentService;


@Controller("/SpringnHibernatePractise")
public class StudentController {
	
	
	@Autowired   
	private StudentService studentservice;

	
	@RequestMapping("/register")
	public String getRegisterpage(ModelMap map)
	{
		System.out.println("register view");
		Register rb=new Register();
		map.addAttribute("reg", rb);
		
		return "Register";

}
	@RequestMapping("/login")
	public String getloginpage(ModelMap map)
	{
		System.out.println("login view");
		Login lb=new Login();
		map.addAttribute("log", lb);
		
		return "Login";
	}
	
	@RequestMapping(value = "/reguser", method = RequestMethod.GET)
    public String save(@ModelAttribute("reg") Register reg, BindingResult result) {
		System.out.println("hello");
 
		studentservice.save(reg);
 
        return "Registration"; 
	
	
	
}
}



package com.malith.rti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.malith.rti.model.User;



@Controller
public class LoginController {

	@RequestMapping(value="/" , method=RequestMethod.GET)
	public ModelAndView portal(){
		return new ModelAndView("index" , "command" , new User());
	}
	
	@RequestMapping(value ="/login" , method=RequestMethod.POST)
	public String login(@ModelAttribute("SpringWeb") User user , ModelMap model){
		
		System.out.println(user.getUsername());
		return "mainFrameAdminPanel";
	}
	
}

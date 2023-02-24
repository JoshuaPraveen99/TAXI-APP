package com.uc.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uc.businessbean.Loginbean;
import com.uc.entity.LoginEntity;
import com.uc.service.LoginService;

public class LoginController {
	@Autowired
	LoginService ls;
	
	@RequestMapping(value="Login.html", method=RequestMethod.GET)
	public ModelAndView showLogin() {
		ModelAndView mv=new ModelAndView();
		System.out.println("Loginmethod processed");
		mv.setViewName("loginpage");
		mv.addObject("loginbean", new Loginbean());
		return mv;
		
	}
	@RequestMapping(value = "/ValidateLogin", method = RequestMethod.POST)
	public ModelAndView validateLoginDetails(@Valid @ModelAttribute("loginBean") Loginbean loginbean,
			BindingResult bindingresult) throws Exception {
		ModelAndView mv = new ModelAndView();
		if (bindingresult.hasErrors())
			mv.setViewName("LoginPage");
		else {
			String us = loginbean.getUsername();
			String pw = loginbean.getPassword();
			LoginEntity le = ls.validLogin(us);
			// System.out.println(le.getPassWord() + " " + le.getUserName() + " " + us + " "
			// +pw);

			if (le != null && le.getPassWord().equals(pw)) {
				mv.setViewName("Welcome");
				mv.addObject("message", "Welcome " + us);
			} else {
				System.out.println("not correct");
				mv.setViewName("LoginPage");
				mv.addObject("message", "Please Enter the valid credentials");
			}
		}


		return mv;
}
	}





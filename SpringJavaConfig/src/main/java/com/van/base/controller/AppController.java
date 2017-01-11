package com.van.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	MessageSource messageSource;

	/**
	 * This method will list all existing users.
	 */
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {
		model.addAttribute("helloMessage", "Spring with java... configuration base template");
		return "index";
	}

}
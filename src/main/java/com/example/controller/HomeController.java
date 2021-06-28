package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.InquiryForm;

@Controller
@RequestMapping("")
public class HomeController {
	
	@ModelAttribute
	public InquiryForm setUpForm() {
		return new InquiryForm();
	}
	
	@RequestMapping("/index")
	public String index(Model model, InquiryForm inquiryForm) {
		return "index";
	}
	
	@RequestMapping("/confirm")
	public String confirm(
			@Validated
			Model model,
			InquiryForm inquryForm,
			BindingResult result) {
		
		if(result.hasErrors()) {
			return "index";
		}
		
			return "confirm";
		
	}

}

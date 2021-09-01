package com.example.agecheck.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class ageController {
	@RequestMapping("/hello")
	public String agecheck(@RequestParam (value = "age") String age,
						@RequestParam(value = "name") String name, Model model){
		model.addAttribute("age",age);
		model.addAttribute("name",name);
		return "hello";
	}

}

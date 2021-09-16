package com.example.studentlist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.studentlist.domain.StudentRepository;


@Controller
public class studentsController {
	@Autowired
	private StudentRepository repository;
	
	@RequestMapping("/hello")
	public String studentList(Model model ) {
		model.addAttribute("students", repository.findAll());
		return "studentlist";
	}

}

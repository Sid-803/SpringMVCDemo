package com.greatlearning.springMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.springMVCDemo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//create object of student
		Student theStudent = new Student();
		theModel.addAttribute("student",theStudent);
		return "student-form";
		
	}
	@RequestMapping("/processForm") //ModelAttribute accepts data from form
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("TheStudent: " +theStudent.getFirstName());
		return"student-confirmation";
	}
}

package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Service.StudentService;

@Controller
public class StudentController {

	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//Handler Method to handle list student and return mode and view
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", StudentService.getAllStudents());
		return "students";
		
		
	}
}

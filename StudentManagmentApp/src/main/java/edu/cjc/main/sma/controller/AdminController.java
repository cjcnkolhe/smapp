package edu.cjc.main.sma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.main.sma.model.Student;
import edu.cjc.main.sma.servicei.StudentServiceI;

@Controller
public class AdminController {
	@Autowired
	StudentServiceI ssi;
	@RequestMapping("/")
	public String prelogin() {
		return "login";
	}

	
	@RequestMapping("/login")
	public String onLogin(@RequestParam String username,@RequestParam String password,Model m) {
		
		if(username.equals("ADMIN") && password.equals("ADMIN")) {
			return "adminscreen";
		}
		else 
		
		{
			Student s=ssi.loginStudent(username, password);
			 if(s!=null) {
				 return "studentview";
			 }
			 else {
				 m.addAttribute("login_fail","Enter valid login details");
					return "login";
			 }
		}
	}
	
	@RequestMapping("/enroll_student")
	public String saveStudent(@ModelAttribute Student s) {
		
		ssi.saveStudentDetails(s);
		return "adminscreen";
	}
	
	
	
	
	
}

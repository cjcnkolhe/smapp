package edu.cjc.main.sma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.cjc.main.sma.model.EquiryFrom;
import edu.cjc.main.sma.servicei.StudentServiceI;

@Controller
public class EnquiryController {

	@Autowired
	private StudentServiceI ssi;
	
	@RequestMapping("/equiry")
	public String EquieryFrom() {
		return "equiry";
	}
	
	@RequestMapping("/saveequiry")
	public String saveEquieryFrom(@ModelAttribute EquiryFrom e) {
		ssi.saveEquiryForm(e);
		return "login";
	}
}

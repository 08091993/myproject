package com.vanitha.studentadmissioncontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController  {
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[] {"studentMobile"});
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM**dd");
//		binder.registerCustomEditor(Date.class,"studentDOB", new CustomDateEditor(dateFormat, false));
//		binder.registerCustomEditor(String.class,"studentName", new StudentNameEditor());
	}
		
	@RequestMapping(value ="/admissionForm.html", method = RequestMethod.GET)
     public ModelAndView getAdmissionForm(){
		 
		ModelAndView model = new ModelAndView("AdmissionForm");
		//model.addObject("headerMessage", "GITAM UNIVERSITY INDIA");
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage", "GITAM UNIVERSITY INDIA");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result ){
		//@RequestParam Map<String,String> reqPar
		//String name = reqPar.get("studentName");
		//String hobby = reqPar.get("studentHobby");
		
//		Student student1 = new Student();
//		student1.setStudentName(name);
//		student1.setStudentHobby(hobby);
	   if(result.hasErrors()){
		   ModelAndView model = new ModelAndView("AdmissionForm");
		   return model;
	   }
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		//model.addObject("headerMessage", "GITAM UNIVERSITY INDIA");
		//model.addObject("student1", student1);
		return model;
	}
}

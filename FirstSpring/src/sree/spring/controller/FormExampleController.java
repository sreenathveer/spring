package sree.spring.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class FormExampleController {
	
	@InitBinder
	public void InitBinder(WebDataBinder binder){
		
		binder.setDisallowedFields(new String[]{"phoneNumber"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
		binder.registerCustomEditor(Date.class, "dateOfBirth", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "name", new UserNameEditor());
	}

	@RequestMapping(value="/loadForm.html", method=RequestMethod.GET)
	public ModelAndView loadForm(){
		ModelAndView model = new ModelAndView("FormExample");
		return model;
	}
	
	@RequestMapping(value="/SubmitForm.html", method=RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam Map<String, String> reqPar){
		
		String name = reqPar.get("name");
		String password = reqPar.get("password");
		
		ModelAndView model = new ModelAndView("FormSuccess");
		model.addObject("successMessage", "Form data " +name+" password "+password);
		return model;
		
	}
	
	@RequestMapping(value="/SubmitForm1.html", method=RequestMethod.POST)
	public ModelAndView submitFormWithParams(@RequestParam("name") String name, 
												@RequestParam("password") String password){
		User user1 = new User();
		user1.setName(name);
		user1.setPassword(password);
		
		ModelAndView model = new ModelAndView("FormSuccess");
		model.addObject("successMessage", "Form data " +name+" password "+password);
		model.addObject("user1",user1);
		return model;
		
	}
	//JSR(java specification requirements)
	@RequestMapping(value="/SubmitForm2.html", method=RequestMethod.POST)
	public ModelAndView submitFormWithModelAttribute(@Valid @ModelAttribute("user1") User user1, BindingResult result){
				
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("FormExample");
			return model;
		}
		ModelAndView model = new ModelAndView("FormSuccess");
		model.addObject("successMessage", "Form data submitted successfully");
		return model;
		
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage", "Header Message for all the views");
	}
}

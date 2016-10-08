package sree.spring.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

	
@Controller
@RequestMapping("/first")
public class FirstControllerWithAnnotations{
	
	@RequestMapping("/welcome")
	public ModelAndView welcome(){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "From welcome function");
		return model;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hello(){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "From hi function");
		return model;
	}
	
	@RequestMapping("/params/{userName}/{userId}")
	public ModelAndView parameters(@PathVariable("userName") String name, @PathVariable("userId") String userId){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "From params function"+name+"Id is"+userId);
		return model;
	}
	
	@RequestMapping("/paramsOne/{userName}/{userId}")
	public ModelAndView parameters(@PathVariable Map<String,String> pathVars){
		
		String name = pathVars.get("userName");
		String userId = pathVars.get("userId");
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcomeMessage", "From params One functions"+name+"Id is"+userId);
		return model;
	}
	
}
 
package sree.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class FirstController extends AbstractController {
	
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse respone)
	throws Exception{
		System.out.println("hello");

		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi welcome to the first application");
		
		return modelandview;
	}

}

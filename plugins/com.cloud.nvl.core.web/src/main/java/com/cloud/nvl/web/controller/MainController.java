/**
 * 
 */
package com.cloud.nvl.web.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Murphy
 * 
 */
@Controller
public class MainController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		return new ModelAndView("hello", "date", new Date());
	}

}

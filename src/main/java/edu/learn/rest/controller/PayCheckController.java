package edu.learn.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.learn.rest.business.DeveloperService;
import edu.learn.rest.business.PayCheckService;
import edu.learn.rest.model.Developer;
import edu.learn.rest.model.PayCheck;

@RestController
public class PayCheckController {


	@RequestMapping("/simpletax/{hours}/{wages}/{states}")
	public PayCheck getPaycheck(@PathVariable float hours,@PathVariable float wages, @PathVariable String states) {	
		PayCheckService paycheck = new PayCheckService();
		return paycheck.getPayCheck(wages, hours,states);
	
	}
	@RequestMapping("/developer")
	public Developer getDeveloper() {
		DeveloperService dev = new DeveloperService();
		return dev.getDeveloper();
		
	}

	
}

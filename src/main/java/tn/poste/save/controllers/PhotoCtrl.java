package tn.poste.save.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotoCtrl {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello World!";
	}

}

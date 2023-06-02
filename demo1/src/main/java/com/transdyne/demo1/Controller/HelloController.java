package com.transdyne.demo1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
	public String greeting( Model model) {
		
		return "hello";
	}
	@GetMapping("/demo")
	public String greeting1( Model model) {
		model.addAttribute("pavan", "nagapavankumar");
		return "demo";
	}

}

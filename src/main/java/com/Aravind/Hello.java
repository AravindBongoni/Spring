package com.Aravind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@RequestMapping("/hello")
	public String display() {
		return "view";
	}
	@RequestMapping("/helloagain")
	public String redirect() {
		return "final";
	}
}

package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WelcomeController {
	
	// /helloworld url로부터 오는 get 요청을 수행, 리턴에 해당하는 welcome.html 매핑
	@GetMapping("/helloworld")	
	public String welcome(String name, int age, Model model) {
		System.out.println("name : " + name + " age : " + age);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "welcome";
	}
	
}

package com.sample.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sController {

	@RequestMapping("tarun")
	public String index() {
		return "index.html";
		

	}
}

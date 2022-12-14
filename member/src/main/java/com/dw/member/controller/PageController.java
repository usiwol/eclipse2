package com.dw.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller 페이지 이동
@Controller
public class PageController {

	@GetMapping("/member")
	public String loadPage() {
		return "member";
	}
}

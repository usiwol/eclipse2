package com.dw.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {
	
	@GetMapping("/board")
	public String loadPage() {
		return "board";
	}
	
	@GetMapping("/board/{boardNO}")
	public String loadBoardPage(@PathVariable int boardNO, ModelMap map ) {
		//url로 받아오 게시판 번호를 update.html에 다시 전달.
		map.addAttribute("boardNO", boardNO);
		return "update";
	}
	
	@GetMapping("/write")
	public String loadWritePage() {
		return "write";
	}
}

package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.service.EmpService;
import com.dw.emp.vo.BoardVO;
@RestController
public class BoardApiController {

	@Autowired
	EmpService boardMapper;

	//게시판
	@GetMapping("/api/v1/board")
	public List<BoardVO> callBoard(){
		return boardMapper.selectBoard();
	}
}

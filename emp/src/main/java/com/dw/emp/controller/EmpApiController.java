package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.vo.EmpVO;

@RestController
public class EmpApiController {

	@Autowired
	EmpMapper empMapper;

	@GetMapping("/api/v1/emp")
	public List<EmpVO> callEmp() {
		return empMapper.selectEmp();
	}

	
}

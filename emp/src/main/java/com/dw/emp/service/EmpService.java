package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.vo.EmpVO;

@Service
public class EmpService {
	@Autowired
	EmpMapper empMapper;

	@GetMapping("/api/v1/emp")
	public List<EmpVO> callEmp() {
		return empMapper.selectEmp();
	}
}

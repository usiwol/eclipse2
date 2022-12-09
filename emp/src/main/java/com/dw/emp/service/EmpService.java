package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.mapper.BoardMapper;
import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.vo.BoardVO;
import com.dw.emp.vo.EmpVO;

@Service
public class EmpService {

	@Autowired
	EmpMapper empMapper;
	
	@Autowired
	BoardMapper boardMapper;
	
	public List<EmpVO> selectEmp(){
		return empMapper.selectEmp();
	}
	
	public EmpVO selectEmpfindByEmpno(int empno) {
		return empMapper.selectEmpfindByEmpno(empno);
	}

	public int insertEmp(EmpVO vo) {
		return empMapper.insertEmp(vo);
	}

	public int updateEmp(EmpVO vo) {
		return empMapper.updateEmp(vo);
	}
	
	public int deleteEmp(int empno) {
		return empMapper.deleteEmp(empno);
	}

	public List<BoardVO> selectBoard() {
		return boardMapper.selectBoard();
	}
	
	
}

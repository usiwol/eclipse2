package com.dw.emp.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpVO {

	private int empno; //사원번호
	private String ename; //사원이름
	private String job; //직책
	private String hiredate; //입사날짜
	private int sal; //급여
	private String dname; //부서 이름
	private String loc; //부서 위치
	private int comm; //보너스
	private int deptno;//부서번호

}

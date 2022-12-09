package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.BoardVO;
import com.dw.emp.vo.EmpVO;

@Mapper
public interface EmpMapper {

	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : jh
	 * @Return : List<EmpVO>
	 * @Comment : Emp 테이블 전체 조회
	 */
	public List<EmpVO> selectEmp();
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : jh
	 * @Return : EmpVO
	 * @Comment : 사원 상세 정보
	 */
	public EmpVO selectEmpfindByEmpno(int empno);

	/**
	 * @Since : 2022. 12. 8.
	 * @Author : jh
	 * @Return : int
	 * @Comment : 사원 추가
	 */
	int insertEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : jh
	 * @Return : int
	 * @Comment : 사원 정보 수정
	 */
	int updateEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : jh
	 * @Return : int
	 * @Comment : 사원 삭제
	 */
	int deleteEmp(int empno);

	

	
}

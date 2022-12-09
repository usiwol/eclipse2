package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.BoardVO;
@Mapper
public interface BoardMapper {
	/**
	 * @Since : 2022. 12. 9.
	 * @Author : jh
	 * @Return : List<BoardVO>
	 * @Comment : 게시판 전체 조회
	 */
	public List<BoardVO> selectBoard();
}

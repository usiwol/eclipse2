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
	
	//작성한 쿼리 ID와 메서드이름이 동일해야 mapping(연결)이 된다
	//insert, delete, update는 int로 리턴함
	/**
	 * @Since : 2022. 12. 12.
	 * @Author : jh
	 * @Return : int
	 * @Comment : 게시물 작성하기
	 */
	public int insertBoard(BoardVO vo);
	
	/**
	 * @Since : 2022. 12. 12.
	 * @Author : jh
	 * @Return : BoardVO
	 * @Comment : 게시물 상세조회
	 */
	public BoardVO selectBoardFindByBoardNO(int boardNO);
}

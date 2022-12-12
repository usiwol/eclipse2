package com.dw.emp.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
	private int board_no; //게시판 번호
	private String title;
	private String contents;
	private String writer;
	private String createAt;
	private int boardCount;
	
}

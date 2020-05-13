package kr.ac.mjc.sungbin.spring.day2.class06;

import lombok.Data;

/**
 * p.111 BoardVO.java<br>
 * Lombok을 사용해서 getter, setter, toString() 자동 생성
 */
@Data
public class Board {

	private String seq;
	private String title;
	private String writer;
	private String content;
	private String regdate;
	private int cnt;
}
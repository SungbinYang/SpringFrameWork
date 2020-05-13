package kr.ac.mjc.sungbin.spring.day2.class06;

import java.util.List;

public interface BoardDao {

	/**
	 * 게시글 목록 조회
	 * 
	 * @param offset 위치
	 * @param count  갯수
	 */
	List<Board> listBoards(int offset, int count);

	/**
	 * 게시글 1개 조회
	 */
	Board getBoard(String seq);

	/**
	 * 게시글 추가
	 */
	int addBoard(Board board);

	/**
	 * 게시글 수정
	 */
	int updateBoard(Board board);

	/**
	 * 게시글 삭제
	 */
	int deleteBoard(String seq);

}
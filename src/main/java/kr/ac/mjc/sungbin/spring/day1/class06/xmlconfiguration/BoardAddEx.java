package kr.ac.mjc.sungbin.spring.day1.class06.xmlconfiguration;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.class06.common.Board;

public class BoardAddEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext106a.xml");
		BoardDao boardDao = (BoardDao) context.getBean("boardDao");
		Board board = new Board();
		board.setTitle("검찰이 윤석열 총장의 장모를 기소했다");
		board.setContent("사문서 위조 등 혐의다.");
		board.setWriter("허핑턴포스트코리아");
		boardDao.addBoard(board);
		System.out.println("게시글을 추가했습니다.");

		List<Board> boardList = boardDao.listBoards(5, 1); // 5개씩, 1 page
		for (Board b : boardList)
			System.out.println(b);
		context.close();
	}
}
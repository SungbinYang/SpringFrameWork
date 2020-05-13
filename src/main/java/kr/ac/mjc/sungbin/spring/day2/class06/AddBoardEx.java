package kr.ac.mjc.sungbin.spring.day2.class06;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddBoardEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext206.xml");
		BoardDao boardDao = (BoardDao) context.getBean("boardDao");
		Board board = new Board();
		board.setTitle("Manchester United 우승");
		board.setContent("다음시즌은 우승 노려볼만하다.");
		board.setWriter("ysb");
		boardDao.addBoard(board);
		System.out.println("게시글을 추가했습니다.");

		List<Board> boardList = boardDao.listBoards(0, 5); // 5개씩, 1 page
		for (Board b : boardList)
			System.out.println(b);
		context.close();
	}
}
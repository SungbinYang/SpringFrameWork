package kr.ac.mjc.sungbin.spring.day2.class06;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListBoardsEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext206.xml");
		BoardDao boardDao = (BoardDao) context.getBean("boardDao");
		List<Board> boardList = boardDao.listBoards(0, 5); // 0부터 5개
		for (Board board : boardList)
			System.out.println(board);
		context.close();
	}
}
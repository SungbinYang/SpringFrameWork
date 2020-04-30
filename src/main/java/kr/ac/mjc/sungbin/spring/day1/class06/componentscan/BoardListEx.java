package kr.ac.mjc.sungbin.spring.day1.class06.componentscan;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.class06.common.Board;

public class BoardListEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext106b.xml");
		BoardDao boardDao = (BoardDao) context.getBean("boardDao");
		List<Board> boardList = boardDao.listBoards(5, 1); // 5개씩, 1 page
		for (Board board : boardList)
			System.out.println(board);
		context.close();
	}
}
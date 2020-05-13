package kr.ac.mjc.sungbin.spring.day2.class06;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

public class GetBoardEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext206.xml");
		BoardDao boardDao = (BoardDao) context.getBean("boardDao");
		String seq = "35";
		try {
			Board board = boardDao.getBoard(seq);
			System.out.println(board);
		} catch (EmptyResultDataAccessException e) {
			System.err.println("데이터가 없습니다. seq=" + seq);
		}
		context.close();
	}

}
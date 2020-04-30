package kr.ac.mjc.sungbin.spring.day1.class06.xmlconfiguration;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.class06.common.Board;

public class BoardGetEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext106a.xml");
		BoardDao boardDao = (BoardDao) context.getBean("boardDao");
		Board board = boardDao.getBoard("1153");
		System.out.println(board);
		context.close();
	}

}
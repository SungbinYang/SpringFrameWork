package kr.ac.mjc.sungbin.spring.day1.class06.xmlconfiguration;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardDeleteEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext106a.xml");
		BoardDao boardDao = (BoardDao) context.getBean("boardDao");
		String seq = "1159";
		int updatedRows = boardDao.deleteBoard(seq);
		if (updatedRows > 0)
			System.out.println("삭제했습니다. seq=" + seq);
		else
			System.out.println("잘못된 글번호입니다. seq=" + seq);
		context.close();
	}
}
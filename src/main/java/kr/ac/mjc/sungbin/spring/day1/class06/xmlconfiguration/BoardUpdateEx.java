package kr.ac.mjc.sungbin.spring.day1.class06.xmlconfiguration;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.class06.common.Board;

public class BoardUpdateEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext106a.xml");
		BoardDao boardDao = (BoardDao) context.getBean("boardDao");
		Board board = new Board();
		board.setSeq("1153");
		board.setTitle("도널드 트럼프 미국 대통령이 '역사상 가장 열심히 일하는 대통령'이라고 자화자찬하며 한 말");
		board.setContent(
				"트럼프 대통령은 26일(이하 현지시간) 트위터를 통해 ”나를 알고 우리나라의 역사를 아는 사람들은 내가 역사상 가장 열심히 일하는 대통령이라는 것을 안다”며 ”나는 열심히 일하는 사람이며, 아마도 첫 번째 임기의 3년 반 동안 역사상 그 어느 대통령보다 더 많은 것을 이뤄냈을 것”이라고 말했다.");
		boardDao.updateBoard(board);

		board = boardDao.getBoard("1153");
		System.out.println("수정했습니다.\n" + board);
		context.close();
	}
}

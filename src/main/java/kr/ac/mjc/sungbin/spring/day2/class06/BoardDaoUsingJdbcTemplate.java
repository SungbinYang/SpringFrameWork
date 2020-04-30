package kr.ac.mjc.sungbin.spring.day2.class06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.mjc.sungbin.spring.day1.class06.common.Board;

/**
 * p.224 BoardDaoSpring.java<br>
 * Spring JdbcTemplate 을 사용한 Data Access Object
 */
@Repository("boardDao")
public class BoardDaoUsingJdbcTemplate {

	protected final String INSERT_BOARD = "insert into board(title, writer, content) values(?,?,?)";
	protected final String UPDATE_BOARD = "update board set title=?, content=? where seq=?";
	protected final String DELETE_BOARD = "delete from board where seq=?";
	protected final String GET_BOARD = "select seq, title, content, writer, regdate, cnt from board where seq=?";
	protected final String LIST_BOARDS = "select seq, title, writer, regdate, cnt from board order by seq desc";

	@Autowired
	protected JdbcTemplate jdbcTemplate;

	public void insertBoard(Board board) {
		jdbcTemplate.update(INSERT_BOARD, board.getTitle(), board.getWriter(),
				board.getContent());
		System.out.println("입력했습니다. " + board);
	}

	public void updateBoard(Board board) {
		jdbcTemplate.update(UPDATE_BOARD, board.getTitle(), board.getWriter(),
				board.getSeq());
		System.out.println("수정했습니다. " + board);
	}

	public void deleteBoard(int seq) {
		jdbcTemplate.update(DELETE_BOARD, seq);
		System.out.println("삭제했습니다. seq=" + seq);
	}

	public Board getBoard(int seq) {
		return jdbcTemplate.queryForObject(GET_BOARD, (rs, rowNum) -> {
			Board board = new Board();
			board.setSeq(rs.getString("seq"));
			board.setTitle(rs.getString("title"));
			board.setWriter(rs.getString("writer"));
			board.setContent(rs.getString("content"));
			board.setRegdate(rs.getString("regdate"));
			board.setCnt(rs.getInt("cnt"));
			return board;
		}, seq);
	}

	public List<Board> listBoards() {
		return jdbcTemplate.query(LIST_BOARDS, (rs, rowNum) -> {
			Board board = new Board();
			board.setSeq(rs.getString("seq"));
			board.setTitle(rs.getString("title"));
			board.setWriter(rs.getString("writer"));
			board.setRegdate(rs.getString("regdate"));
			board.setCnt(rs.getInt("cnt"));
			return board;
		});
	}
}
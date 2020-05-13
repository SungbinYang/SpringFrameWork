package kr.ac.mjc.sungbin.spring.day2.class06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * p.224 BoardDAOSpring 수정
 * 
 * @author Jacob
 */
public class BoardDaoUsingJdbcTemplate implements BoardDao {

	private final String LIST_BOARDS = "select seq, title, left(regdate,16) regdate, writer, cnt from board order by seq desc limit ?,?";
	private final String GET_BOARD = "select seq, title,content, left(regdate,16) regdate, writer, cnt from board where seq=?";
	private final String ADD_BOARD = "insert board(title, content, writer) values(?,?,?)";
	private final String UPDATE_BOARD = "update board set title=?, content=? where seq=?";
	private final String DELETE_BOARD = "delete from board where seq=?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final RowMapper<Board> BOARD_ROW_MAPPER = new BeanPropertyRowMapper<>(
			Board.class);

	public BoardDaoUsingJdbcTemplate() {
		System.out.println(getClass().getSimpleName() + " 인스턴스를 생성했습니다.");
	}

	/**
	 * 게시글 목록 조회
	 * 
	 * @param page  페이지
	 * @param count 갯수
	 */
	@Override
	public List<Board> listBoards(int offset, int count) {

		return jdbcTemplate.query(LIST_BOARDS, BOARD_ROW_MAPPER, offset, count);
	}

	/**
	 * 게시글 1개 조회
	 */
	@Override
	public Board getBoard(String seq) {
		return jdbcTemplate.queryForObject(this.GET_BOARD, BOARD_ROW_MAPPER,
				seq);
	}

	/**
	 * 게시글 추가
	 */
	@Override
	public int addBoard(Board board) {
		return jdbcTemplate.update(ADD_BOARD, board.getTitle(),
				board.getContent(), board.getWriter());
	}

	/**
	 * 게시글 수정
	 */
	@Override
	public int updateBoard(Board board) {
		return jdbcTemplate.update(UPDATE_BOARD, board.getTitle(),
				board.getContent(), board.getSeq());
	}

	/**
	 * 게시글 삭제
	 */
	@Override
	public int deleteBoard(String seq) {
		return jdbcTemplate.update(DELETE_BOARD, seq);
	}
}
package kr.ac.mjc.sungbin.spring.day2.class06.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;


/**
 * NamedParameterJdbcTemplate을 사용하는 BoardDao 구현체
 * 
 * @author Jacob
 */
@Component("userDao")
public class UserDaoUsingNamedParameterJdbcTemplate implements UserDao {

	private final String LIST_USERS = "select id, email, password, name from user order by id desc limit ?,?";
	private final String GET_USER = "select id, email, password, name from user where id=?";
	private final String ADD_USER = "insert user(email, password, name) values(:email, sha2(password,256), :name)";
	private final String UPDATE_USER = "update user set email=:email, name=:name where id=:id";
	private final String DELETE_USER = "delete from user where id=?";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	/**
	 * board 테이블과 board 오브젝트를 매핑
	 */
	private final RowMapper<User> BOARD_ROW_MAPPER = new BeanPropertyRowMapper<>(
			User.class);

	public UserDaoUsingNamedParameterJdbcTemplate() {
		System.out.println(getClass().getSimpleName() + " 인스턴스를 생성했습니다.");
	}
	
	/**
	 * 게시글 목록 조회
	 * 
	 * @param page  페이지
	 * @param count 갯수
	 */
	@Override
	public List<User> listUsers(int offset, int count) {
		return jdbcTemplate.query(LIST_USERS, BOARD_ROW_MAPPER, offset, count);
	}

	/**
	 * 게시글 1개 조회
	 */
	@Override
	public User getUser(String id) {
		return jdbcTemplate.queryForObject(this.GET_USER, BOARD_ROW_MAPPER,
				id);
	}


	/**
	 * 게시글 추가
	 */
	@Override
	public int addUser(User user) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(user);
		return namedParameterJdbcTemplate.update(ADD_USER, params);
	}

	/**
	 * 게시글 수정
	 */
	@Override
	public int updateUser(User user) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(user);
		return namedParameterJdbcTemplate.update(UPDATE_USER, params);
	}
	
	/**
	 * 게시글 삭제
	 */
	@Override
	public int deleteUser(String id) {
		return jdbcTemplate.update(DELETE_USER, id);
	}

}
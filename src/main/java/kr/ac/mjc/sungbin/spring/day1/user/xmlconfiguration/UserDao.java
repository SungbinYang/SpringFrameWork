package kr.ac.mjc.sungbin.spring.day1.user.xmlconfiguration;

import java.util.List;

import kr.ac.mjc.sungbin.spring.day1.user.common.DbUtils;
import kr.ac.mjc.sungbin.spring.day1.user.common.User;

public class UserDao {

	private final String LIST_USERS = "select id, email, password, name from user order by id desc limit ?,?";
	private final String GET_USER = "select id, email, password, name from user where id=?";
	private final String ADD_USER = "insert user(email, password, name) values(?,?,?)";
	private final String UPDATE_USER = "update user set email=?, name=? where id=?";
	private final String DELETE_USER = "delete from user where id=?";

	private DbUtils dbUtils;

	public UserDao(DbUtils dbUtils) {
		this.dbUtils = dbUtils;
	}

	public List<User> listUsers(int count, int page) {
		int offset = (page - 1) * count; // 목록 가져올 시작점
		return dbUtils.list(LIST_USERS, (rs) -> {
			User user = new User();
			user.setId(rs.getString("id"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setName(rs.getString("name"));
			return user;
		}, offset, count);
	}

	public User getUser(String id) {
		return dbUtils.get(this.GET_USER, (rs) -> {
			User user = new User();
			user.setId(rs.getString("id"));
			user.setEmail(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			user.setName(rs.getString("name"));
			return user;
		}, id);
	}

	public int addUser(User user) {
		return dbUtils.update(ADD_USER, user.getEmail(), dbUtils.getHash(user.getPassword()), user.getName());
	}

	public int updateUser(User user) {
		return dbUtils.update(UPDATE_USER, user.getEmail(), user.getName(), user.getId());
	}

	public int deleteUser(String id) {
		return dbUtils.update(DELETE_USER, id);
	}

}

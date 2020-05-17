package kr.ac.mjc.sungbin.spring.day2.class06.user;

import java.util.List;


public interface UserDao {
	
	 List<User> listUsers(int offset, int count);
	
	 User getUser(String id);
	
	 int addUser(User user);
	
	 int updateUser(User user);
	
	 int deleteUser(String id);

}
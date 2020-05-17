package kr.ac.mjc.sungbin.spring.day2.class06.user;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddUserEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_User.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		User user = new User();
		user.setEmail("ysb0522222@maver.com");
		user.setPassword("1234");
		user.setName("양성빈");
		userDao.addUser(user);
		System.out.println("사용자를 추가했습니다.");

		List<User> userList = userDao.listUsers(1, 10);
		for (User u : userList)
			System.out.println(u);
		context.close();
	}

}

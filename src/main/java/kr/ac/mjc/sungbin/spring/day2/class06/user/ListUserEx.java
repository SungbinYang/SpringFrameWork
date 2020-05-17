package kr.ac.mjc.sungbin.spring.day2.class06.user;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListUserEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_User.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		List<User> userList = userDao.listUsers(1, 10);
		for (User user : userList)
			System.out.println(user);
		context.close();
	}

}

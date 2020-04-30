package kr.ac.mjc.sungbin.spring.day1.user.xmlconfiguration;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.user.common.User;

public class AddUserEx {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		User user = new User();
		user.setEmail("ysb05222@naver.com");
		user.setPassword("y801933601");
		user.setName("양성빈");
		userDao.addUser(user);
		System.out.println("사용자를 추가했습니다.");

		List<User> userList = userDao.listUsers(10, 1); 
		for (User u : userList)
			System.out.println(u);
		context.close();
	}

}

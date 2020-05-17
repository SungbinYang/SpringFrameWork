package kr.ac.mjc.sungbin.spring.day2.class06.user;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateUserEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_User.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		User user = new User();
		user.setId("188");
		user.setEmail("sungbin3763@inflearn.com");
		user.setName("양성빈");
		userDao.updateUser(user);

		user = userDao.getUser("188");
		System.out.println("수정했습니다.\n" + user);
		context.close();
	}

}

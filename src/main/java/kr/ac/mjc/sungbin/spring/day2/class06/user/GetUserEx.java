package kr.ac.mjc.sungbin.spring.day2.class06.user;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class GetUserEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_User.xml");
		UserDao boardDao = (UserDao) context.getBean("userDao");
		User user = boardDao.getUser("187");
		System.out.println(user);
		context.close();
	}

}

package kr.ac.mjc.sungbin.spring.day1.user.xmlconfiguration;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.user.common.User;


public class UpdateUserEx {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		User user = new User();
		user.setId("465");
		user.setEmail("sungbin3763@gmail.com");
		user.setName("양성빈");
		userDao.updateUser(user);

		user = userDao.getUser("465");
		System.out.println("수정했습니다.\n" + user);
		context.close();
	}

}

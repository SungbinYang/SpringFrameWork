package kr.ac.mjc.sungbin.spring.day1.user.xmlconfiguration;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.user.common.User;


public class GetUserEx {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserDao boardDao = (UserDao) context.getBean("userDao");
		User user = boardDao.getUser("1");
		System.out.println(user);
		context.close();
	}

}

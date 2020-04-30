package kr.ac.mjc.sungbin.spring.day1.user.xmlconfiguration;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.user.common.User;

public class ListUserEx {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		List<User> userList = userDao.listUsers(10, 1); 
		for (User user : userList)
			System.out.println(user);
		context.close();
	}

}

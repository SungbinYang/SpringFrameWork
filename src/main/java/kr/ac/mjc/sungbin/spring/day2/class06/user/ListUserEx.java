package kr.ac.mjc.sungbin.spring.day2.class06.user;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListUserEx {
	
	static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_User.xml");
		UserDao userDao = context.getBean("userDao", UserDao.class);
		List<User> userList = userDao.listUsers(0, 5);
		logger.debug(userList);
		context.close();
	}

}

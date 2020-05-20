package kr.ac.mjc.sungbin.spring.day2.class06.user;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

public class GetUserEx {

	static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_User.xml");
		UserDao userDao = context.getBean("userDao", UserDao.class);
		String id = "212";
		try {
			User user = userDao.getUserById(id);
			logger.debug(user);
		} catch (EmptyResultDataAccessException e) {
			logger.debug("사용자가 없습니다. id={}", id);
		}
		context.close();
	}
}

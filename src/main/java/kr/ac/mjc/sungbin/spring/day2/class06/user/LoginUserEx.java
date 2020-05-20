package kr.ac.mjc.sungbin.spring.day2.class06.user;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

public class LoginUserEx {

	static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_User.xml");
		UserDao userDao = context.getBean("userDao", UserDao.class);

		try {
			User user = userDao.getUserByEmailAndPassword("didtjdqls1223@inflearn.com",
					"1234");
			logger.debug("로그인을 했습니다. {}", user);
		} catch (EmptyResultDataAccessException e) {
			logger.debug("로그인에 실패했습니다.");
		}
		context.close();
	}
}
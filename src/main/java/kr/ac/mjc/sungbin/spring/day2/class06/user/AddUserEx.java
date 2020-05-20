package kr.ac.mjc.sungbin.spring.day2.class06.user;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DuplicateKeyException;

public class AddUserEx {

	static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		User user = new User();
		user.setEmail("didtjdqls1223@inflearn.com");
		user.setPassword("1234");
		user.setName("양성빈");

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_User.xml");
		UserDao userDao = context.getBean("userDao", UserDao.class);
		try {
			userDao.addUser(user);
			logger.info("등록했습니다. {}", user);
		} catch (DuplicateKeyException e) {
			logger.debug("이메일이 중복되어 등록하지 못했습니다. email={}", user.getEmail());
		}
		context.close();
	}
}

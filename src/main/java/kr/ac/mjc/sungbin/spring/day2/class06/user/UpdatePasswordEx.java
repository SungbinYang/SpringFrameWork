package kr.ac.mjc.sungbin.spring.day2.class06.user;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdatePasswordEx {

	static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_User.xml");
		UserDao userDao = context.getBean("userDao", UserDao.class);
		String id = "212";
		int updatedRows = userDao.updatePassword(id, "abcd", "1234");
		if (updatedRows > 0)
			logger.info("비밀번호를 수정했습니다. id={}", id);
		else
			logger.debug("현재 비밀번호가 틀립니다.");
		context.close();
	}
}

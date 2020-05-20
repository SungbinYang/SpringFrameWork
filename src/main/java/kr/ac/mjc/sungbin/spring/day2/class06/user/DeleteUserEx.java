package kr.ac.mjc.sungbin.spring.day2.class06.user;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteUserEx {

	static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_User.xml");
		UserDao userDao = context.getBean("userDao", UserDao.class);
		String id = "201";
		userDao.deleteUser(id);
		logger.info("회원탈퇴했습니다. id={}", id);
		context.close();
	}
}

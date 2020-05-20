package kr.ac.mjc.sungbin.spring.day2.class06.user;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DuplicateKeyException;

public class UpdateUserEx {

	static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		User user = new User();
		user.setId("212");
		user.setEmail("didtjdqls1223@inflearn.com");
		user.setName("YangSungBin");

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext_User.xml");
		UserDao userDao = context.getBean("userDao", UserDao.class);

		try {
			userDao.updateUser(user);
			logger.info("회원정보를 수정했습니다. {}", user);
		} catch (DuplicateKeyException e) {
			logger.debug("이메일이 중복되어 회원정보를 수정할 수 없습니다. email={}",
					user.getEmail());
		}

		context.close();
	}
}

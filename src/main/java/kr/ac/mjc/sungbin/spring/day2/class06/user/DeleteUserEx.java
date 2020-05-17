package kr.ac.mjc.sungbin.spring.day2.class06.user;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteUserEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_User.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		String id = "190";
		int updatedRows = userDao.deleteUser(id);
		if (updatedRows > 0)
			System.out.println("삭제했습니다. id=" + id);
		else
			System.out.println("잘못된 id입니다. id=" + id);
		context.close();
	}

}

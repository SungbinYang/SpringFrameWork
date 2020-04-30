package kr.ac.mjc.sungbin.spring.day1.class05;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.class02.TV;

public class TVUser {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext105.xml");

		TV lgTV = (TV) context.getBean("lgTV");
		lgTV.volumeUp();
		context.close();
	}
}

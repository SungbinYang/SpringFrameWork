package kr.ac.mjc.sungbin.spring.day1.class04.constructorbased;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.class02.TV;


public class TVUserUsingConstructorInjection {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext104a.xml");

		TV tv = (TV) context.getBean("tv");
		tv.volumeUp();

		context.close();
	}
}

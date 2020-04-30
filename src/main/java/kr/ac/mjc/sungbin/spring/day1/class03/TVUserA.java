package kr.ac.mjc.sungbin.spring.day1.class03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.class02.TV;

/**
 * p.53
 */
public class TVUserA {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext103a.xml");

		TV samsungTV = (TV) context.getBean("samsungTV");
		samsungTV.powerOn();
		samsungTV.powerOff();

		TV lgTV = (TV) context.getBean("lgTV");
		lgTV.powerOn();
		lgTV.powerOff();

		context.close();
	}
}
package kr.ac.mjc.sungbin.spring.day1.class03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.class02.TV;



/**
 * init(), destory() 테스트
 */
public class TVUserB {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext103b.xml");

		TV tv = (TV) context.getBean("samsungTV");
		tv.powerOn();
		tv.powerOff();

		context.close();
	}
}
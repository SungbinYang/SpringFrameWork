package kr.ac.mjc.sungbin.spring.day1.class04.setterbased;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.mjc.sungbin.spring.day1.class02.TV;

;
public class TVUserUsingSetterInjection {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext104b.xml");

		TV tv = (TV) context.getBean("tv");
		tv.volumeDown();

		context.close();
	}
}
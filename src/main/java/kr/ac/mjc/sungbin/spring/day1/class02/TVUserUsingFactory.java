package kr.ac.mjc.sungbin.spring.day1.class02;

import java.util.Scanner;

/**
 * p.45 TVUser 수정
 */
public class TVUserUsingFactory {

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory(); // 빈을 미리 생성해 둔다.

		System.out.print("\nInput bean's name : ");
		Scanner scanner = new Scanner(System.in);
		String beanName = scanner.next();
		scanner.close();

		TV tv1 = (TV) factory.getBean(beanName); // 빈을 꺼낸다.
		tv1.powerOn();

		TV tv2 = (TV) factory.getBean(beanName); // 빈을 꺼낸다. tv1 == tv2
		tv2.powerOn();

		TV tv3 = (TV) factory.createBean(beanName); // 빈을 새로 생성한다.
		tv3.powerOn();
	}
}
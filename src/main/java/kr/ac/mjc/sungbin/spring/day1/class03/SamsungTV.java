package kr.ac.mjc.sungbin.spring.day1.class03;

import kr.ac.mjc.sungbin.spring.day1.class02.DefaultTV;

/**
 * p.60 init(), destroy() 메서드 추가
 */
public class SamsungTV extends DefaultTV {

	public void init() {
		System.out.println("samsungTV is initialized.");
	}

	public void destroy() {
		System.out.println("samsungTV is destroyed.");
	}
}
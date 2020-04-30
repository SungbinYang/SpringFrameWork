package kr.ac.mjc.sungbin.spring.day1.class02;

import java.util.HashMap;
import java.util.Map;

/**
 * p45 BeanFactory 수정.
 */
public class BeanFactory {

	Map<String, Object> map = new HashMap<>();

	public BeanFactory() {
		// bean을 미리 생성해서 맵에 저장
		map.put("samsung", new SamsungTV());
		map.put("lg", new LgTV());
		System.out.println("beanFactory가 빈들을 생성해서 보관합니다.");
	}

	/**
	 * Single instance. 미리 생성해 놓은 빈을 꺼내 준다.
	 */
	public Object getBean(String name) { //빈들을 꺼낸다.
		return map.get(name); //원래 타입으로 리턴 받을려면 type casting이 필요
	}

	/**
	 * Create instance. 빈을 새로 만들어 준다.
	 */
	public Object createBean(String name) {
		if ("samsung".equals(name))
			return new SamsungTV();
		else if ("lg".equals(name))
			return new LgTV();

		return null;
	}
}
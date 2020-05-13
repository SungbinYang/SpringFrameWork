package kr.ac.mjc.sungbin.spring.interfaces;

public class Circle implements Shape {

	@Override
	public void getLength() {
		System.out.println("원의 둘레를 구합니다.");
	}

	@Override
	public void getArea() {
		System.out.println("원의 면적을 구합니다.");
	}

}
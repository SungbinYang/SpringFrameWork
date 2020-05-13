package kr.ac.mjc.sungbin.spring.interfaces;

public class Triangle implements Shape {

	@Override
	public void getLength() {
		System.out.println("삼각형의 둘레를 구합니다.");
	}
}

package kr.ac.mjc.sungbin.spring.interfaces;

public class Rectangle implements Shape {

	@Override
	public void getLength() {
		System.out.println("사각형의 둘레를 구합니다.");
	}
	
	@Override
	public void getArea() {
		System.out.println("사각형의 면적을 구합니다.");
	}
}
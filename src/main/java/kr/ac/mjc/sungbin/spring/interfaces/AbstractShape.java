package kr.ac.mjc.sungbin.spring.interfaces;

public abstract class AbstractShape implements Shape {

	@Override
	public void move() {
		System.out.println("도형의 중심을 옮깁니다.");
	}
}
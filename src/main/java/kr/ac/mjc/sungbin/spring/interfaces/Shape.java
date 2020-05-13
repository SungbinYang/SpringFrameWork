package kr.ac.mjc.sungbin.spring.interfaces;

public interface Shape {
	// constant (public static final)
	double PI = 3.141592;

	// static method (public)
	static double exponential() {
		return 2.718282;
	}

	// abstract method (public abstract)
	void getLength();

	// default method (public)
	default void move() {
		System.out.println("도형의 중심을 옮깁니다.");
	}

	default void getArea() {
	}
}
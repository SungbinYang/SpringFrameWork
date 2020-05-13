package kr.ac.mjc.sungbin.spring.interfaces;

public class ShapeTest {

	public static void main(String[] args) {
		System.out.println(Shape.PI);
		System.out.println(Shape.exponential());

		Shape triangle = new Triangle();
		Shape rectagle = new Rectangle();

		triangle.getLength();
		triangle.move();
		rectagle.getLength();
		rectagle.move();
		rectagle.getArea();
		
		Shape circle = new Circle();
		circle.getArea();
		circle.move();
		circle.getLength();
	}
}
package kr.ac.mjc.sungbin.spring.methodreference;

public class PersonComparator {

	public int compareAge(Person o1, Person o2) {
		return o2.getAge() - o1.getAge();
	}

	public static int compareHeight(Person o1, Person o2) {
		return o2.getHeight() - o1.getHeight();
	}
}
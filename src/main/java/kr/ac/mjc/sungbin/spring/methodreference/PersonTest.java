package kr.ac.mjc.sungbin.spring.methodreference;

public class PersonTest {

	public void go() {
		Person tom = new Person("Tom", 10, 150); // 10세, 150cm
		Person john = new Person("John", 20, 180); // 20세, 180cm
		Person paul = new Person("Paul", 30, 170); // 30세, 170cm

		Person[] persons = { tom, john, paul };

		PersonComparator pc = new PersonComparator();

		// method reference
		Person max = getMax(persons, pc::compareAge);
		System.out.println("The oldest : " + max);

		max = getMax(persons, PersonComparator::compareHeight);
		System.out.println("The heighest : " + max);
	}

	/**
	 * 배열에서 최대값을 리턴하는 메서드
	 * 
	 * @param array      T 타입의 오브젝트 배열
	 * @param comparator 비교기
	 * @return 배열에서 비교기를 사용해서 최대 오브젝트를 리턴한다.
	 */
	public <T> T getMax(T[] array, Comparator<T> comparator) {
		T max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (comparator.compare(max, array[i]) > 0)
				max = array[i];
		}
		return max;
	}

	public static void main(String[] args) {
		new PersonTest().go();
	}
}
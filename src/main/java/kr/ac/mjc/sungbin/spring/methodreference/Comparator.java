package kr.ac.mjc.sungbin.spring.methodreference;

@FunctionalInterface
public interface Comparator<T> {
	/**
	 * 두개의 오브젝트를 비교한다.
	 * 
	 * @return o1이 크면 음수, 같으면 0, o2가 크면 양수를 리턴한다.
	 */
	int compare(T o1, T o2);
}
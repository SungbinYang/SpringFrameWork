package kr.ac.mjc.sungbin.spring.day1.class02;

public class TVUser {

	public static void main(String[] args) {

		TV tv = new SamsungTV(); //삼성티비냐 엘지티비냐 값이 바뀜 이 방법이 정적인 방법
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
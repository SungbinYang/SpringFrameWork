package kr.ac.mjc.sungbin.spring.day1.class04.constructorbased;

import kr.ac.mjc.sungbin.spring.day1.class04.SonySpeaker;
import kr.ac.mjc.sungbin.spring.day1.class04.Speaker;

public class TVUser {

	public static void main(String[] args) {
		Speaker speaker = new SonySpeaker();
		/**
		 * constructor를 사용해서 sonySpeaker를 넣는다.
		 */
		SamsungTV tv = new SamsungTV(speaker);
		tv.volumeUp();
	}
}
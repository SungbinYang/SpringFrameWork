package kr.ac.mjc.sungbin.spring.day1.class04.setterbased;

import kr.ac.mjc.sungbin.spring.day1.class04.AppleSpeaker;
import kr.ac.mjc.sungbin.spring.day1.class04.Speaker;

public class TVUser {

	public static void main(String[] args) {
		Speaker speaker = new AppleSpeaker();
		/**
		 * setter를 사용해서 sonySpeaker를 넣는다.
		 */
		LgTV tv = new LgTV();
		tv.setSpeaker(speaker);
		tv.volumeDown();
	}
}
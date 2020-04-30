package kr.ac.mjc.sungbin.spring.day1.class04.constructorbased;

import kr.ac.mjc.sungbin.spring.day1.class02.DefaultTV;
import kr.ac.mjc.sungbin.spring.day1.class04.Speaker;

/**
 * p.69
 */
public class SamsungTV extends DefaultTV {

	private Speaker speaker = null;

	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("constructor에서 speaker를 넣었습니다.");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp(); //speaker가 초기화 되어야만 수행이 가능하다. 이런걸 의존성이라 한다.
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
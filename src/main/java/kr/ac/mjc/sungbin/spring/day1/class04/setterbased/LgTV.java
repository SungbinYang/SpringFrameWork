package kr.ac.mjc.sungbin.spring.day1.class04.setterbased;

import kr.ac.mjc.sungbin.spring.day1.class02.DefaultTV;
import kr.ac.mjc.sungbin.spring.day1.class04.Speaker;

/**
 * p.69
 */
public class LgTV extends DefaultTV {

	private Speaker speaker = null;

	/**
	 * Default constructor
	 */
	public LgTV() {
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("setter에서 speaker를 넣었습니다.");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
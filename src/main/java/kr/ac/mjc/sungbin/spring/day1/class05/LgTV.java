package kr.ac.mjc.sungbin.spring.day1.class05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import kr.ac.mjc.sungbin.spring.day1.class02.DefaultTV;
import kr.ac.mjc.sungbin.spring.day1.class04.Speaker;

/**
 * p.99
 */
@Component
public class LgTV extends DefaultTV {

	@Autowired
	@Qualifier("sonySpeaker")
	private Speaker speaker;

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}

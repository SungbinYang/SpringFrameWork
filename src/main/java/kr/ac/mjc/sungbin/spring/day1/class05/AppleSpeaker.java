package kr.ac.mjc.sungbin.spring.day1.class05;

import org.springframework.stereotype.Component;

import kr.ac.mjc.sungbin.spring.day1.class04.Speaker;



@Component
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("appleSpeaker instance is created.");
	}
}
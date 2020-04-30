package kr.ac.mjc.sungbin.spring.day1.class05;

import org.springframework.stereotype.Component;

import kr.ac.mjc.sungbin.spring.day1.class04.Speaker;


@Component
public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("sonySpeaker instance is created.");
	}
}

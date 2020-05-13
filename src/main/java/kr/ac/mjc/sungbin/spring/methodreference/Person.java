package kr.ac.mjc.sungbin.spring.methodreference;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
	String name;
	int age; // 나이
	int height; // 키
}
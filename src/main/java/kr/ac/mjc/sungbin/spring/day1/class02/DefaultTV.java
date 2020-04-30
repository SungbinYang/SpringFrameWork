package kr.ac.mjc.sungbin.spring.day1.class02;

public class DefaultTV implements TV {

	public DefaultTV() {
		System.out.format("%s is created.\n", this);
	}

	@Override
	public void powerOn() {
		System.out.format("%s - power on.\n", this);
	}

	@Override
	public void powerOff() {
		System.out.format("%s - power off.\n", this);
	}

	@Override
	public void volumeUp() {
		System.out.format("%s - volume up.\n", this);
	}

	@Override
	public void volumeDown() {
		System.out.format("%s - volume down.\n", this);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "@" //getSimpleName은 클래스의 패키지명을 제외한 순수 클래스 이름만 나온다.
				+ Integer.toHexString(hashCode()); //toHexString은 16진수표현방법
	}
}

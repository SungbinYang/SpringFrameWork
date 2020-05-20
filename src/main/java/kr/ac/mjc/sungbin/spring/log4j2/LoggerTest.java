package kr.ac.mjc.sungbin.spring.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerTest {

	// 기본으로 로거 이름이 클래스 이름으로 생성됨
	private static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		logger.fatal("Fatal Message.");
		logger.error("Error Message.");
		logger.warn("Warn Message.");
		logger.info("Info Message.");
		logger.debug("Debug Message.");
		logger.trace("Trace Message.");
	}
}
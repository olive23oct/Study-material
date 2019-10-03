package com.mystudy.ex03_sunjuk;

public class JumsuOutOfValueException extends SungjukProcessException {
	public JumsuOutOfValueException() {
		super("점수범위(0~100)를 벗어난 값입니다.");
	}
}

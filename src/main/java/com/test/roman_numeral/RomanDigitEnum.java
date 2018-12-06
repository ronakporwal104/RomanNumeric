package com.test.roman_numeral;

public enum RomanDigitEnum {
	
	GLOB("I",1),
	PROK("V",5),
	PISH("X",10),
	TEGJ("L",50);
	
	private String code;
	private int value;
	private RomanDigitEnum(String code, int value){
		this.setCode(code);
		this.setValue(value);
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}

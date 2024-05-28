package com.icia.input.dto;

public class InputDTO {
	
	// DTO(Data Transfer Object)
	
	// 필드
	private String data1;
	private int data2;
	
	
	// 생성자(생략)
	
	// 메소드 : getter, setter, toString
	// [Alt] + [Shift] + [S] 누른 후
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public int getData2() {
		return data2;
	}
	public void setData2(int data2) {
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return "InputDTO [data1=" + data1 + ", data2=" + data2 + "]";
	}
	
	
	
	
	
	
	

}

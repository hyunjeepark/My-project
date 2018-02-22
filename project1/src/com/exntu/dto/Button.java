package com.exntu.dto;

public class Button {

	private int size;
	private String color;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Button(int size, String color) {
		super();
		this.size = size;
		this.color = color;
		//System.out.println("��ư" + count + "�� ����");
	}

	
	
	

}

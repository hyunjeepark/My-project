package com.exntu.dto;

public class Display {
	
	private int size;
	private boolean power;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public Display(int size, boolean power) {
		super();
		this.size = size;
		this.power = power;
	}
	
	public Display() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}

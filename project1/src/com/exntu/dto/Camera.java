package com.exntu.dto;

public class Camera {
	
	private int size;
	private String lens;

	public void takePhoto() {
		System.out.println("사진 찍기");
	}
	public void savePhoto() {
		System.out.println("자동 사진 저장");
	}
	
	public Camera(int size, String lens) {
		this.size = size;
		this.lens = lens;
	}
	

}

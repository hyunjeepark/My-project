package com.exntu.dto;

public class Camera {
	
	private int size;
	private String lens;

	public void takePhoto() {
		System.out.println("���� ���");
	}
	public void savePhoto() {
		System.out.println("�ڵ� ���� ����");
	}
	
	public Camera(int size, String lens) {
		this.size = size;
		this.lens = lens;
	}
	

}

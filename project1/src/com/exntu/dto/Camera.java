package com.exntu.dto;

public class Camera {

	public enum LensType {
		FRONT,REAR
	}
	// 렌즈의 종류 : 후면, 전면
	
	private int size;

	private LensType lensType;

	public void takePhoto() {
		System.out.println("사진찍기");
	}

	public void savePhoto() {
		System.out.println("자동 사진 저장");
	}


	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public LensType getLensType() {
		return lensType;
	}

	public void setLensType(LensType lensType) {
		this.lensType = lensType;
	}

	public Camera(int size, LensType lensType) {
		this.size = size;
		this.lensType = lensType;
	}
}

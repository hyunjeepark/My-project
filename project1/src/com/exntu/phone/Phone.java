package com.exntu.phone;

import java.util.ArrayList;
import java.util.List;

import com.exntu.dto.Button;
import com.exntu.dto.Camera;
import com.exntu.dto.Display;
import com.exntu.impl.BasicFunction;

public class Phone implements BasicFunction{
	
	protected List<Button> buttonList;
	protected List<Camera> cameraList;
	protected Display display;


	public Phone(){ }

	public void uniqueFn(String phoneName) {
		call(phoneName);
		sendSMS(phoneName);
		internet(phoneName);
	}

	@Override
	public void call(String phoneName) {
		if(phoneName.equals("Galaxy")){
			System.out.println("영상통화, 음성통화 가능");
		}else if(phoneName.equals("Iphone")){
			System.out.println("facetime, 음성통화 가능");
		}else{

		}

	}

	@Override
	public void sendSMS(String phoneName) {
		if(phoneName.equals("Galaxy")){
			System.out.println("메세지 가능");
		}else if(phoneName.equals("Iphone")){
			System.out.println("imessage 가능");
		}else{

		}
	}

	@Override
	public void internet(String phoneName) {
		if(phoneName.equals("Galaxy")){
			System.out.println("Google 지원");
		}else if(phoneName.equals("Iphone")){
			System.out.println("Safari 지원");
		}else{

		}

	}
}

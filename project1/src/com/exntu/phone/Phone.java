package com.exntu.phone;

import java.util.ArrayList;
import java.util.List;

import com.exntu.dto.Button;
import com.exntu.dto.Camera;
import com.exntu.dto.Display;
import com.exntu.impl.BasicFunction;

public class Phone implements BasicFunction{
	
	List<Button> btnlist;
	List<Camera> cameralist;
	Display dp;
	
	public void makePhone() {	
		btnlist = new ArrayList<>();
		cameralist = new ArrayList<>();
		dp = new Display();
	}

	@Override
	public void call() {
		System.out.println("전화기능OK");	
	}

	@Override
	public void sendSMS() {
		System.out.println("문자기능OK");		
	}

	@Override
	public void internet() {
		System.out.println("인터넷기능OK");		
	}
	

}

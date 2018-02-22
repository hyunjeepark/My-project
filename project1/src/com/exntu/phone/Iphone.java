package com.exntu.phone;

import java.util.ArrayList;

import com.exntu.dto.Button;
import com.exntu.dto.Camera;
import com.exntu.dto.Display;
import com.exntu.impl.Payment;

public class Iphone extends Phone implements Payment {
	
	@Override
	public void makePhone() {

		btnlist = new ArrayList<>();
		btnlist.add(new Button(10, "red"));
		btnlist.add(new Button(20, "white"));
		btnlist.add(new Button(15, "blue"));
		btnlist.add(new Button(20, "white"));
		System.out.println("버튼  "+btnlist.size()+"개 생성");
		
		cameralist = new ArrayList<>();
		cameralist.add(new Camera(20, "normal"));
		cameralist.add(new Camera(2, "longterm"));
		System.out.println("카메라 "+ cameralist.size()+"개 생성");
		
		dp = new Display(50, true);
		if(dp.isPower()) {
			System.out.println("디스플레이 생성");
		}else {
			System.out.println("디스플레이 꺼져있습니다.");
		}
		
		call();
		sendSMS();
		internet();
		payment();
		
		System.out.println("아이폰 핸드폰 생성완료");

	}

	@Override
	public void payment() {
		System.out.println("�������� OK");
		
	}


}

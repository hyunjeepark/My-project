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
		System.out.println("��ư  "+btnlist.size()+"�� ����");
		
		cameralist = new ArrayList<>();
		cameralist.add(new Camera(20, "normal"));
		cameralist.add(new Camera(2, "longterm"));
		System.out.println("ī�޶� "+ cameralist.size()+"�� ����");
		
		dp = new Display(50, true);
		if(dp.isPower()) {
			System.out.println("���÷��� ����");
		}else {
			System.out.println("���÷��̰� �����ֽ��ϴ�");
		}
		
		call();
		sendSMS();
		internet();
		payment();
		
		System.out.println("������ �ڵ����� �����Ͽ����ϴ�.");

	}

	@Override
	public void payment() {
		System.out.println("�������� OK");
		
	}


}

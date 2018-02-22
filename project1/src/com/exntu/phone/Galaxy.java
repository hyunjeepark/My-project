package com.exntu.phone;

import java.util.ArrayList;
import java.util.List;

import com.exntu.dto.Button;
import com.exntu.dto.Camera;
import com.exntu.dto.Display;
import com.exntu.impl.Payment;

public class Galaxy extends Phone implements Payment{


    public Galaxy() {

        buttonList = new ArrayList<>();
        buttonList.add(new Button(10, "red"));
        buttonList.add(new Button(20, "white"));
        buttonList.add(new Button(15, "blue"));
        System.out.println("버튼  "+buttonList.size()+"개 생성");

        cameraList = new ArrayList<>();
        cameraList.add(new Camera(20, Camera.LensType.FRONT));
        cameraList.add(new Camera(2, Camera.LensType.REAR));
        System.out.println("카메라 "+ cameraList.size()+"개 생성");

        display = new Display(50, true);
        if(display.isPower()) {
            System.out.println("디스플레이 생성");
        }else {
            System.out.println("디스플레이 꺼져있습니다.");
        }


    }

    @Override
    public void payment() {

    }





	/*@Override
	public void makePhone() {

		btnlist = new ArrayList<>();
		btnlist.add(new Button(10, "red"));
		btnlist.add(new Button(20, "white"));
		btnlist.add(new Button(15, "blue"));
		System.out.println("버튼  "+btnlist.size()+"개 생성");
		
		cameralist = new ArrayList<>();
		cameralist.add(new Camera(20, Camera.LensType.FRONT));
		cameralist.add(new Camera(2, Camera.LensType.REAR));
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

		System.out.println("갤럭시 핸드폰 생성완료");

	}*/


	
	

	
}

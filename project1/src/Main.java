import java.util.Scanner;

import com.exntu.phone.Galaxy;
import com.exntu.phone.Iphone;
import com.exntu.phone.Phone;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		Phone iphone=new Iphone(); 
		
		String num;
		
		System.out.println("핸드폰을 생성하시겠습니까?");
		System.out.println("Galaxy : 1  / IPhone : 2");
		num = sc.nextLine();

		
		if(num.equals("1")) {
			Phone galaxy=new Galaxy();
			num="Galaxy";
			galaxy.uniqueFn(num);
		}else if(num.equals("2")) {
			//iphone.makePhone();
		}else{
			System.out.println("1 또는 2를 눌러주세요.");
		}


	}

}

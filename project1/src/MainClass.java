import java.util.Scanner;

import com.exntu.phone.Galaxy;
import com.exntu.phone.Iphone;
import com.exntu.phone.Phone;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Phone galaxy=new Galaxy();
		Phone iphone=new Iphone(); 
		
		String num;
		
		System.out.println("�ڵ��� �����Ͻðڽ��ϱ�?");
		System.out.println("Galaxy : 1  / IPhone : 2");
		num = sc.nextLine();
		
		if(num.equals("1")) {
			galaxy.makePhone();
		}else if(num.equals("2")) {
			iphone.makePhone();
		}else{
			System.out.println("1 �̳� 2���� �����ּ���.");
		}


	}

}

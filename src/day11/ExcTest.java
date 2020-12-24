package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcTest {
	public static void main(String[] args) {
//		try{System.out.println(10/0);
//	}catch(ArithmeticException ae) {
//		System.out.println("0으로는 나눌 수 없습니다");
//
//	}
		
		int num1=0;
		int num2=0;
		while(true) {
		//try~catch 블록: alt + shift + z > ↓ enter
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("num1: ");
			num1=sc.nextInt();
			System.out.print("num2: ");
			num2=sc.nextInt();
			System.out.println("두 수의 나눗셈 결과: "+num1/num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
}
	void badMethod(String msg) {
		if(msg.equals("오류발생")) {
			//오류발생시키기
			
		}
	}

}

class MyException extends Exception{
	
}

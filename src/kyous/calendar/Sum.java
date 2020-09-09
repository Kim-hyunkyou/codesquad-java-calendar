package kyous.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//입력: 키보드
		//출력: 화면에 두 수의 합을 출력한다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("[숫자1] 입력:");
		int num1 = scan.nextInt();
		
		System.out.print("[숫자2] 입력:");
		int num2 = scan.nextInt();
		
		int sum=0;
		sum=(num1+num2);
		
		System.out.println("두 수의 합은 ["+sum+"]");
		
	}
}

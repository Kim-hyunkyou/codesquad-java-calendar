package kyous.calendar;

import java.util.Scanner;

public class MaxMonth {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		System.out.print("반복횟수를 입력하세요.");
		int repeat = scan.nextInt();
		for (int i = 0; i < repeat; i++) {
			System.out.print("몇월을 확인 하시겠습니까?");
			int month = scan.nextInt();
			
			int[] maxDays = { 31, 28, 31, 30, 31, 31, 30, 31, 30, 31 };
			
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, maxDays[month - 1]);
			
		}
		

		System.out.println("Finished~");
		scan.close();

	}
}
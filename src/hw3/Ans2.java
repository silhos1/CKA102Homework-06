package hw3;

import java.util.Scanner;

public class Ans2 {

	public static void main(String[] args) {

		int randomNum = (int) (Math.random() * 101), userGuess = -1;

		Scanner sc = new Scanner(System.in);

//		System.out.println(randomNum);
		System.out.println("開始猜數字吧！");

		while (true) {

			userGuess = sc.nextInt();

			if (randomNum == userGuess) {
				System.out.println("答對了！答案就是" + randomNum);
				break;
			} 
			else if (randomNum > userGuess) {
				System.out.println("猜錯囉！" + userGuess + "小於正確答案");
			} 
			else {
				System.out.println("猜錯囉！" + userGuess + "大於正確答案");
			}

		}
		
		sc.close();

	}

}

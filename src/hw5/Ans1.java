package hw5;

import java.util.Scanner;

public class Ans1 {

	public static void starSquare(int width, int height) {

		for (int i = 0; i < height; i++) {
			
			for (int j = 0; j < width; j++)
				System.out.print("*");
			
			System.out.println();
		}
		

	}

	//
	// main
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int width, height;
		
		System.out.println("請輸入寬和高：");
		width = sc.nextInt();
		height = sc.nextInt();
		starSquare(width, height);

		
		sc.close();
	}
}

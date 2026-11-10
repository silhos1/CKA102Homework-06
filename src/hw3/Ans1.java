package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Ans1 {

	public static void checkTriType(int[] array) {

		Arrays.sort(array);

		if (array[0] < 0 && (array[0] + array[1]) > array[2]) {

			if (array[0] == array[1] && array[0] == array[2]) {
				System.out.println("正三角形");
			}

			else if (Math.pow(array[0], 2) + Math.pow(array[1], 2) == Math.pow(array[2], 2)) {
				System.out.println("直角三角形");
			}

			else if (array[0] == array[1] || array[1] == array[2]) {
				System.out.println("等腰三角形");
			}

			else {
				System.out.println("其他三角形");
			}
		}

		else {
			System.out.println("不是三角形");
		}

	}

	
	// main here
	public static void main(String[] args) {

		int sideLength = 0;
		int[] triArray = new int[3];

		System.out.println("請輸入三個整數：");

		Scanner sc = new Scanner(System.in);

		sideLength = sc.nextInt();
		triArray[0] = sideLength;
		sideLength = sc.nextInt();
		triArray[1] = sideLength;
		sideLength = sc.nextInt();

		triArray[2] = sideLength;

		checkTriType(triArray);

		sc.close();
	}

}

package hw4;

import java.util.Scanner;

public class Ans5 {

	public static boolean yearJudge(int year) {

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}

	}

	public static int addDate(int[] dateArray, int month, int day) {
		int sum = 0;
		for (int i = 0; i < month - 1; i++) {
			sum += dateArray[i];
		}
		sum += day;
		return sum;
	}

	public static void countValidDate(boolean judge, int month, int day) {

		final int[] leapDate = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		final int[] normalDate = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		System.out.println(month +" " + day);

		if ((month <= 12 && month > 0) && (day > 0)) {

			if (judge) { // leap year

				if (day <= leapDate[month - 1]) {
					System.out.print("輸入的日期為該年第" + addDate(leapDate, month, day) + "天");
				} else {System.out.println("錯誤日期！");}
			}

			else { // normal year

				if (day <= normalDate[month - 1]) {
					System.out.print("輸入的日期為該年第" + addDate(normalDate, month, day) + "天");
				} else {	System.out.println("錯誤日期！");}
			}

		} else {System.out.println("錯誤日期！");}

	}

	// main here
	public static void main(String[] args) {

		int year, month, day;
		boolean leapYear;

		Scanner sc = new Scanner(System.in);

		year = sc.nextInt();
		leapYear = yearJudge(year);
//		System.out.println(leapYear);

		month = sc.nextInt();
		day = sc.nextInt();

//		System.out.print(month + " " + day);
		if(year>0) {
			countValidDate(leapYear, month, day);
		}else {System.out.println("錯誤日期！");}
		

		sc.close();
	}

}

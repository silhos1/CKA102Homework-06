package hw3;


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ans3Adv {

	public static void delList(int delNum, List<Integer> list1) {

		for (int i = 1; i <= 49; i++) {

			if (i % 10 == delNum) {
				list1.set(i - 1, 0);
			} 
			else if (i / 10 == delNum) {
				list1.set(i - 1, 0);
			}

		}

		for (int j = list1.size() - 1; j >= 0; j--) {

			if (list1.get(j) == 0)
				list1.remove(j);

		}
//		System.out.println(list1);
	}

	public static void pickNum(List<Integer> list1) {
		
		System.out.print("選號： ");
		for (int i = 0; i < 6; i++) {
			
			int num1 = (int)(Math.random() * list1.size());
			
			System.out.print(list1.get(num1) + " ");
			list1.remove(num1);
			
		}

	}

	
	
	
	// main here
	public static void main(String[] args) {

		int hateNum = 0;

		System.out.println("阿文...請輸入你討厭哪個數字？");

		Scanner sc = new Scanner(System.in);
		List<Integer> lottery = new ArrayList<Integer>();
		
		hateNum = sc.nextInt();

		for (int i = 1; i <= 49; i++) {
			lottery.add(i);
		}

//		System.out.println(lottery);
		delList(hateNum, lottery);
//		System.out.println(lottery);

		for (int i = 0; i < lottery.size(); i++) {

			System.out.print(lottery.get(i) + "\t");

			if ((i + 1) % 6 == 0)
				System.out.println();
		}
		System.out.println("總共有" + lottery.size() + "數字可選");

		pickNum(lottery);

		sc.close();
	}

}

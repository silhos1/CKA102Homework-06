package hw3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ans3AdvForFun {

	public static void delList(int delNum, List<Integer> list1) {

		for (int i = 1; i <= list1.size(); i++) {

			if (list1.get(i - 1) % 10 == delNum) {
				list1.set(i - 1, 0);
			} else if (list1.get(i - 1) / 10 == delNum) {
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

			int num1 = (int) (Math.random() * list1.size());

			System.out.print(list1.get(num1) + " ");
			list1.remove(num1);

		}

	}

	// main here
	public static void main(String[] args) {

		int hateNum = 0, count = 0;

		System.out.println("阿文...請輸入你討厭哪個數字？");

		Scanner sc = new Scanner(System.in);
		List<Integer> lottery = new ArrayList<Integer>();

		for (int i = 1; i <= 49; i++) {
			lottery.add(i);
		}

		while (true) {

			hateNum = sc.nextInt();
			if (hateNum == -1)
				break;

			count++;
			if (count == 5)
				System.out.println("Seriously?");
			delList(hateNum, lottery);

			for (int i = 0; i < lottery.size(); i++) {

				System.out.print(lottery.get(i) + "\t");

				if ((i + 1) % 6 == 0)
					System.out.println();
			}
			System.out.println("總共有" + lottery.size() + "數字可選");

			System.out.println("輸入下一個討厭的數字，-1退出：");

		}

//		System.out.println(lottery);

		if (lottery.size() >= 6)
			pickNum(lottery);
		else
			System.out.println("數字不夠選啦！");

		sc.close();
	}

}

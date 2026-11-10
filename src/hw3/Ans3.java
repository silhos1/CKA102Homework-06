package hw3;

import java.util.Scanner;

public class Ans3 {

	public static void main(String[] args) {
		int hateNum = 0;

		System.out.println("阿文...請輸入你討厭哪個數字？");
		Scanner sc = new Scanner(System.in);
		hateNum = sc.nextInt();
		
		int count = 0;
		
		for (int i = 1; i <= 49; i++) {
			
			if(i%10 == hateNum)
				continue;
			else if(i/10 == hateNum)
				continue;
			
			count ++;
			System.out.print(i + "\t");
			
			if (count % 6 == 0)
				System.out.println();
		}
		System.out.println("總共有" + count + "數字可選");
		
		sc.close();
	}

}

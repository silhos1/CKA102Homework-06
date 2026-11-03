package hw2;

public class Ans5 {

	public static void main(String[] args) {

		int numCount = 0;
		System.out.print("阿文可以選擇 ");
		for (int i = 1; i <= 49; i++) {

			if (i % 10 == 4)
				continue;
			if (i / 10 == 4)
				continue;

			System.out.print(i + " ");
			numCount += 1;

		}
		System.out.printf("%n總共有%d個", numCount);

	}

}

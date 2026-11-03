package hw2;

public class Ans7 {

	public static void main(String[] args) {

		int wordPrintOut = 65;
		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print((char) wordPrintOut);

			}
			System.out.println();
			wordPrintOut += 1;

		}

	}

}

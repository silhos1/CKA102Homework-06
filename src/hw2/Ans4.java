package hw2;

public class Ans4 {

	public static void main(String[] args) {

		int i = 1, sum = 0;
		while (true) {

			if (sum == 100)
				break;

			if (i % 2 != 0) {
				sum += i;
				System.out.print(sum + " ");
			}

			i += 1;

		}

	}

}

// 1 4 9 16 25
// 1+3+5+ 7+ 9... 
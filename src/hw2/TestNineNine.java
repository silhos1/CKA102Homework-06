package hw2;

public class TestNineNine {

	public static void main(String[] args) {

		int i = 1, j = 1;

//		for - while
		for (i = 1; i <= 9; i++) {

			j = 1;
			while (j < 10) {

				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j += 1;

			}
			System.out.println();

		}

		System.out.println("======================================================================");

//		for - do while
		for (i = 1; i <= 9; i++) {

			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j += 1;

			} while (j < 10);
			System.out.println();

		}

		System.out.println("======================================================================");

//		while - do while
		i = 1;
		while (i <= 9) {
			
			j = 1;
			do {

				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j += 1;

			} while (j < 10);
			System.out.println();
			i++;
		}

	}

}

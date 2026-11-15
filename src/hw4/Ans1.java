package hw4;

public class Ans1 {

	public static void main(String[] args) {

		int sum = 0;
		double avg;
		int[] array1 = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		for (int i = 0; i < array1.length; i++) {
			sum += array1[i];
		}

		avg = sum / array1.length;
		System.out.println("Average = " + avg);

		System.out.print("> Average = ");

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > avg) {
				System.out.print(array1[i] + " ");
			}
		}

	}

}

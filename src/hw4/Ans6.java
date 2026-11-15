package hw4;

public class Ans6 {

	public static void main(String[] args) {

		int[] count1st = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int[][] students = { 
				{ 10, 37, 100, 77, 98, 90 }, // 1
				{ 35, 75, 70, 95, 70, 80 }, // 2
				{ 40, 77, 79, 70, 89, 100 }, // 3
				{ 100, 89, 90, 89, 90, 75 }, // 4
				{ 90, 64, 75, 60, 75, 50 }, // 5
				{ 85, 75, 70, 75, 90, 20 }, // 6
				{ 75, 70, 79, 85, 89, 99 }, // 7
				{ 70, 95, 90, 89, 90, 75 } // 8
		};

		for (int i = 0; i < students[0].length; i++) {
			int maxScore = -1;
			int maxIndex = -1;

			for (int j = 0; j < students.length; j++) {

				if (maxScore < students[j][i]) {
					maxScore = students[j][i];
					maxIndex = j;
				}

			}
//			System.out.println(maxScore + " " + maxIndex);
			count1st[maxIndex] += 1;

		}

		for (int i = 0; i < count1st.length; i++)
			System.out.println((i + 1) + "號同學考最高分的次數為" + count1st[i] + "次");

	}

}

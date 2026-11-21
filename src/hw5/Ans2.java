package hw5;

public class Ans2 {

	public static void randAvg() {

		int[] arr1 = new int[10];
		int sum = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 101);
			sum += arr1[i];
			System.out.print(arr1[i] + " ");
			
		}
//		System.out.println(sum);
		System.out.println("\n" + (sum / arr1.length));

	}

	//
	// main
	public static void main(String[] args) {
		
		System.out.println("本次亂數結果：");
		randAvg();

	}

}

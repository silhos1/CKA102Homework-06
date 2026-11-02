package hw1;

public class Ans6 {

	public static void main(String[] args) {

		System.out.println(5 + 5);
//		整數5 + 整數5 = 10

		System.out.println(5 + '5');
//		5的Unicode=U+0035，16進位轉成10進位=53，整數5 + 字元'5' = 5 + 53 = 58
//		System.out.println(\u0035);

		System.out.println(5 + "5");
//		整數5 + 字串5 會變成字串串接，5 + "5" =  "5" + "5" = 55

	}

}

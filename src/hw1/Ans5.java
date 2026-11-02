package hw1;

public class Ans5 {

	public static void main(String[] args) {
		//FV=PV(1+i)^n
		
		int bankMoney = 1_500_000, n = 10;
		float i = 0.02f;

//		System.out.println("共有" + FV + "元");
		System.out.printf("共有%.2f元", (bankMoney * Math.pow((1 + i), n)));
	}

}

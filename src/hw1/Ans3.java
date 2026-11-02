package hw1;

public class Ans3 {

	public static void main(String[] args) {

		int secTotal = 256559;
		int day, hour, min;

		day = secTotal / (24 * 60 * 60);
		secTotal = secTotal % (24 * 60 * 60);
//		System.out.println(secTotal);

		hour = secTotal / (60 * 60);
		secTotal = secTotal % (60 * 60);
		
		min = secTotal / 60;
		secTotal = secTotal % 60;

//		System.out.println("256559秒是" + day + "天" + hour + "小時" + min + "分" + secTotal + "秒");
		
		System.out.print("256559秒是" + day + "天");
		System.out.print(hour + "小時");
		System.out.print(min + "分");
		System.out.print(secTotal + "秒");

	}

}

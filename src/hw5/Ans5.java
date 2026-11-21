package hw5;


public class Ans5 {
	 
	public static String genAuthCode(int authLength) {
		
//		final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		final String lower = "abcdefghijklmnopqrstuvwxyz";
//		final String num = "0123456789";
		
		final String full = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String authCode = "";
		
		for (int i = 0;i < authLength;i++) {
			authCode += full.charAt((int) (Math.random() * full.length()));
		}
		
		return authCode;
	
	}

	//
	//	main
	public static void main(String[] args) {
		
		System.out.println("本次隨機產生驗證碼為：");
		System.out.println(genAuthCode(8));
		
	}

}

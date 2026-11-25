package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		Calculator cal1 = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			try {
				
				System.out.println("請輸入x的值：");
				int x = sc.nextInt();
				System.out.println("請輸入y的值：");
				int y = sc.nextInt();

				System.out.println(x + "的" + y + "次方等於" + cal1.powerXY(x, y));
				
			} catch (CalException ce) {
				System.out.println(ce.getMessage());
			} catch (InputMismatchException ime) {
				System.out.println("輸入格式不正確");
				sc.nextLine();			
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}

	}

}

package hw4;

import java.util.Scanner;

public class Ans4 {

	public static void main(String[] args) {

		Employee e1 = new Employee(25, 2500);
		Employee e2 = new Employee(32, 800);
		Employee e3 = new Employee(8, 500);
		Employee e4 = new Employee(19, 1000);
		Employee e5 = new Employee(27, 1200);

		Employee[] emps = { e1, e2, e3, e4, e5 };

		int borrowMoney, count = 0;
		
		Scanner sc = new Scanner(System.in);
		borrowMoney = sc.nextInt();

		System.out.print("有錢可借的員工編號: ");
		for (int i = 0; i < emps.length; i++) {
			
			if (borrowMoney <= emps[i].getMoney()) {
				System.out.print(emps[i].getId() + " ");
				count++;
			}
			
		}
		System.out.println("共" + count + "人");

		
		sc.close();
	}

}

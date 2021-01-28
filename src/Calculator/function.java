package Calculator;

import java.util.Scanner;

public class function {

	public static void main(String[] args) {

		int option=1;
		
		while (option != 0) {
			Scanner sc = new Scanner(System.in);
		
			System.out.println("please enter your first number");
			int a = sc.nextInt();
			System.out.println("please enter your second  number");
			int b = sc.nextInt();
			System.out.println(" 1: Add \n 2: Sub \n 3: Mul \n 4: Div \n 5: Exit \n");
			System.out.println("Enter your choice");
			option = sc.nextInt();
			
			switch (option) {

			case 1:

				Sum sum = new Sum();
				int res = sum.sum(a, b);
				System.out.println("result is :" + res);
				System.out.println("press 1 to continue 0  to exit");
				option = sc.nextInt();
				break;
			case 2:
				Subtract sb = new Subtract();
				float res1 = sb.subtract(a, b);
				System.out.println("result is :" + res1);
				System.out.println("press 1 to continue 0  to exit");
				option = sc.nextInt();
				break;
			case 3:
				Multiply mul = new Multiply();
				double res11 = mul.Mul(a, b);
				System.out.println("result is :" + res11);
				System.out.println("press 1 to continue 0  to exit");
				option = sc.nextInt();
				break;
			case 4:
				Devide dev = new Devide();
				float r = dev.devide(b, a);
				System.out.println("result is :" + r);
				System.out.println("press 1 to continue 0  to exit");
				option = sc.nextInt();
				break;
			case 5:
				System.exit(0);

			}
			sc.close();
		} 

	}

}

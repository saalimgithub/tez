package Hit;

import java.util.Scanner;

public class Demo {

	public static void string(String s) {
		s = "Radiance";
		System.out.println(s);
	}

	public static void display(int a[]) {
		a[0] = 100;
		System.out.println(a[0]);
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		String s = "Saalim";
		System.out.println(s);
		string(s);
		System.out.println(s);

		int b[] = { 10, 20 };
		System.out.println("Before Sending b[0] = " + b[0]);
		display(b);
		System.out.println("After Sending b[0] = " + b[0]);
//		b[0]=90;
//		System.out.println(b[0]);
//		display(b);
//		System.out.println(b[0]);
		
		

		// boolean b = false;

//		if (b) {
//			System.out.println("Its True");
//		} else {
//			System.out.println("False");
//		}
//
//		// ternary Operator
//		String result = (b) ? "this is true " : "this is false .........";
//		System.out.println(result);
//
//		result = (13 % 2 == 0) ? "Even " : "Odd ";
//
//		System.out.println(result);
//
//		int y = (125 % 2 == 0) ? 0 : 1;
//		System.out.println(y);

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter  Number One");
//		int z = sc.nextInt();
//		System.out.println("Enter  Number two");
//		int a = sc.nextInt();
//		System.out.println("First entered " + z);
//		while (z < 10) {
//			System.out.println("the value of z is " + z);
//			z++;
//		}
//
//		System.out.println("\n ------------ \n");
//		System.out.println("Second entered " + a);
//		do {
//			System.out.println("the value of z is " + z);
//			z++;
//		} while (a < 10);

		// int ary[][] = { { 10, 20, 30 ,50,90 }, { 12, 89, 00 } ,{1} };

//		int ary[][]=new int[3][3];
//		
//		for (int i = 0; i < ary.length; i++) {
//			for (int j = 0; j < ary[i].length; j++) {
//				System.out.print("Enter the Number "+i+j+"\t");
//				 ary[i][j]=sc.nextInt();
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//
//		for (int i = 0; i < ary.length; i++) {
//			for (int j = 0; j < ary[i].length; j++) {
//				System.out.print(i+""+j+" "+ary[i][j] + "\t");
//			}
//			System.out.println();
//		}

	}
}

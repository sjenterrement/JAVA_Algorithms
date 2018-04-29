package chapter_1;

import java.util.Scanner;

public class Pct_1_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input 3 integer: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a == b && b == c) {
			System.out.println("equal");
		} else
			System.out.println("not equal");

	}

}

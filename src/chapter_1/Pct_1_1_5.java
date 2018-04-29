package chapter_1;

import java.util.Scanner;

public class Pct_1_1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print two number: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		if ((x > 0 && x < 1) && (y > 0 && y < 1))
			System.out.println("true");
		else
			System.out.println("false");

	}

}

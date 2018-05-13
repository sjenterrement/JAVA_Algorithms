package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Pct_1_1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.print("input a decimalism number: ");
		String s = "";
		int N = StdIn.readInt();
		for (int n = N; n > 0; n /= 2) {
			s = (n % 2) + s;
		}
		StdOut.println("the binary number is: "+s);

	}

}

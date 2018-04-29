package chapter_1;

import edu.princeton.cs.algs4.StdOut;

public class Pct_1_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			//System.out.println(f);
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}
}

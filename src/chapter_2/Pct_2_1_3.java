package chapter_2;

import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Pct_2_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		StdOut.print("the number of array: ");
		N = StdIn.readInt();
		Integer[] a = new Integer[N];
		StdOut.print("input array: ");
		for (int i = 0; i < N; i++) {
			a[i] = StdIn.readInt();
		}
		Selection.sort(a);

		StdOut.print("after sort: ");
		for (int i = 0; i < N; i++) {
			StdOut.printf("%d ", a[i]);
		}

	}
}

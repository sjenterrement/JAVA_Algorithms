package chapter2;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class Pct_2_1_7 {

	
	public static void main(String[] args) {
		String alg1 = StdIn.readString();
		String alg2 = StdIn.readString();
		int N = StdIn.readInt();
		int T = StdIn.readInt();
		double t1 = timeInverseInput(alg1, N, T);
		double t2 = timeInverseInput(alg2, N, T);
		StdOut.printf("for %d inverse Doules\n  %s is", N, alg1);
		StdOut.printf(" %.1f times faster than %s\n", t2 / t1, alg2);

	}

	public static double timeInverseInput(String alg, int N, int T) {
		double total = 0.0;
		Double[] a = new Double[N];
		for (int t = 0; t < T; t++) {
			for (int i = 0; i < N; i++) {
				a[i] = (1.0 * (N - i));
			}
			total += time(alg, a);
		}
		return total;
	}

	public static double time(String alg, Double[] a) {
		Stopwatch timer = new Stopwatch();
		if (alg.equals("Insertion"))
			Insertion.sort(a);
		if (alg.equals("Selection"))
			Selection.sort(a);
		return timer.elapsedTime();
	}
}
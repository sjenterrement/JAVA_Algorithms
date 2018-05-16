package chapter2;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=50;
		double[] a=new double[n];
		for (int i = 0; i < n; i++) {
			a[i]=StdRandom.random();
			
		}
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			double x=1.0*i/n;
			double y=(double)a[i]/2.0;
			double rw=0.5/n;
			double rh=(double)a[i]/2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}

}

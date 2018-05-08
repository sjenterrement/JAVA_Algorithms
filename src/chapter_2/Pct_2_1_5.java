package chapter_2;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Pct_2_1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		StdOut.print("input the number of array: ");
		N=StdIn.readInt();
		StdOut.print("input array: ");
		Integer[] a=new Integer[N]; 
		
		for (int i = 0; i < N; i++) {
			a[i]=StdIn.readInt();
		}
		
		Insertion.sort(a);
		
		StdOut.print("after sort: ");
		for (int i = 0; i < N; i++) {
			StdOut.printf("%d ",a[i]);
		}
	}
}

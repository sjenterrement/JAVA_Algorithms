package chapter_2;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class Pct_2_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N=2000;
		double t1,t2;
		Integer[] a=new Integer[N];
		for (int i = 0; i < N; i++) {
			a[i]=32;//设置任意相同主键数组
		}
		Stopwatch timer2=new Stopwatch();
		Insertion.sort(a);
		t2=timer2.elapsedTime();
		StdOut.println("insertion time: "+t2+"s");
		Stopwatch timer1=new Stopwatch();
		Selection.sort(a);
		t1=timer1.elapsedTime();
		StdOut.println("selection time: "+t1+"s");

		
		
		if(t1>t2)
			StdOut.println("insertion fast");
		else
			StdOut.println("selection fast");
		
	}

}

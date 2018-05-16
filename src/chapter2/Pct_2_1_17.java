package chapter2;

import java.util.ArrayList;
import java.util.Collection;

import edu.princeton.cs.algs4.Shell;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Pct_2_1_17 {
	 private static void sort(Comparable[] a) {
	        int n = a.length;
	        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ... 
	        int h = 1;
	        while (h < n/3) h = 3*h + 1; 

	        while (h >= 1) {
	            // h-sort the array
	        	
	        		for (int i = h; i < n; i++) {
		                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
		                    exch(a, j, j-h);
		                }
		            }
		            assert isHsorted(a, h); 
		        
		            
		        
		            h /= 3;
		            
			
			
	            for (int i = h; i < n; i++) {
	                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
	                    exch(a, j, j-h);
	                }
	            }
	            assert isHsorted(a, h); 
	        
	            
	        
	            h /= 3;
	            
	           
	        }
	        assert isSorted(a);
			
	    }



	   /***************************************************************************
	    *  Helper sorting functions.
	    ***************************************************************************/
	    
	    // is v < w ?
	    private static boolean less(Comparable v, Comparable w) {
	        return v.compareTo(w) < 0;
	    }
	        
	    // exchange a[i] and a[j]
	    private static void exch(Object[] a, int i, int j) {
	        Object swap = a[i];
	        a[i] = a[j];
	        a[j] = swap;
	    }


	   /***************************************************************************
	    *  Check if array is sorted - useful for debugging.
	    ***************************************************************************/
	    private static boolean isSorted(Comparable[] a) {
	        for (int i = 1; i < a.length; i++)
	            if (less(a[i], a[i-1])) return false;
	        return true;
	    }

	    // is the array h-sorted?
	    private static boolean isHsorted(Comparable[] a, int h) {
	        for (int i = h; i < a.length; i++)
	            if (less(a[i], a[i-h])) return false;
	        return true;
	    }

	    // print array to standard output
	    private static void show(Comparable[] a) {
	        for (int i = 0; i < a.length; i++) {
	        	for (int j = 0; j < a.length; j++) {
	    			double x=2.0*j/a.length;
	    			double y=(double)a[j]/32.0;
	    			double rw=0.5/a.length;
	    			double rh=(double)a[j]/4.0;
	    			StdDraw.filledRectangle(x, y, rw, rh);
	    		}
	        }
	       
	    }

	    /**
	     * Reads in a sequence of strings from standard input; Shellsorts them; 
	     * and prints them to standard output in ascending order. 
	     *
	     * @param args the command-line arguments
	     */
	    public static void main(String[] args) {
	    	int N=155;
	        Double[] a=new Double[N];
	        for (int i = 0; i < N; i++) {
				a[i]=StdRandom.random();
			}
	        sort(a);
	        show(a);
	    }

}
package leetCode;

import java.util.Scanner;

public class IsPalindrome {
	public static boolean isPalindrome(int x) {
		if(x<0)
			return false;
		int a=0,res = 0;
		for (int i = x; i!=0; i/=10) {
			a=i%10;
			res=res*10+a;
		}
		
		return res==x;
		
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		System.out.println(isPalindrome(x));
	}

}

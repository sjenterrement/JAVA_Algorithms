package leetCode;

import java.util.Scanner;

public class IsPalindrome {
	public static boolean isPalindrome(int x) {
		int a,res=0;
		if(x>0)
			return false;
		else if(x%10==0)
			return false;
		for (int temp = x; temp!=0; temp/=10) {
		a=temp%10;
			res=res*10+a;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		System.out.println(isPalindrome(x));
	}

}

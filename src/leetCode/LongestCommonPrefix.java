package leetCode;

import java.util.ArrayList;

public class LongestCommonPrefix {

	public void LongestCommonPrefix(String[] strs) {
		String[] s= {"leets","leetcode","leet","lee"};
		if(s.length==0)
			System.out.println("error");
		
		String prefix=s[0];
		
		for (int i = 1; i < s.length; i++) {
			while (s[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0, prefix.length()-1);
				if (prefix.isEmpty()) {
					System.out.println("没有相同的前缀");
				}
			}
		}
	}
}

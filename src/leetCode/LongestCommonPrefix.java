package leetCode;

import java.util.ArrayList;

public class LongestCommonPrefix {

	public String LongestCommonPrefix(String[] strs) {
		int p = 0;
		ArrayList<String> List1 = new ArrayList<String>();

		for (String s : strs) {
			List1.add(s);
			p++;
		}
		for (int i = 0; i < p; i++) {
			for (int i1 = 0; i1 < List1.get(i).toCharArray().length; i1++) {
				for (int i2 = 0; i2 < List1.get(i+1).toCharArray().length; i2++) {
					for (int i3 = 0; i3 < strs.length; i3++) {
						
					}
					
				}
			}
		}

		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

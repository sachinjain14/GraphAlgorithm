package com.java.lengthofshotestchaintoreachtargetword;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LengthofShortestChaintoTargetWordUtility {
	boolean checkLengthofAllWordsinSet(Set<String> set) {
		List<String> al = new ArrayList<String>();
		al.addAll(set);
		
		int firstWordLength = al.get(0).length();
		
		for(int i = 1; i < al.size(); i++) {
			if(firstWordLength != al.get(i).length()) {
				return false;
			}
		}
		
		return true;
	}
	
	boolean isadjacent(String str1, String str2) {
		String a = str1.toLowerCase();
		String b = str2.toLowerCase();
		int count = 0;
		int n = a.length(); 

		for (int i = 0; i < n; i++) { 
			if (a.charAt(i) != b.charAt(i)) {
				count++;
			}
			
			if(count > 1) {
				return false; 
			}
		}
		
		return (count == 1 ? true : false); 
	} 
}

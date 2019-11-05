//SOURCE :: https://www.geeksforgeeks.org/word-ladder-length-of-shortest-chain-to-reach-a-target-word/

package com.java.lengthofshotestchaintoreachtargetword;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LengthofShortestChaintoTargetWordMain {
	public static void main(String[] args) {
		ReadInputFile readInputFile = new ReadInputFile("LengthofShortestChaintoTargetWord_Input.txt");
		ArrayList<String> l = readInputFile.getListOfWords();
		Set<String> set = new HashSet<String>();

		for(String s : l) {
			set.add(s.toLowerCase());
		}
		
		System.out.println("Input Words :: "+set);
		
		LengthofShortestChaintoTargetWordUtility ul = new LengthofShortestChaintoTargetWordUtility();

		if(ul.checkLengthofAllWordsinSet(set)) {
			System.out.println(ul.isadjacent("poon", "plee"));
		}
	}
}

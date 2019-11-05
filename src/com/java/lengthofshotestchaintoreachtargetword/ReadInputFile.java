package com.java.lengthofshotestchaintoreachtargetword;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadInputFile {
	String fileName;
	ArrayList<String> al = null;

	public ReadInputFile(String fileName) {
		this.fileName = fileName;
		al = new ArrayList<String>();
	}
	
	public ArrayList<String> getListOfWords() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String allWords = sc.next();
		String allWordsList[] = allWords.split(",");
		
		for(String word : allWordsList) {
			al.add(word);
		}
		
		sc.close();
		return al;
	}
}

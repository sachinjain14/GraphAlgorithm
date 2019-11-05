package com.java.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GraphAdjencyListImpl {
	String fileName;

	public GraphAdjencyListImpl(String fileName) {
		this.fileName = fileName;
	}
	
	public GraphAL getGraph() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int no_of_vertices = sc.nextInt();
		GraphAL graph = new GraphAL(no_of_vertices);

		for(int i = 0; i < no_of_vertices; i++) {
			for(int j = 0; j < no_of_vertices; j++) {
				if(sc.nextInt() == 1){
					graph.addEdge(i, j);
				}
			}
		}
		sc.close();
		return graph;
	}
}

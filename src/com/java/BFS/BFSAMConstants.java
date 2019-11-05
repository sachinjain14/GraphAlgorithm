package com.java.BFS;

import java.util.LinkedList;
import java.util.Queue;

import com.java.graph.GraphAM;

public class BFSAMConstants {
	Queue<Integer> queue = null;
	public static final int NONE = -1;
	int no_of_vertices = 0;
	String color[] = null;
	int distance[] = null;
	int prev[] = null;
	
	BFSAMConstants(GraphAM graph) {
		queue = new LinkedList<Integer>();
		no_of_vertices = graph.getNoOfVertices();
		color = new String[no_of_vertices];
		distance = new int[no_of_vertices];
		prev = new int[no_of_vertices];	
	}
}

package com.java.DFS;

import java.util.Stack;

import com.java.color.Color;
import com.java.graph.GraphAL;

public class DFSALConstants {
	public static final int NONE = -1;
	int no_of_vertices = 0;
	String color[] = null;
	int distance[] = null;
	int prev[] = null;
	int start_time[] = null;
	int end_time[] = null;
	int time = 0;
	int dist = -1;
	Stack<Integer> stack = null;
	
	DFSALConstants(GraphAL graph) {
		no_of_vertices = graph.getNoOfVertices();
		color = new String[no_of_vertices];
		distance = new int[no_of_vertices];
		prev = new int[no_of_vertices];
		start_time = new int[no_of_vertices];
		end_time = new int[no_of_vertices];
		stack = new Stack<Integer>();

		for(int i = 0; i < no_of_vertices; i++) {
			color[i] = Color.WHITE.getColor();
			distance[i] = 0;
			prev[i] = NONE;
			start_time[i] = 0;
			end_time[i] = 0;
		}
	}
}

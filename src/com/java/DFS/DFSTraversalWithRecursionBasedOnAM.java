package com.java.DFS;

import com.java.color.Color;
import com.java.graph.GraphAM;

public class DFSTraversalWithRecursionBasedOnAM extends DFSAMConstants {
	public DFSTraversalWithRecursionBasedOnAM(GraphAM graph) {
		super(graph);
	}
	
	public void dfsTraversalWithRecursion(GraphAM graph, int vertex) {
		color[vertex] = Color.GREY.getColor();
		start_time[vertex] = ++time;
		distance[vertex] = ++dist;

		for(int i = 0; i < graph.getNoOfVertices(); i++) {
			if(graph.checkEdge(vertex, i) && color[i].endsWith(Color.WHITE.getColor())) {
				color[i] = Color.GREY.getColor();
				prev[i] = vertex;
				dfsTraversalWithRecursion(graph,i);
			}
		}

		color[vertex] = Color.BLACK.getColor();
		end_time[vertex] = ++time;
		--dist;
	}

	public void printDFSWithRecursionGraph(GraphAM graph) {
		for(int i = 0; i < graph.getNoOfVertices(); i++) {
			System.out.println("NODE = "+(i+1)+", Color = "+color[i]+", Distance = "+distance[i]+", Previous = "+(prev[i]+1)+", start_time = "+start_time[i]+", end_time = "+end_time[i]);
		}
	}
	
	public String[] getVertexColorArray() {
		return color;
	}
	
	public int[] getVertexDistanceArray() {
		return distance;
	}
	
	public int[] getVertexPreviousElementArray() {
		return prev;
	}
	
	public int[] getVertexStartTimeArray() {
		return start_time;
	}
	
	public int[] getVertexEndTimeArray() {
		return end_time;
	}
}

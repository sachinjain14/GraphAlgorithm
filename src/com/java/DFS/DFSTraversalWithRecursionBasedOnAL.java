package com.java.DFS;

import com.java.color.Color;
import com.java.graph.GraphAL;

public class DFSTraversalWithRecursionBasedOnAL extends DFSALConstants {
	public DFSTraversalWithRecursionBasedOnAL(GraphAL graph) {
		super(graph);
	}
	
	public void dfsTraversalWithRecursion(GraphAL graph, int vertex) {
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

	public void printDFSWithRecursionGraph(GraphAL graph) {
		for(int i = 0; i < graph.getNoOfVertices(); i++) {
			System.out.println("NODE = "+(i+1)+", Color = "+color[i]+", Distance = "+distance[i]+", Previous = "+(prev[i]+1)+", start_time = "+start_time[i]+", end_time = "+end_time[i]);
		}
	}
}

package com.java.BFS;

import com.java.color.Color;
import com.java.graph.GraphAL;

public class BFSTraversalBasedOnAL extends BFSALConstants {
	public BFSTraversalBasedOnAL(GraphAL graph) {
		super(graph);
	}
	
	public void bfsTraversal(GraphAL graph, int source) {
		int element = 0;
		
		for(int i = 0; i < graph.getNoOfVertices(); i++) {
			color[i] = Color.WHITE.getColor();
			distance[i] = 0;
			prev[i] = NONE;
		}
		
		color[source] = Color.GREY.getColor();
		distance[source] = 0;
		prev[source] = NONE;
		queue.add(source);
		
		while(!queue.isEmpty()) {
			element = queue.remove();
			
			for(int i = 0; i < no_of_vertices; i++) {
				if(graph.checkEdge(element, i) && color[i].endsWith(Color.WHITE.getColor())) {
					color[i] = Color.GREY.getColor();
					distance[i] = distance[element]+1;
					prev[i] = element;
					queue.add(i);
				}
			}
			
			color[element] = Color.BLACK.getColor();
		}
	}
	
	public void printBFSGraph() {
		for(int i = 0; i < no_of_vertices; i++) {
			System.out.println("NODE = "+(i+1)+", Color = "+color[i]+", Distance = "+distance[i]+", Previous = "+(prev[i]+1));
		}
	}
}

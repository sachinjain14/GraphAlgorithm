package com.java.DFS;

import com.java.color.Color;
import com.java.graph.GraphAL;


public class DFSTraversalWithoutRecursionBasedOnAL extends DFSALConstants {
	public DFSTraversalWithoutRecursionBasedOnAL(GraphAL graph) {
		super(graph);
	}
	
	public void dfsTraversalWithoutRecursion(GraphAL graph, int source) {		
		int element = source;		
		int i = source;
		color[source] = Color.GREY.getColor();
		distance[source] = ++dist;
		prev[source] = NONE;
		start_time[source] = ++time;
		stack.push(source);

		while (!stack.isEmpty()) {
			element = stack.peek();
			i = element;	
			
			while(i < graph.getNoOfVertices()) {
				if(graph.checkEdge(element, i) && color[i].endsWith(Color.WHITE.getColor())) {
					stack.push(i);
					color[i] = Color.GREY.getColor();
					distance[i] = ++dist;
					prev[i] = element;
					start_time[i] = ++time;
					
					element = i;
					i = 1;
					continue;
				}
				i++;
			}
			
			color[element] = Color.BLACK.getColor();
			end_time[element] = ++time;
			--dist;
			stack.pop();	
		}	
	}

	public void printDFSWithoutRecursionGraph(GraphAL graph) {
		for(int i = 0; i < graph.getNoOfVertices(); i++) {
			System.out.println("NODE = "+(i+1)+", Color = "+color[i]+", Distance = "+distance[i]+", Previous = "+(prev[i]+1)+", start_time = "+start_time[i]+", end_time = "+end_time[i]);
		}
	}
}

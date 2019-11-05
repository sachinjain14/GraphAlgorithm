package com.java.topologicalsorting;

import java.util.Stack;
import com.java.graph.GraphAM;

public class TologicalSortingUtility {
	GraphAM graph = null;
	Stack<Integer> stack = null;
	boolean visited[] = null;

	TologicalSortingUtility(GraphAM graph) {
		this.graph = graph;
		stack = new Stack<Integer>(); 
		visited = new boolean[graph.getNoOfVertices()]; 
		
		for(int i = 0; i < graph.getNoOfVertices(); i++) {
			visited[i] = false; 
		}
	}
	
	private void topologicalSortUtil(int v) { 
		visited[v] = true; 
		int i = 0; 
		
		while(i < graph.getNoOfVertices()) {
			if(graph.checkEdge(v, i) && !visited[i]) {
				topologicalSortUtil(i);
			}
			i++;
		}

		stack.push(v); 
	} 

	void topologicalSort() { 
		for(int i = 0; i < graph.getNoOfVertices(); i++) {
			if (visited[i] == false) {
				topologicalSortUtil(i); 
			}
		}
 
		System.out.println("\nBelow is the Topological Sort of the given input :: ");
		while(stack.empty()==false) {
			System.out.print(stack.pop()+1 + " ");
		} 
	} 
}

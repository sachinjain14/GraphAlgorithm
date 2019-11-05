package com.java.graph;

public class GraphAM {
	int V; 
	int adjency_matrix[][] = null;

	public GraphAM(int V) { 
		this.V = V; 
		this.adjency_matrix = new int[V][V];
	}
	
	/**
	 * This function returns the Number of vertex in the graph
	 * @author Sachin Jain
	 * @return Number of vertex in the graph
	*/
	public int getNoOfVertices() {
		return V;
	}
	
	/**
	 * This function returns the Adjency Matrix of the Graph
	 * @author Sachin Jain
	 * @return Adjency Matrix of the Graph
	*/
	public int[][] getAdjencyMatrix() {
		return adjency_matrix;
	}

	/**
	 * This function is used to add edge in the graph for given source and destination vertex
	 * @author Sachin Jain
	 * @return NA
	*/
	public void addEdge(int src, int dest) {
		if((src >= 0 && src < V) && (dest >= 0 && dest < V)) {
			adjency_matrix[src][dest] = 1;
		} else {
			System.out.println("Provided Source "+src+" and Destination "+dest+" are in Invalid range");
		}
	}

	/**
	 * This function is used to check edge in the graph for given source and destination vertex
	 * @author Sachin Jain
	 * @return true if edge exists else false
	*/
	public boolean checkEdge(int src, int dest){
		if((src >= 0 && src < V) && (dest >= 0 && dest < V)) {
			if(adjency_matrix[src][dest] == 0) {
				return false;
			} else {
				return true;
			}
		} else {
			System.out.println("Provided Source "+src+" and Destination "+dest+" are in Invalid range");
			return false;
		}
	}

	/**
	 * This function is used to print the Adjency Matrix
	 * @author Sachin Jain
	 * @return NA
	*/
	public void printAdjencyMatrix() {        
		System.out.println("Below is the Adjency Matrix given as Input :: ");
		for(int i = 0; i < V; i++) {
			for(int j = 0; j < V; j++) {
				System.out.print(adjency_matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

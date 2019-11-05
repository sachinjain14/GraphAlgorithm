package com.java.graph;

import java.util.LinkedList;

public class GraphAL {
	int V; 
	LinkedList<Integer> adjListArray[]; 

	GraphAL(int V) { 
		this.V = V; 
		adjListArray = new LinkedList[V]; 

		for(int i = 0; i < V ; i++){ 
			adjListArray[i] = new LinkedList<>(); 
		} 
	}
	
	public int getNoOfVertices() {
		return V;
	}
	
	void addEdge(int src, int dest) {  
		adjListArray[src].add(dest); 
	}

	public boolean checkEdge(int src, int dest) {
		if((src >= 0 && src < V) && (dest >= 0 && dest < V)) {
			for(Integer pCrawl: adjListArray[src]){ 
				if(pCrawl == dest) {
					return true;
				}
			}
		} else {
			System.out.println("Provided Source "+src+" and Destination "+dest+" are in Invalid range");
		}
		
		return false;
	}
	
	public void printAdjencyList() { 
		System.out.println("Below is the Adjency List for the given graph :: ");
		for(int v = 0; v < V; v++) { 
			System.out.print("["+v+"]"); 
			for(Integer pCrawl: adjListArray[v]){ 
				System.out.print(" -> "+pCrawl); 
			} 
			System.out.println(); 
		} 
	}
}

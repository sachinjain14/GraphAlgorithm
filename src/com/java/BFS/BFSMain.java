package com.java.BFS;

import com.java.graph.GraphAL;
import com.java.graph.GraphAM;
import com.java.graph.GraphAdjencyListImpl;
import com.java.graph.GraphAdjencyMatrixImpl;

public class BFSMain {
	public static void main(String[] args) {
		GraphAdjencyMatrixImpl graphAdjencyMatrixImpl = new GraphAdjencyMatrixImpl("BFS_input.txt");
		GraphAM graphAM = graphAdjencyMatrixImpl.getGraph();
		graphAM.printAdjencyMatrix();
		
		int sourceAM = 0;
		
		System.out.println("\nBelow is the BFS Traversal Information for the given Graph based on AM :: ");
		BFSTraversalBasedOnAM bfsAM = new BFSTraversalBasedOnAM(graphAM);
		bfsAM.bfsTraversal(graphAM,sourceAM);
		bfsAM.printBFSGraph();
				
		GraphAdjencyListImpl graphAdjencyListImpl = new GraphAdjencyListImpl("BFS_input.txt");
		GraphAL graphAL = graphAdjencyListImpl.getGraph();
		System.out.println();
		graphAL.printAdjencyList();
		
		int sourceAL = 0;
		
		System.out.println("\nBelow is the BFS Traversal Information for the given Graph based on AL:: ");
		BFSTraversalBasedOnAL bfsAL = new BFSTraversalBasedOnAL(graphAL);
		bfsAL.bfsTraversal(graphAL,sourceAL);
		bfsAL.printBFSGraph();
	}
}

package com.java.DFS;

import com.java.graph.GraphAL;
import com.java.graph.GraphAM;
import com.java.graph.GraphAdjencyListImpl;
import com.java.graph.GraphAdjencyMatrixImpl;

public class DFSMain {
	public static void main(String[] args) {
		GraphAdjencyMatrixImpl graphAdjencyMatrixImpl = new GraphAdjencyMatrixImpl("BFS_input.txt");
		GraphAM graphAM = graphAdjencyMatrixImpl.getGraph();
		graphAM.printAdjencyMatrix();

		int sourceAM = 0;
		System.out.println("\nBelow is the DFS Travesal Information (Using Recursion) for the given Graph based on AM :: ");
		DFSTraversalWithRecursionBasedOnAM dfs1 = new DFSTraversalWithRecursionBasedOnAM(graphAM);
		dfs1.dfsTraversalWithRecursion(graphAM,sourceAM);
		dfs1.printDFSWithRecursionGraph(graphAM);
		
				
		System.out.println("\nBelow is the DFS Travesal Information (Without Recurssion) for the given Graph based on AM :: ");
		DFSTraversalWithoutRecursionBasedOnAM dfs2 = new DFSTraversalWithoutRecursionBasedOnAM(graphAM);
		dfs2.dfsTraversalWithoutRecursion(graphAM,sourceAM);
		dfs2.printDFSWithoutRecursionGraph(graphAM);
		
		
		
		GraphAdjencyListImpl graphAdjencyListImpl = new GraphAdjencyListImpl("BFS_input.txt");
		GraphAL graphAL = graphAdjencyListImpl.getGraph();
		System.out.println();
		graphAL.printAdjencyList();
		
		int sourceAL = 0;
		System.out.println("\nBelow is the DFS Travesal Information (Using Recursion) for the given Graph based on AL :: ");
		DFSTraversalWithRecursionBasedOnAL dfs3 = new DFSTraversalWithRecursionBasedOnAL(graphAL);
		dfs3.dfsTraversalWithRecursion(graphAL,sourceAL);
		dfs3.printDFSWithRecursionGraph(graphAL);
		
				
		System.out.println("\nBelow is the DFS Travesal Information (Without Recurssion) for the given Graph based on AL :: ");
		DFSTraversalWithoutRecursionBasedOnAL dfs4 = new DFSTraversalWithoutRecursionBasedOnAL(graphAL);
		dfs4.dfsTraversalWithoutRecursion(graphAL,sourceAL);
		dfs4.printDFSWithoutRecursionGraph(graphAL);
	}
}

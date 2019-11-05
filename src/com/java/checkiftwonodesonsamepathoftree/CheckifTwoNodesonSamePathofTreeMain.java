//SOURCE :: https://www.geeksforgeeks.org/check-if-two-nodes-are-on-same-path-in-a-tree/

package com.java.checkiftwonodesonsamepathoftree;

import com.java.DFS.DFSTraversalWithRecursionBasedOnAM;
import com.java.graph.GraphAM;
import com.java.graph.GraphAdjencyMatrixImpl;

public class CheckifTwoNodesonSamePathofTreeMain {
	public static void main(String[] args) {
		GraphAdjencyMatrixImpl graphAdjencyMatrixImpl = new GraphAdjencyMatrixImpl("CheckifTwoNodesonSamePathofTree_input_2.txt");
		GraphAM graphAM = graphAdjencyMatrixImpl.getGraph();
		graphAM.printAdjencyMatrix();

		int sourceAM = 0;
		System.out.println("\nBelow is the DFS Travesal Information (Using Recursion) for the given Graph based on AM :: ");
		DFSTraversalWithRecursionBasedOnAM dfs1 = new DFSTraversalWithRecursionBasedOnAM(graphAM);
		dfs1.dfsTraversalWithRecursion(graphAM,sourceAM);
		dfs1.printDFSWithRecursionGraph(graphAM);
		
		int V1 = 2;
		int V2 = 6;
		
		CheckifTwoNodesonSamePathofTreeUtility samePath = new CheckifTwoNodesonSamePathofTreeUtility();
		if(samePath.query(dfs1.getVertexStartTimeArray(), dfs1.getVertexEndTimeArray(), V1-1, V2-1)) {
			System.out.println("\nNode "+V1+" and "+V2+" are on the same path");
		} else {
			System.out.println("\nNode "+V1+" and "+V2+" are not on the same path");
		}
	}
}

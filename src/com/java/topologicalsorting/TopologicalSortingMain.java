package com.java.topologicalsorting;

import com.java.graph.GraphAM;
import com.java.graph.GraphAdjencyMatrixImpl;

public class TopologicalSortingMain {
	public static void main(String[] args) {
		GraphAdjencyMatrixImpl graphAdjencyMatrixImpl = new GraphAdjencyMatrixImpl("TopologicalSorting.txt");
		GraphAM graphAM = graphAdjencyMatrixImpl.getGraph();
		graphAM.printAdjencyMatrix();
		
		TologicalSortingUtility ts = new TologicalSortingUtility(graphAM);
		ts.topologicalSort();
	}
}

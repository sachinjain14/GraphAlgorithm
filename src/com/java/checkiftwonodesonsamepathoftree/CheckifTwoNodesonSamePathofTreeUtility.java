package com.java.checkiftwonodesonsamepathoftree;

public class CheckifTwoNodesonSamePathofTreeUtility {
	boolean query(int start_time[], int end_time[], int u, int v) { 
	    return ( (start_time[u]<start_time[v] && end_time[u]>end_time[v]) || 
	             (start_time[v]<start_time[u] && end_time[v]>end_time[u]) ); 
	}
}

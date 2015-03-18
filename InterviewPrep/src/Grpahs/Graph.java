package Grpahs;


import java.util.*;
import java.util.LinkedList;

 
 
public class Graph {
	    //Map of adjacency lists for each node
	    HashMap<Integer, LinkedList<Integer>> adj;
 
	    public Graph(int[] nodes) {
	        //your node labels are consecutive integers starting with one. 
	        //to make the indexing easier we will allocate an array of adjacency one element larger than necessary
	        adj = new HashMap<Integer, LinkedList<Integer>>();
	        for (int i = 0; i < nodes.length; ++i) {
	            adj.put(i, new LinkedList<Integer>());
	        }
	    }
 
	    public void addEdge(int v1, int v2) {
	        adj.get(v1).add(v2);
	    }
 
	    public List<Integer> getNeighbors(int v) {
	        return adj.get(v);
	    }
	    public static void main(String[] args) {
	    	 
	      int arr[] = {1,2,3,4};
	  	  Graph g= new Graph(arr);
	  	  g.addEdge(0, 1);
	  	    g.addEdge(0, 2);
	  	    g.addEdge(1, 2);
	  	    g.addEdge(2, 0);
	  	    g.addEdge(2, 3);
	  	    g.addEdge(3, 3);
	  	    System.out.print(g.getNeighbors(3));
	  	}
	}
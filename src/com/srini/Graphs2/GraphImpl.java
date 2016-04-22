package com.srini.Graphs2;
import java.util.List;

public class GraphImpl
{
	public static void main(String... args)
	{
		Graph g = new Graph();
		Graph spanningTree = new Graph();

		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");		
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");
		Vertex F = new Vertex("F");
		
		g.addVertex(A);
		g.addVertex(B);
		g.addVertex(C);
		g.addVertex(D);
		g.addVertex(E);
		g.addVertex(F);

		g.addEdge(A, B);
		g.addEdge(B, C);
		g.addEdge(C, D);
		g.addEdge(D, E);
		g.addEdge(E, F);
		g.addEdge(F, A);
		g.addEdge(A, D);
		g.addEdge(B, E);
		g.addEdge(B, D);
		g.addEdge(E, A);
		
		g.printMatrix();
		
		List<Vertex> mainVertices = g.getVertexList();
		for(Vertex b:mainVertices){
		    	System.out.println(" Vertex value " + b.value + " label is " + b.getLabel());
		}
		spanningTree = g.getSpanningTree(spanningTree,A);
		
		List<Vertex> spanningVertices = spanningTree.getVertexList();
		for(Vertex b:spanningVertices)
			System.out.println(" Spanning Tree vertex " + b.getLabel());
		
		System.out.println(" Spannig tree Matrix");
		System.out.println();
		spanningTree.printMatrix();
	}

}
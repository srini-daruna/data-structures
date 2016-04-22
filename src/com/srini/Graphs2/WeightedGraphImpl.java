package com.srini.Graphs2;

public class WeightedGraphImpl
{
	public static void main(String... args)
	{
		WeightedGraph graph = new WeightedGraph();
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");
		Vertex F = new Vertex("F");
		Vertex C = new Vertex("C");

		graph.addVertex(A);
		graph.addVertex(B);
		graph.addVertex(C);
		graph.addVertex(D);
		graph.addVertex(E);
		graph.addVertex(F);
		
		graph.addEdge(A,B,6);
		graph.addEdge(A,D,4);
		
		graph.addEdge(B,C,10);
		graph.addEdge(B,E,7);
		graph.addEdge(B,D,7);
		
		graph.addEdge(C,D,8);
		graph.addEdge(C,E,5);
		graph.addEdge(C,F,6);
		
		graph.addEdge(D,E,12);
		graph.addEdge(E,F,7);
			
		graph.printMatrix();
		
		System.out.println(" Distance table ");
		graph.dijkastra(A);
		
		//WeightedGraph spanningTree = new WeightedGraph();
		//spanningTree = graph.getSpanningTree(spanningTree, A);
		
		//spanningTree.printMatrix();

	}
}

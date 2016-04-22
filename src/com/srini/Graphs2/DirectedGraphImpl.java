package com.srini.Graphs2;

public class DirectedGraphImpl
{
	public static void main(String... args)
	{
		DirectedGraph graph = new DirectedGraph();

		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");
//		Vertex B = new Vertex("B");
//		Vertex B = new Vertex("B");

		graph.addVertex(A);
		graph.addVertex(B);
		graph.addVertex(C);
		graph.addVertex(D);
		graph.addVertex(E);
		
		graph.addEdge(B,A);
		graph.addEdge(A,C);
		graph.addEdge(B,E);
		graph.addEdge(E,C);
		graph.addEdge(D,E);

		graph.printMatrix();

	}
}
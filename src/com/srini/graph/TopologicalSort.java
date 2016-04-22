package com.srini.graph;

public class TopologicalSort {
    
    public static void main(String[] args)
    {
	DirectedGraph dg = new DirectedGraph();
	VertexDirected A = new VertexDirected("A");
	VertexDirected B = new VertexDirected("B");
	VertexDirected C = new VertexDirected("C");
	VertexDirected D = new VertexDirected("D");
	VertexDirected E = new VertexDirected("E");
	VertexDirected F = new VertexDirected("F");
	VertexDirected G = new VertexDirected("G");
	
	EdgeDirected E1 = new EdgeDirected("1");
	EdgeDirected E2 = new EdgeDirected("2");
	EdgeDirected E3 = new EdgeDirected("3");
	EdgeDirected E4 = new EdgeDirected("4");
	EdgeDirected E5 = new EdgeDirected("5");
	EdgeDirected E6 = new EdgeDirected("6");
	EdgeDirected E7 = new EdgeDirected("6");
	EdgeDirected E8 = new EdgeDirected("6");
	EdgeDirected E9 = new EdgeDirected("6");

	dg.addVertex(A);
	dg.addVertex(B);
	dg.addVertex(C);
	dg.addVertex(D);
	dg.addVertex(E);
	dg.addVertex(F);
	dg.addVertex(G);
	
	dg.addEdge(E1,A,B);
	dg.addEdge(E2,A,C);
	dg.addEdge(E3,A,D);
	dg.addEdge(E4,A,D);
	dg.addEdge(E5,B,C);
	dg.addEdge(E6,C,E);
	dg.addEdge(E7,E,F);
	dg.addEdge(E8,F,D);    
	dg.addEdge(E9,C,G);
	}

}

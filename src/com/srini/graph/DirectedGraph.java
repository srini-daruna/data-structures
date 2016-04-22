package com.srini.graph;
import java.util.List;
import java.util.ArrayList; 	

public class DirectedGraph {
	
	List<VertexDirected> vertexList = new ArrayList<VertexDirected>();
	int vertexCount = 0;
	
	public void addVertex(VertexDirected v)
	{
		vertexList.add(v);
		vertexCount++;
	}
	
	public void addEdge(EdgeDirected E, VertexDirected start, VertexDirected end)
	{
		start.outwardsList.add(E);
		end.inwardsList.add(E);
	}
	

}

class VertexDirected
{ 
	String label;
	List<EdgeDirected> inwardsList = new ArrayList<EdgeDirected>();
	List<EdgeDirected> outwardsList = new ArrayList<EdgeDirected>();
	
	public VertexDirected(String name)
	{
		this.label = name;
	}
}

class EdgeDirected
{
	String name;
	
	public EdgeDirected(String name)
	{
		this.name = name;
	}
}
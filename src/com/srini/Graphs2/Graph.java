package com.srini.Graphs2;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class Graph
{
    final int maxVertices = 10;
    int[][] adjMatrix = new int[maxVertices][maxVertices];
    List<Vertex> vertexList = new ArrayList<Vertex>();
    int vertexCount = 1;

    public Graph()
    {
	for(int i = 0; i<maxVertices;i++)
	    for(int j = 0; j < maxVertices;j++)
		adjMatrix[i][j] = 0;

    }

    public void addVertex(Vertex vertex)
    {
	vertex.setValue(vertexCount);
	vertexList.add(vertex);
	vertexCount++;

    }

    public void addEdge(Vertex A, Vertex B)
    {
	adjMatrix[A.value][B.value] = 1;
	adjMatrix[B.value][A.value] = 1;
    }

    public void printMatrix()
    {
	System.out.print("  ");
	for(Vertex a: this.vertexList)
	    System.out.print(a.label + " ");
	
	for(int i = 1; i < vertexCount;i++)
	{
	    System.out.println();
	    System.out.print(this.getVertexForValue(i).label + " ");
	    for(int j = 1; j < vertexCount; j++)
		System.out.print(adjMatrix[i][j] + " ");
	}
    }

    public Graph getSpanningTree(Graph newGraph, Vertex root)
    {
	Graph mainGraph = this;
	Queue<Vertex> stack = new LinkedList<Vertex>();

	stack.add(root);

	while(!stack.isEmpty())
	{
	    Vertex newNode = null;
	    Vertex node = stack.poll();
	    System.out.println(" node is " + node.getLabel());
	    
	    if(node.isVisited == false){
	    node.isVisited = true;
	    //System.out.println(" node is " + node.getLabel());
	    newNode = new Vertex(node.label);
	    newGraph.addVertex(newNode);
	    }

	    int value = node.getValue(), count = 0;
	    for(int i = 1; i<= vertexCount;i++)
	    {
		if(mainGraph.adjMatrix[value][i] == 1)
		{
		    //System.out.println(" i value is " + i);
		    Vertex v = mainGraph.getVertexForValue(i);
		    System.out.println(" label recieved is " + v.label);
		    if(v.isVisited == false)
		    {					
			count++;
			Vertex newNode2 = new Vertex(v.label);
			newGraph.addVertex(newNode2);
			v.isVisited = true;
			newGraph.addEdge(node, newNode2);
			stack.add(v);
		    }
		}

	    }

	    if(count == 0)
		stack.poll();

	}

	return newGraph;
    }

    public List<Vertex> getVertexList()
    {
	return this.vertexList;
    }

    public Vertex getVertexForValue(int vertexValue)
    {
	Vertex node = null;

	for(Vertex a:this.vertexList)
	{
	    if(a.value == vertexValue){
		node = a;
	    }
	}

	return node;

    }
}
package com.srini.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MyGraph {
    public static void main(String[] args)
    {
	Graph g = new Graph();
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

	g.addEdge(A,B,"1");
	g.addEdge(A,C,"2");
	g.addEdge(A,D,"3");
	g.addEdge(B,E,"4");
	g.addEdge(B,F,"5");
	g.addEdge(C,F,"6");

	g.printAdjMatrix();
	g.printVertexList();

	System.out.println(" Vertex at 2 is " + g.getVertexForValue(2).label);
	//g.dfs(A);
	g.bfs(A);
    }

}


class Vertex
{
    String label;
    int value;
    boolean visited;


    public Vertex(String value, int id)
    {
	this.label = value;
	this.value = id;
	this.visited = false;
    }

    public Vertex(String value)
    {
	this.label = value;
	this.visited = false;
    }
    public void setValue(int val)
    {
	this.value = val;
    }

    public int getValue()
    {
	return this.value;
    }
}

class Edge{
    String label;
    Vertex start;
    Vertex end;

    public Edge(Vertex first, Vertex last, String label)
    {
	this.start 	= first;
	this.end 	= last;
	this.label = label;
    }
}

class Graph{
    int maxVertex = 10;
    int vertexCount = 0;
    int edgeCount = 0;
    Stack<Vertex> s1 = new Stack<Vertex>();
    Queue<Vertex> queue = new LinkedList<Vertex>();
    List<Vertex> vertexList = new ArrayList<Vertex>();
    int[][] adjMatrix = new int[maxVertex][maxVertex];

    public Graph()
    {
	for(int i=1;i<maxVertex;i++)
	    for(int j=1;j<maxVertex;j++)
		adjMatrix[i][j] = 0;
    }


    public void addVertex(Vertex A)
    {
	if(vertexCount >= maxVertex)
	    System.err.println("Vertex count is overflow");
	else
	    vertexCount++;
	A.setValue(vertexCount);
	vertexList.add(A);
    }

    public int getVertexCount()
    {
	return vertexCount;
    }
    public void addEdge(Vertex a, Vertex b, String label)
    {
	// Some how this seems not required
	edgeCount++;
	adjMatrix[a.getValue()][b.getValue()] = 1;
	adjMatrix[b.getValue()][a.getValue()] = 1;

    }

    public int getEdgeCount()
    {
	return edgeCount;
    }

    public void printAdjMatrix()
    {
	System.out.println("Adjacency Matrix is " );
	for(int i=1;i<=vertexCount;i++)
	{
	    System.out.println();
	    for(int j=1;j<=vertexCount;j++)
		System.out.print(adjMatrix[i][j]);
	}		
    }

    public void printVertexList()
    {
	for(Vertex a:vertexList)
	    System.out.println(a.label);
    }

    public Vertex getVertexForValue(int val)
    {
	Vertex node = null;
	for(Vertex a:vertexList)
	{
	    if(a.value == val)
		node = a;

	}
	return node;
    }

    public void dfs(Vertex root)
    {
	Vertex node = root;

	s1.push(node);
	node.visited = true;
	// Get adjacent nodes for this node
	int count;
	while(!s1.isEmpty())
	{
	    node = s1.peek();
	    count = getNodes(node);
	    if(count ==0)
		System.out.println(" " + s1.pop().label);

	}

    }

    public int getNodes(Vertex V)
    {
	Vertex node;
	int count = 0;
	int i = V.getValue();
	for(int j=0;j<=vertexCount;j++)
	{
	    if(adjMatrix[i][j] == 1)
	    {
		node = getVertexForValue(j);
		if( node != null && !node.visited){
		    s1.push(node);
		    count++;
		    node.visited = true;
		}
	    }
	}

	return count;

    }

    public void bfs(Vertex node)
    {
	System.out.println(" -- " + node.label);
	int val = node.getValue();
	queue.add(node);
	node.visited = true;
	Vertex newNode;
	while(!queue.isEmpty())
	{
	    node = queue.poll();
	    val = node.getValue();
	    System.out.println(" " + node.label) ;
	    
	    for(int j = 0; j<=vertexCount;j++)
	    {
		if(adjMatrix[val][j] == 1)
		{
		    if(!getVertexForValue(j).visited)
		    {
			newNode = getVertexForValue(j);
			queue.add(newNode);
			newNode.visited = true;
		    }
		}

	    }
	}
    }

}
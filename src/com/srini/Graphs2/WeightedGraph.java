package com.srini.Graphs2;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class WeightedGraph
{
    final int MAXVERTEX = 10;
    List<Vertex> vertexList = new ArrayList<Vertex>();
    int vertexCount = 1;
    int[][]	adjMatrix = new int[MAXVERTEX][MAXVERTEX];

    public WeightedGraph()
    {

	for(int i = 0;i<MAXVERTEX;i++)
	    for(int j=0;j<MAXVERTEX;j++)
		adjMatrix[i][j] = 0;
    }

    public void addVertex(Vertex node)
    {
	node.value = vertexCount;
	vertexList.add(node);
	vertexCount++;
    }

    public void addEdge(Vertex start, Vertex end, int weight)
    {
	adjMatrix[start.value][end.value] = weight;
	adjMatrix[end.value][start.value] = weight;
    }
    
    public void removeEdge(Vertex start, Vertex end)
    {
	adjMatrix[start.value][end.value] = 0;
	adjMatrix[end.value][start.value] = 0;
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
    
    public Vertex getVertexForLabel(String labelRequired)
    {
	Vertex node = null;
	for(Vertex a: this.vertexList)
	{
	    if(a.label == labelRequired)
		{
			node = a;
			break;
		}
	}
	
	return node;
	    
    }

    public Vertex getVertexForValue(int vertexValue)
    {
	Vertex node = null;
	for(Vertex a:this.vertexList)
	{
	    if(a.value == vertexValue)
	    {
		node = a;
		break;
	    }
	}

	return node;

    }

    public WeightedGraph getSpanningTree(WeightedGraph newGraph, Vertex root)
    {
	WeightedGraph mainGraph = this;
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
	    }else
		newNode = newGraph.getVertexForLabel(node.label);

	    int value = node.getValue(), count = 0;
	    for(int i = 1; i<= vertexCount;i++)
	    {
		if(mainGraph.adjMatrix[value][i] != 0)
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
			newGraph.addEdge(newNode, newNode2,adjMatrix[value][i]);
			stack.add(v);
		    }else
		    {
			Vertex newNode3 = newGraph.getVertexForLabel(v.label);
			int value2 = newNode3.value;
			System.out.println(" value is " + value2);
			for(int k = 1;k<=newGraph.vertexCount;k++)
			{
			    if(newGraph.adjMatrix[value2][k] !=0 && newGraph.adjMatrix[value2][k] > adjMatrix[value2][i])
			    {
				newGraph.removeEdge(newNode3,newGraph.getVertexForValue(k));
				newGraph.addEdge(newNode, newNode3,adjMatrix[value][i]);
				
			    }
			}
		    }
		    
		}

	    }

	    if(count == 0)
		stack.poll();

	}
	return newGraph;

    }
    
    public void dijkastra(Vertex A)
    {
	int[][] distanceTable = new int[this.vertexCount][3];
	String[] unSettled = new String[this.vertexCount];
	String[] settled = new String[this.vertexCount];
	
	int j = 0;
	for(Vertex a:this.vertexList)
	    unSettled[j++] = a.label;
	
	
	for(int i = 1; i<vertexCount;i++)
	{
	    distanceTable[i][0] = i;
	    distanceTable[i][1] = -1;
	    distanceTable[i][2] = -1;
 	}
	
	distanceTable[A.value][1] = 0;
	
	for(int i = 1 ; i< vertexCount ; i++)
	{
	    System.out.println ( "  " + this.getVertexForValue(distanceTable[i][0]).label + "  " + distanceTable[i][1] + "  " + distanceTable[i][2] );
	}
	
	Queue<Vertex> queue = new LinkedList<Vertex>();
	queue.add(A);
	
	while(!queue.isEmpty())
	{
	    Vertex node = queue.poll();
	    node.isVisited = true;
	    int value = node.value;
	    
	    for(int i = 1; i< this.vertexCount;i++)
	    {
		if(this.adjMatrix[value][i] != 0)
		{
		    Vertex newNode = this.getVertexForValue(i);
		    
		}
	    }
	}
	
    }

}
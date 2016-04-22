package com.srini.Graphs2;
import java.util.List;
import java.util.ArrayList;

public class DirectedGraph
{
	final int MAXVERTEX = 10;
	List<Vertex> vertexList = new ArrayList<Vertex>();
	int vertexCount;
	int[][] adjMatrix = new int[MAXVERTEX][MAXVERTEX];


	public DirectedGraph()
	{
		vertexCount = 1;
		for(int i =0;i<MAXVERTEX;i++)
			for(int j = 0;j<MAXVERTEX;j++)
				adjMatrix[i][j] = 0;

	}

	public void addVertex(Vertex node)
	{
		node.value = vertexCount;
		vertexList.add(node);
		vertexCount++;
	}

	public void addEdge(Vertex start, Vertex end)
	{
		adjMatrix[start.value][end.value] = 1;
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

	public Vertex getVertexForValue(int vertexValue)
	{
		Vertex node = null;
		for(Vertex a: this.vertexList)
		{
			if(a.value == vertexValue)
			{
				node = a;
				break;
			}

		}
		return node;
	}

}
package com.srini.test;

public class BinaryTree {
	
	public static void main(String[] args)
	{
		BinTree t1 = new BinTree(10);
		BinTree t2 = new BinTree(20);
		BinTree t3 = new BinTree(30);
		BinTree t4 = new BinTree(40);
		BinTree t5 = new BinTree(15);
		
		t1.addLeft(t2);
		t1.addRight(t3);
		t2.addRight(t4);
		t2.addLeft(t5);
		
		t1.traverse();
	}

}

class BinTree
{
	public int data;
	BinTree leftNode;
	BinTree rightNode;
	
	BinTree(int value)
	{
		data = value;
		leftNode = null;
		rightNode = null;
	}
	
	public void addNode(BinTree node)
	{
		/*if(this.leftNode == null)
		{
			this.leftNode = node;
			return;
		}else if(this.rightNode == null)
		{
			this.rightNode = node;
			return;
		}else
		{
			this.leftNode.addNode(node);
			this.rightNode.addNode(node);
		}*/
		
		// Find the position where we can insert from left to right
		
		
	}
	
	
	public void traverse()
	{
		if(this.leftNode != null)
		{
			BinTree node = this.leftNode;
			node.traverse();
		}
		
		System.out.println(this.data);
		
		if(this.rightNode != null)
		{
			BinTree node = this.rightNode;
			node.traverse();
		}
		
	}
	
	public void addLeft(BinTree node)
	{
		if(this.leftNode != null)
		{
			System.err.println(" There is already a node ");
			System.exit(0);
		}else
			this.leftNode = node;
	
	}
	public void addRight(BinTree node)
	{
		if(this.rightNode != null)
		{
			System.err.println(" There is already a node ");
			System.exit(0);
		}else
			this.rightNode = node;
	
	}
	
	public void recursiveTraversal(BinTree node)
	{
		if(node == null)
			return;
		
		recursiveTraversal(node.leftNode);
		System.out.println(" data is " + node.data);
		
	}
}
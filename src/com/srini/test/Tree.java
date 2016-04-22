package com.srini.test;

import java.util.LinkedList;
import java.util.Queue;

public class Tree
{
    int data;
    Tree leftNode;
    Tree rightNode;
    Tree root;
    int count = 0;
    Tree()
    {
	data = 0;
	leftNode = null;
	rightNode = null;
    }
    
    Tree(int value)
    {
	data = value;
	leftNode = null;
	rightNode = null;
    }

    public void addNode(Tree node){
	
	Tree mainNode = this;

	if(mainNode.data > node.data)
	{
	    if(mainNode.leftNode == null)
		mainNode.leftNode = node;
	    else
		mainNode.leftNode.addNode(node);

	}else if(mainNode.data < node.data)
	{
	    if(mainNode.rightNode == null)
		mainNode.rightNode = node;
	    else
		mainNode.rightNode.addNode(node);

	}

    }
    public void traverse()
    {
	// Traversal with recursion
	if(this.leftNode != null)
	{
	    Tree node = this.leftNode;
	    node.traverse();
	}
	
	System.out.print(this.data + " ");

	if(this.rightNode != null)
	{
	    Tree node = this.rightNode;
	    node.traverse();
	}

	
    }
    
    public void inorderTraversal()
    {
	// Traversal with recursion
	if(this.leftNode != null)
	{
	    Tree node = this.leftNode;
	    node.traverse();
	}
	
	System.out.print(this.data + " ");

	if(this.rightNode != null)
	{
	    Tree node = this.rightNode;
	    node.traverse();
	}
    }


    public void preorderTraversal()
    {
	System.out.print(this.data + " ");
	
	if(this.leftNode != null)
	{
	    Tree node = this.leftNode;
	    node.preorderTraversal();
	}
	
	
	if(this.rightNode != null)
	{
	    Tree node = this.rightNode;
	    node.preorderTraversal();
	}

	
    }
    
    public void postorderTraversal()
    {
	
	if(this.leftNode != null)
	{
	    Tree node = this.leftNode;
	    node.postorderTraversal();
	}
	
	
	if(this.rightNode != null)
	{
	    Tree node = this.rightNode;
	    node.postorderTraversal();
	}
	
	System.out.print(this.data + " ");
		
    }


    public int getHeight()
    {
	int leftHeight = 0;
	int rightHeight = 0;
	Tree node = this;
	while(node != null)
	{
	    leftHeight++;
	    node = node.leftNode;

	}

	node = this;
	while(node != null)
	{
	    rightHeight++;
	    node = node.rightNode;

	}


	if(leftHeight > rightHeight)
	    return (leftHeight-1);
	else
	    return (rightHeight-1);

    }


    public void mirror()
    {
	// Mirror of Binary tree implementaiton
    }

    public void DeepestNode()
    {
	// Finds the deepest Node

	

    }
    
    public void levelTraversal(Tree root)
    {
	// Level order traversal using Queues
	System.out.println(" Level order traversal ");
	Queue<Tree> q = new LinkedList<Tree>();
	Tree temp;
	q.add(root);
	
	while(!q.isEmpty())
	{
	    temp = q.poll();
	    System.out.print(temp.data);
	    if(temp.leftNode != null)
		q.add(temp.leftNode);
	    if(temp.rightNode != null)
		q.add(temp.rightNode);
	}
    }
    
    public int levelTry()
    {
	/** finding list of complete nodes from binary tree **/
	Tree node = this;
	
	if(node.leftNode != null && rightNode != null)
	    count = count + 1;
	if(node.leftNode != null & node.rightNode != null)
	    return count + node.leftNode.levelTry() + node.rightNode.levelTry();
	else if(node.leftNode != null & node.rightNode == null)
	    return count + node.leftNode.levelTry();
	else if(node.leftNode == null && node.rightNode != null)
	    return count + node.rightNode.levelTry();
	else
	    return count;
    }
    
    public int levelTry2()
    {
	// Trail for finding number of complete nodes. Giving one value more than expected...
	Tree node = this;
	
	if(node.leftNode != null && rightNode != null)
	    count = count + 1;
	
	if(node.leftNode != null)
	    return count + node.leftNode.levelTry();
	if(node.rightNode != null)
	    return count + node.rightNode.levelTry();
	
	return count;
    }
    
    
    public void levelTry3()
    {
	// Try for Level Order traversal... failed to deliver..
	Tree node = this;
	System.out.print(node.data);
	
	if(node.leftNode != null)
	{
	    System.out.print(node.leftNode.data);
	}    
	if(node.rightNode != null)
	     System.out.print(node.rightNode.data);
		
	if(node.leftNode != null)
	    node.leftNode.levelTry3();
	else
		return;
		
	if(node.rightNode != null)
	    node.rightNode.levelTry3();
	else
		return;
	
    }
    
    
    public void mirrorOfTree()
    {
	// Mirror of tree
	Tree node = this;
	
	if(node.leftNode != null)
	    node.leftNode.mirrorOfTree();
	
	if(node.rightNode != null)
	    node.rightNode.mirrorOfTree();
	
	Tree temp = node.leftNode;
	node.leftNode = node.rightNode;
	node.rightNode = temp;
	
	return;
    }
    
    public void mirrorTry()
    {
	// Mirror of tree without recursion
	Tree root = this;
	Tree node;
	Tree temp;
	
	Queue<Tree> q = new LinkedList<Tree>();
	q.add(root);
	
	while(!q.isEmpty())
	{
	    node = q.poll();
	    
	    if(node.leftNode != null || node.rightNode != null)
	    {
		temp = node.leftNode;
		node.leftNode = node.rightNode;
		node.rightNode = temp;
	    }
	    
	    if(node.leftNode != null)
		q.add(node.leftNode);
	    
	    if(node.rightNode != null)
		q.add(node.rightNode);
	}
    }

    public void recursiveTraversal(Tree node)
    {
	// Traversal using Recursive methods
	int temp = 0;
	if(node == null)
	    return;

	System.out.println();

	if(node.leftNode != null)	
	    temp = node.leftNode.data;
	if(node.rightNode != null){
	    node.leftNode.data = node.rightNode.data; 
	    node.rightNode.data = temp;
	}

	recursiveTraversal(node.leftNode);
	recursiveTraversal(node.rightNode);
    }
    
    public void deleteNode(Tree nodeToDelete, Tree root)
    {
	// Algorithm to delete Node with out any refernce from books
	
	if(nodeToDelete.leftNode == null && nodeToDelete.rightNode == null)
	{
	    Tree parent = root.findParent(nodeToDelete);
	    System.out.println(" Parent data is " + parent.data);
	    
	}
    }
    
    public Tree findParent(Tree node)
    {
	Tree root = this;
	Tree parent = root;
	System.out.println(" Came to find data " + node.data);
	if(root.data == node.data)
	    return null;
	else{
	    while(true)
	    {
		System.out.println(" Parent.data " + parent.data);
	    	if(parent.data < node.data)
	    	{
	    	    // check if this is parent
	    	    System.out.println(" Came to right side" );
	    	    if(parent.rightNode != null)
	    		System.out.println(" right node data is " + parent.rightNode.data);
	    	    if(parent.rightNode == null)
	    	    {
	    		System.out.println("Broken at print right node = null");
	    		return null; 
	    	    }else if(parent.rightNode.data == node.data){
	    		System.out.println(" Broken at right node data = data");
	    		break;
	    	    }else{
	    		parent = parent.rightNode;
	    	    }
	    	}
	    	else if(parent.data > node.data)
	    	{
	    	    if(parent.leftNode == null){
	    		System.out.println("Broken at print left node = null");
	    		return null;
	    	    }else if(parent.leftNode.data == node.data){
	    		System.out.println(" Broken at left node data = node data");
	    		break;
	    	    }else
	    		parent = parent.leftNode;
	    	}
	    	
	    }	
	    
	    return parent;
		
	}
	
    }
    
    public boolean find(Tree nodeToFind)
    {
	Tree node = this;
	System.out.println(" Node.data " + node.data);
	if(node.data == nodeToFind.data)
	    return true;
	else if(nodeToFind.data > node.data)
	{
	    node = node.rightNode;
	    
	    if(node == null)
		return false;
	    else
		return node.find(nodeToFind);
	    
	}else if(nodeToFind.data < node.data)
	{
	    node = node.leftNode;
	    if(node == null)
		return false;
	    else
		return node.find(nodeToFind);
	}else
	    return false;
	
    }
    
    public void deleteNode(Tree node)
    {
	Tree root = this;
	// Case 1 if there are not childs to the node
	if(node.leftNode != null && node.rightNode == null)
	{
	    Tree parent = root.findParent(node);
	    if(parent == null){
		System.out.println(" There are no parents and there are no childs");
		node = null;
	    }else
	    {
		if(parent.leftNode == node)
		    parent.leftNode = null;
		else if(parent.rightNode == node)
		    parent.rightNode = null;
	    }
	}else if(node.leftNode == null || node.rightNode == null)
	{
	    // only on child present. In this case, we just need to attach node's child to parent in the node's place
	    Tree parent = root.findParent(node);
	    if(parent == null)
	    {
		System.out.println(" there are no parents, it could be root node with only child");
		if(node.leftNode != null)
		{
		    node.data = node.leftNode.data;
		    node.leftNode = null;
		}else if(node.rightNode != null)
		{
		    node.data = node.rightNode.data;
		    node.rightNode = null;
		}
		    
	    }else
		{
			Tree child = null;
			if (node.leftNode != null)
			    child = node.leftNode;
			else if(node.rightNode != null)
			    child = node.rightNode;
			
			if(parent.leftNode == node)
			{
			   parent.leftNode = child; 
			}else if(parent.rightNode == node)
			    parent.rightNode = child;
		}
	}else if(node.leftNode != null && node.rightNode != null)
	{
	  Tree replace = node.leftNode.findMax();
	  Tree childParent = node.findParent(replace);
	  node.data = replace.data;
	  
	  if(childParent.leftNode.data == replace.data)
	      childParent.leftNode = null;
	  else if(childParent.rightNode.data == replace.data)
	      childParent.rightNode = null;
	  
	}
    }
    
    
    public Tree findMax()
    {
	Tree node = this;
	Tree max = node;
	
	while(node != null)
	{
	    max = node;
	    node =  node.rightNode;
	    
	}
	
	return max;
    }
    
    public Tree findMin()
    {
	Tree node = this;
	Tree min = node;
	
	while(node != null)
	{
	    min = node;
	    node =  node.leftNode;
	    
	}
	
	return min;
    }
    
    public Tree findLCA(int node1, int node2)
    {
	Tree root = this;
	
	if((root.data < node1 && root.data > node2) || (root.data > node1 && root.data < node2))
	{
	    return root;
	}
	else{
	    if(node1 > root.data)
		return root.rightNode.findLCA(node1, node2);
	    else
		return root.leftNode.findLCA(node1, node2);
	}
    }
    
    
}

package com.srini.tree;

import java.util.LinkedList;
import java.util.Queue;


public class TreeInorderPre {
    
    public static void main(String... args)
    {
	BinaryTree  tree = new BinaryTree(10);
	tree.addNode(new BinaryTree(6));
	tree.addNode(new BinaryTree(9));
	tree.addNode(new BinaryTree(8));
	tree.addNode(new BinaryTree(11));
	tree.addNode(new BinaryTree(7));
	tree.addNode(new BinaryTree(5));
	tree.addNode(new BinaryTree(4));
	tree.addNode(new BinaryTree(3));
	tree.addNode(new BinaryTree(2));
	
	
	tree.inorderTraversal();
	
	System.out.println("Diameter " + tree.DiameterOfTree(tree, 1));
	
	System.out.println("Diameter from blog  " + tree.diameterOfBinaryTree(tree));
	
	System.out.println(" Deepest Node is  " + tree.getDeepestNode(tree).data);
	
	if(tree.hasPathWithSum(tree, 16))
	{
	    System.out.println(" Path is there ");
	}else
	    System.out.println(" NO path");

    }

}


class BinaryTree
{
    int data;
    BinaryTree leftNode;
    BinaryTree rightNode;
    BinaryTree root;
    
    BinaryTree()
    {
	data = 0;
	leftNode = null;
	rightNode = null;
    }

    BinaryTree(int value)
    {
	data = value;
	leftNode = null;
	rightNode = null;
    }

    public void addNode(BinaryTree node){

	BinaryTree rootNode = this;

	if(rootNode.data > node.data)
	{
	    if(rootNode.leftNode == null)
		rootNode.leftNode = node;
	    else
		rootNode.leftNode.addNode(node);

	}else if(rootNode.data < node.data)
	{
	    if(rootNode.rightNode == null)
		rootNode.rightNode = node;
	    else
		rootNode.rightNode.addNode(node);
	} 
    }
    
    public void inorderTraversal()
    {
	// Traversal with recursion
	if(this.leftNode != null)
	{
	    BinaryTree node = this.leftNode;
	    node.inorderTraversal();
	}
	
	System.out.print(this.data + " ");

	if(this.rightNode != null)
	{
	    BinaryTree node = this.rightNode;
	    node.inorderTraversal();
	}
    }
    
    public void InOrderSuccessor()
    {
	
    }

    public int DiameterOfTree(BinaryTree root, int diameter)
    {
	int left, right;
	
	if(root == null) 
	    return 0;
	
	left = DiameterOfTree(root.leftNode, diameter);
	right = DiameterOfTree(root.rightNode, diameter);
	
	if(left + right > diameter)
	{
	    diameter = left + right;
	}
	
	return Math.max(left, right)+1;
    }
    
    public int diameterOfBinaryTree(BinaryTree node)
    {
        if (node == null)
        {
            return 0;
        }
 
        int leftHeight = heightOfBinaryTree(node.leftNode);
        int rightHeight = heightOfBinaryTree(node.rightNode);
 
        int leftDiameter = diameterOfBinaryTree(node.leftNode);
        int rightDiameter = diameterOfBinaryTree(node.rightNode);
 
        return Math.max(leftHeight+ rightHeight + 1,Math.max(leftDiameter, rightDiameter));
    }
    
    public int heightOfBinaryTree(BinaryTree node)
    {
        if (node == null)
        {
            return 0;
        }
        else
        {
            return 1 + Math.max(heightOfBinaryTree(node.leftNode),heightOfBinaryTree(node.rightNode));
        }
    }
    
    public BinaryTree getDeepestNode(BinaryTree root)
    {
	Queue<BinaryTree> queue = new LinkedList<BinaryTree>();
	BinaryTree temp = null;
	if(root == null)
	    return null;
	
	queue.add(root);
	while(!queue.isEmpty())
	{
	    temp = queue.poll();
	    if(temp.leftNode != null)
		queue.add(temp.leftNode);
	    if(temp.rightNode != null)
		queue.add(temp.rightNode);
	    
	    
	}
	return temp;
    }
    
    public  boolean hasPathWithSum(BinaryTree root, int sum)
    {
	if(root == null || sum <=0)
	    return (sum == 0);
	else
	{
	    boolean leftResult = false;
	    if(root.leftNode != null)
	    {
		 leftResult = hasPathWithSum(root.leftNode, sum-root.data);
	    }
	    boolean rightResult = false;
	    if(root.rightNode != null)
	    {
		rightResult = hasPathWithSum(root.rightNode,sum-root.data);
	    }
	    
	    return (leftResult || rightResult); 
	}
	
    }
}

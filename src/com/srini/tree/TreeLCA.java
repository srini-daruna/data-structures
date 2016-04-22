package com.srini.tree;

public class TreeLCA {
    
    
    public static void main(String[] args)
    {
	Tree node1 = new Tree(4);
	node1.addNode(new Tree(2));
	node1.addNode(new Tree(8));
	node1.addNode(new Tree(5));
	node1.addNode(new Tree(7));
	node1.addNode(new Tree(9));
	node1.addNode(new Tree(6));
	
	System.out.println(" In Order traversal ");
	node1.inorderTraversal();
	
	System.out.println();
	System.out.println(" Pre Order traversal ");
	node1.preorderTraversal();
	
	System.out.println();
	System.out.println(" LCA of 7, 9  is " + node1.findLCA(7, 9).data);
    }

}

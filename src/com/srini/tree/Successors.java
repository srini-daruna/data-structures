package com.srini.tree;

public class Successors {
    
    public static void main(String args[])
    {
	Tree t1 = new Tree(10);
	t1.addNode(new Tree(20));
	t1.addNode(new Tree(12));
	t1.addNode(new Tree(6));
	t1.addNode(new Tree(8));
	t1.addNode(new Tree(9));
	t1.addNode(new Tree(7));
	t1.addNode(new Tree(15));
	t1.addNode(new Tree(13));
	t1.addNode(new Tree(16));
	t1.addNode(new Tree(4));
	t1.addNode(new Tree(5));
	t1.addNode(new Tree(3));
	
	System.out.println(" In Order traversal is ");
	t1.inorderTraversal();
	System.out.println();
	
	System.out.println(" Finding In Order Predecessor of  6 " + t1.findInOrderPredecessor(20).data);
	System.out.println(" Finding In Order Predecessor of  6 " + t1.findInOrderSuccessor(20).data);
    }

}

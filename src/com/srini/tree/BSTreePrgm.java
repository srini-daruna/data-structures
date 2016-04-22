package com.srini.tree;

public class BSTreePrgm {
	
	public static void main(String[] args)
	{
		Tree t1 = new Tree(10);
		Tree t2 = new Tree(20);
		Tree t3 = new Tree(15);
		Tree t4 = new Tree(30);
		Tree t5 = new Tree(8);
		Tree t6 = new Tree(9);
		Tree t7 = new Tree(6);
		Tree t8 = new Tree(7);
		Tree t9 = new Tree(13);
		Tree t10 = new Tree(16);
		
		t1.addNode(t2);
		t1.addNode(t3);
		t1.addNode(t4);
		t1.addNode(t5);
		t1.addNode(t6);
		t1.addNode(t7);
		t1.addNode(t8);
		t1.addNode(t9);
		t1.addNode(t10);
		t1.addNode(new Tree(5));
		t1.addNode(new Tree(35));
		
		t1.traverse();
		System.out.println("----");
		t1.preorderTraversal();
		//t1.mirrorOfTree();
		/*t1.mirrorTry();
		System.out.println("----");
		t1.traverse();
		System.out.println("----");
		t1.preorderTraverse();
		
		System.out.println("----");
		t1.postorderTraverse();
		
		*//*t1.getHeight();
		t1.levelTraversal(t1);
		System.out.println();
		t1.levelTry3();
		System.out.println();
		*///System.out.println(" Count of full nodes is " + t1.levelTry(0));
		System.out.println(" count is " + t1.levelTry());
		System.out.println(" count from second function is  " + t1.levelTry2());
		//t1.traverse();
		//t1.mirror();
		//t1.deleteNode(t1);
		
		if(t1.find(new Tree(7)))
		    System.out.println(" found the element");
		else
		    System.out.println(" Did not find");
		
		Tree parent = t1.findParent(new Tree(11));
		if( parent == null) 
		    System.out.println(" did not find");
		else
		    System.out.println(" Parent data is " + parent.data);
		//t1.recursiveTraversal(t1);
		//t1.traverse();
		
		System.out.println(" maximum is " + t1.findMax().data);
		System.out.println(" minimum is " + t1.findMin().data);
		
		t1.deleteNode(t4);;
		t1.traverse();
		
		
	}
}


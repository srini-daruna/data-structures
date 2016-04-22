package com.srini.linkedlist;

public class SingleListImpl {
    public static void main(String... args){
	SingleLinkedList head = SingleLinkedList.addNode(10);
	SingleLinkedList node20 = new SingleLinkedList(20);
	head.addNode(node20);
	head.addNode(new SingleLinkedList(30));
	head.addNode(new SingleLinkedList(40));
	head.addNode(new SingleLinkedList(50));
	SingleLinkedList node60 = new SingleLinkedList(60);
	head.addNode(node60);
	/*head.addNode(new SingleLinkedList(60));
	head.addNode(new SingleLinkedList(70));
	head.addNode(new SingleLinkedList(80));
	head.addNode(new SingleLinkedList(20));
	head.addNode(new SingleLinkedList(30));
	head.addNode(new SingleLinkedList(100));
	head.addNode(new SingleLinkedList(90));
	head.addNode(new SingleLinkedList(110));
	head.addNode(new SingleLinkedList(120));
	head.addNode(new SingleLinkedList(130));
	head.addNode(new SingleLinkedList(20));
	head.addNode(new SingleLinkedList(140)); */

	head.traverse();

	node60.deleteRandom();

	System.out.println();
	head.traverse();

	//head.removeDuplicates();

    }

}

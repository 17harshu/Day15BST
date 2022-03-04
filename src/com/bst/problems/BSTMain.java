package com.bst.problems;

public class BSTMain {
	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.add(56);
		tree.add(30);
		tree.add(70);
		tree.display();
		int size = tree.getSize();
		System.out.println("Size : " + size);
	}
}

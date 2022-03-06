package com.bst.problems;

public class BSTMain {
	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.add(56);
		tree.add(30);
		tree.add(70);
		tree.add(22);
		tree.add(40);
		tree.add(11);
		tree.add(3);
		tree.add(16);
		tree.add(60);
		tree.add(95);
		tree.add(65);
		tree.add(63);
		tree.add(67);
		int size = tree.getSize();
		System.out.println("Size : " + size);

		Integer res = tree.search(63);
		if (res == 1)
			System.out.println("Key found");
		else
			System.out.println("Key not found");
	}
}

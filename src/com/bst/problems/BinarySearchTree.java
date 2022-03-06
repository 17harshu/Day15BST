package com.bst.problems;

public class BinarySearchTree<K extends Comparable<K>> {
	private BinaryNode<K> root;

	private BinaryNode addRecursively(BinaryNode<K> current, K key) {
		if (current == null)
			return new BinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = this.addRecursively(current.left, key);
		} else {
			current.right = this.addRecursively(current.right, key);
		}
		return current;
	}

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private int getSizeRecursively(BinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);

	}

	public int getSize() {
		return this.getSizeRecursively(root);
	}

	private void displayRecursively(BinaryNode current) {
		if (current == null) {
			System.out.println("No elements to display");
		} else {
			BinaryNode temp = current;
			System.out.println(temp.key);
			temp = current.left;
			System.out.println(temp.key);
			temp = current.right;
			System.out.println(temp.key);
		}
	}

	public void display() {
		displayRecursively(root);
	}

	private int searchKeyRecursively(BinaryNode<K> current, K key) {
		if (current == null)
			return 0;
		else if (current.key == key)
			return 1;
		else if (key.compareTo(current.key) < 0)
			return searchKeyRecursively(current.left, key);
		else if (key.compareTo(current.key) > 0)
			return searchKeyRecursively(current.right, key);
		return 0;
	}

	public int search(K key) {
		return this.searchKeyRecursively(root, key);
	}
}
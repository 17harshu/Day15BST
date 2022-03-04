package com.bst.problems;

public class BinaryNode<K extends Comparable<K>> {
	BinaryNode left;
	BinaryNode right;
	K key;

	public BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}
}

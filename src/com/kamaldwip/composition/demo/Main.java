package com.kamaldwip.composition.demo;

public class Main {
    static class Node
    {
        int key;
        Node left, right;
    }

    /* utility that allocates a new
       Node with the given key */
    static Node newNode(int key)
    {
        Node node = new Node();
        node.key = key;
        node.left = node.right = null;
        return (node);
    }

    /* Function to find sum
       of all the elements*/
    static int addBT(Node root)
    {
        int total = 0;
        if (root == null)
            return 0;
        total = root.key + addBT(root.left) +
                addBT(root.right);
        System.out.println("******* Total Here is ****** "+total);
        return total;
    }
    public static void main(String[] args) {
	// write your code here
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.left = newNode(6);
        root.right.right = newNode(7);
        root.right.left.right = newNode(8);

        int sum = addBT(root);
        System.out.println("Sum of all the elements is: " + sum);
    }
}

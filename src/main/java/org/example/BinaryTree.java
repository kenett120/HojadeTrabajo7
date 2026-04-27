package org.example;

public class BinaryTree<E extends Comparable<E>> {

    private class Node {
        E data;
        Node left, right;

        public Node(E data) {
            this.data = data;
        }
    }

    private Node root;

    // INSERT
    public void insert(E value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node current, E value) {
        if (current == null) return new Node(value);

        if (value.compareTo(current.data) < 0) {
            current.left = insertRec(current.left, value);
        } else {
            current.right = insertRec(current.right, value);
        }
        return current;
    }

    // SEARCH
    public E search(E value) {
        return searchRec(root, value);
    }

    private E searchRec(Node current, E value) {
        if (current == null) return null;

        if (value.compareTo(current.data) == 0) return current.data;

        if (value.compareTo(current.data) < 0)
            return searchRec(current.left, value);
        else
            return searchRec(current.right, value);
    }

    // IN-ORDER
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.println(node.data);
            inOrderRec(node.right);
        }
    }
}
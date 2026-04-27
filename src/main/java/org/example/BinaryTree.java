package org.example;

/**
 * Nombre: Kenett Ortega
 * Carnet: 25777
 * Hoja de Trabajo #7
 *
 * Implementación de un Árbol Binario de Búsqueda (BST).
 */
public class BinaryTree<E extends Comparable<E>> {

    /**
     * Nodo interno del árbol
     */
    private class Node {
        E data;
        Node left, right;

        Node(E data) {
            this.data = data;
        }
    }

    private Node root;

    /**
     * Inserta un elemento en el árbol
     */
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

    /**
     * Busca un elemento en el árbol
     */
    public E search(E value) {
        return searchRec(root, value);
    }

    private E searchRec(Node current, E value) {
        if (current == null) return null;

        int cmp = value.compareTo(current.data);

        if (cmp == 0) return current.data;

        if (cmp < 0) return searchRec(current.left, value);
        else return searchRec(current.right, value);
    }

    /**
     * Recorrido in-order (imprime ordenado)
     */
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
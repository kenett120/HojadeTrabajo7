package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Nombre: Kenett Ortega
 * Carnet: 25777
 * Hoja de Trabajo #7
 *
 * Pruebas unitarias para el árbol binario.
 */
public class BinaryTreeTest {

    @Test
    public void testInsertAndSearch() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("dog", "perro"));
        tree.insert(new Association<>("cat", "gato"));

        Association<String, String> result =
                tree.search(new Association<>("dog", ""));

        assertNotNull(result);
        assertEquals("perro", result.getValue());
    }

    @Test
    public void testSearchNotFound() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("dog", "perro"));

        Association<String, String> result =
                tree.search(new Association<>("bird", ""));

        assertNull(result);


    }

    @Test
    public void testMultipleInsertions() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("dog", "perro"));
        tree.insert(new Association<>("cat", "gato"));
        tree.insert(new Association<>("elephant", "elefante"));

        assertNotNull(tree.search(new Association<>("dog", "")));
        assertNotNull(tree.search(new Association<>("cat", "")));
        assertNotNull(tree.search(new Association<>("elephant", "")));
    }
}
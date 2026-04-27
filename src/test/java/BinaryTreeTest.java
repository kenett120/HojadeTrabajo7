package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
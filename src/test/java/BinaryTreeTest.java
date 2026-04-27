import static org.junit.jupiter.api.Assertions.*;

import org.example.Association;
import org.example.BinaryTree;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    @Test
    public void testInsertAndSearch() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("dog", "perro"));
        tree.insert(new Association<>("cat", "gato"));

        Association<String, String> result =
                tree.search(new Association<>("dog", ""));

        assertNotNull(result, "El resultado no debería ser null");
        assertEquals("perro", result.getValue(), "La traducción es incorrecta");
    }

    @Test
    public void testSearchNotFound() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("dog", "perro"));

        Association<String, String> result =
                tree.search(new Association<>("bird", ""));

        assertNull(result, "Debería ser null porque no existe");
    }

    @Test
    public void testMultipleInsertOrder() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("dog", "perro"));
        tree.insert(new Association<>("cat", "gato"));
        tree.insert(new Association<>("elephant", "elefante"));

        assertNotNull(tree.search(new Association<>("cat", "")));
        assertNotNull(tree.search(new Association<>("dog", "")));
        assertNotNull(tree.search(new Association<>("elephant", "")));
    }
}
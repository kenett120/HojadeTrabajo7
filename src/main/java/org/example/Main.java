package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            BinaryTree<Association<String, String>> tree =
                    DictionaryLoader.loadDictionary("diccionario.txt");

            System.out.println("=== Diccionario ordenado ===");
            tree.inOrder();

            System.out.println("\n=== Traducción ===");
            Translator.translate("texto.txt", tree);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
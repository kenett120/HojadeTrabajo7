package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            BinaryTree<Association<String, String>> tree =
                    DictionaryLoader.loadDictionary("diccionario.txt");

            System.out.println("=== In-Order ===");
            tree.inOrder(); // requerido en la hoja

            System.out.println("\n=== Traducción ===");
            Translator.translate("texto.txt", tree);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
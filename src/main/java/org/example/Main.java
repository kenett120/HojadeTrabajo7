package org.example;

/**
 * Nombre: Kenett Ortega
 * Carnet: 25777
 * Hoja de Trabajo #7
 *
 * Clase principal que ejecuta el programa.
 */
public class Main {

    public static void main(String[] args) {
        try {
            // Cargar diccionario
            BinaryTree<Association<String, String>> tree =
                    DictionaryLoader.loadDictionary("diccionario.txt");

            // Mostrar diccionario ordenado
            System.out.println("=== Diccionario ordenado ===");
            tree.inOrder();

            // Traducir texto
            System.out.println("\n=== Traducción ===");
            Translator.translate("texto.txt", tree);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
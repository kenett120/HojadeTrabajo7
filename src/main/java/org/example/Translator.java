package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Nombre: Kenett Ortega
 * Carnet: 25777
 * Hoja de Trabajo #7
 *
 * Clase encargada de traducir un archivo de texto
 * usando el diccionario almacenado en el BST.
 */
public class Translator {

    /**
     * Traduce el contenido de un archivo
     */
    public static void translate(String filename, BinaryTree<Association<String, String>> tree) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");

            for (String word : words) {

                // Limpia la palabra para buscar en el diccionario
                String clean = word.toLowerCase().replaceAll("[^a-z]", "");

                // Guarda la puntuación (.,!? etc)
                String punctuation = word.replaceAll("[a-zA-Z]", "");

                Association<String, String> result =
                        tree.search(new Association<>(clean, ""));

                // Si existe traducción
                if (result != null) {
                    System.out.print(result.getValue() + punctuation + " ");
                } else {
                    // Si no existe, se imprime con asteriscos
                    System.out.print("*" + word + "* ");
                }
            }
        }

        br.close();
    }
}
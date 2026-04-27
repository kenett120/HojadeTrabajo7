package org.example;

import java.io.*;

public class Translator {

    public static void translate(String filename, BinaryTree<Association<String, String>> tree) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");

            for (String word : words) {
                String clean = word.toLowerCase().replaceAll("[^a-z]", "");

                Association<String, String> searchKey =
                        new Association<>(clean, "");

                Association<String, String> result = tree.search(searchKey);

                if (result != null) {
                    System.out.print(result.getValue() + " ");
                } else {
                    System.out.print("*" + word + "* ");
                }
            }
        }

        br.close();
    }
}
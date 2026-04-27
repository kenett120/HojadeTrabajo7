package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Translator {

    public static void translate(String filename, BinaryTree<Association<String, String>> tree) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");

            for (String word : words) {

                String clean = word.toLowerCase().replaceAll("[^a-z]", "");
                String punctuation = word.replaceAll("[a-zA-Z]", "");

                Association<String, String> result =
                        tree.search(new Association<>(clean, ""));

                if (result != null) {
                    System.out.print(result.getValue() + punctuation + " ");
                } else {
                    System.out.print("*" + word + "* ");
                }
            }
        }

        br.close();
    }
}
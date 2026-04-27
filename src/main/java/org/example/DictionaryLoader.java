package org.example;

import java.io.*;

public class DictionaryLoader {

    public static BinaryTree<Association<String, String>> loadDictionary(String filename) throws IOException {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.replace("(", "").replace(")", "");
            String[] parts = line.split(",");

            String english = parts[0].trim().toLowerCase();
            String spanish = parts[1].trim();

            tree.insert(new Association<>(english, spanish));
        }

        br.close();
        return tree;
    }
}
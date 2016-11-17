package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        File newFile = new File("src/Files/RezultFile1.txt");
        try {
            for (String line :
                    Files.readAllLines(Paths.get("src/Files/File1.txt"), Charset.defaultCharset())) {
                String words[] = line.split("\\s+");

                for (String word : words) {
                    word = word.replace(",","").replace(".","");
                    if(word.length()<5){
                        list.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String word :
                list) {
            System.out.println(word);
        }
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(newFile);

            for (String word :
                    list) {
                fileOutputStream.write(word.getBytes());
                fileOutputStream.write("\n".getBytes());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

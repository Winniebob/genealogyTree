package ru.homework.genealogy_tree.WriterAndReader;


import java.io.FileReader;
import java.io.*;
import java.io.IOException;


public class Reader {
    public Reader() {
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("C:\\Users\\vilks\\IdeaProjects\\genealogyTree\\genealogy_tree"));
            String line = reader.readLine();

            while(line!=null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

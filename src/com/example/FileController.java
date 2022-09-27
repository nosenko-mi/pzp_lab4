package com.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class FileController {

    private FileController(){};

    public static void saveData(String fileName, char result){
        writeToFile(fileName, result);
    }

    public static Integer loadData(String fileName){
        Integer position = null;
        File file = new File(fileName);
        // read data
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String text;
            while ((text = reader.readLine()) != null) {
                position = Integer.parseInt(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.printf("File %s not found ", fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return position;
    }

    private static void writeToFile(String fileName, char str){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.printf("File %s not found ", fileName);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred while writing to a file");
        }
    }
}

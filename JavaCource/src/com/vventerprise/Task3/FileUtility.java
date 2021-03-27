package com.vventerprise.Task3;

import java.io.*;
import java.util.stream.Collectors;

public class FileUtility {
    public Boolean saveToFile(String filePath, String jsonData) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(jsonData);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String readFromFile(String filePath) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return  reader.lines().collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

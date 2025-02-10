package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileRead {

    public static List<String> readFromFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try (
                FileReader reader = new FileReader(filePath);
                BufferedReader in = new BufferedReader(reader);
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }
    public static void writeToFile(String filePath, List<String> strings) {

        try (
                FileWriter writer = new FileWriter(filePath);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
        ) {
            for (int i = 0; i < strings.size(); i++) {
                if (i == strings.size() - 1) {
                    bufferedWriter.write(strings.get(i));
                } else {
                    bufferedWriter.write(strings.get(i) + ",");
                }
            }
            System.out.println("Write Completed");
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
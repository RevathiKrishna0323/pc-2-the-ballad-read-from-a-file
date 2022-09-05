package com.jap.ballad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ballad {
    public static void main(String[] args) {
        Ballad ballad = new Ballad();
        ballad.readPoemFromAFile("src/main/resources/ballad.txt");
    }

    public String readPoemFromAFile(String fileName) {
        String output = "";
        int lineCount = 0;
        // Write the logic to read from a file
        try (FileReader reader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                output = output.concat(line + "\n");
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return output;
    }
}
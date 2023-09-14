package com.daniil.Practice.PracticeJava.com.intellekta.notetofile;

import java.io.*;
import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportNotesFromFileToList {

    public static List<String> readNotesToList(String path)  {
        List<String> notes;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            try {
                notes = new ArrayList<>();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (!line.isEmpty() || !line.isBlank()) {
                        notes.add(line);
                    }
                }
            } finally {
                bufferedReader.close();
            }
        } catch (AccessDeniedException e) {
            throw new RuntimeException("Access denied");
        } catch (IOException e) {
            throw new RuntimeException("File not found");
        } finally {
            System.out.println("Process finished");
        }
        return notes;
    }

    public static void writeCommentToNotes(String path) {
        String st = new Scanner(System.in).nextLine();
        try {
            FileWriter fileWriter = new FileWriter((path), true);
            fileWriter.write("\n" + "# " + st);
            fileWriter.close();
        } catch (AccessDeniedException e) {
            throw new RuntimeException("Access denied");
        } catch (IOException e) {
            throw new RuntimeException("File not found");
        } finally {
            System.out.println("Process finished");
        }
    }
}

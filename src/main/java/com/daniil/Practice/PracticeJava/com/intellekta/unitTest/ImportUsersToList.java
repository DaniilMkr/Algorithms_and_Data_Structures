package com.daniil.Practice.PracticeJava.com.intellekta.unitTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ImportUsersToList {

    public static void importUsersToList(String path) throws IOException {
        LinkedList<String> users = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String currentLine = reader.readLine();
                if (currentLine != "") {
                    users.add(currentLine);
                }

            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

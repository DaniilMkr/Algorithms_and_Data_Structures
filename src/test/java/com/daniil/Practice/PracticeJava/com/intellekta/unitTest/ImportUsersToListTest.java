package com.daniil.Practice.PracticeJava.com.intellekta.unitTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.io.TempDir;
import org.mockito.Mockito;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ImportUsersToListTest {

    @Test
    void fileExistInDirectory() {
        try {
            String st = System.getProperty("user.home");
            File file = new File(st + "\\users.txt");
            file.createNewFile();
            ImportUsersToList.importUsersToList(file.getPath());
            assertTrue(Files.exists(file.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test()
    void whenExceptionThrown_FileNotFound() {
        assertThrows(FileNotFoundException.class, () -> ImportUsersToList.importUsersToList(""));
    }


    @Test()
    void whenExceptionThrown_FileIsNull() {
        assertThrows(NullPointerException.class, () -> ImportUsersToList.importUsersToList(null));
    }
}
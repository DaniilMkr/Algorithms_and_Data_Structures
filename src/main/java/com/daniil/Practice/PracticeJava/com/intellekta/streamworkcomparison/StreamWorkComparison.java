package com.daniil.Practice.PracticeJava.com.intellekta.streamworkcomparison;

import java.io.*;
import java.nio.file.AccessDeniedException;
import java.util.*;

public class StreamWorkComparison {

    private static Map<String, Long> map = new HashMap<>();

    public static int checkFileReaderWork(String path) {
        try {
            long st = System.currentTimeMillis();
            FileReader fileReader = new FileReader((path));

            while ((fileReader.read()) != -1) {
            }
            map.put("FileReader", System.currentTimeMillis() - st);
            fileReader.close();


        } catch (FileNotFoundException e) {
            return -1;
        } catch (AccessDeniedException e) {
            return -1;
        } catch (IOException e) {
            return -1;
        }
        return 1;
    }

    public static int checkBufferedReaderWork(String path) {
        try {
            long st = System.currentTimeMillis();
            BufferedReader bufferedReader = new BufferedReader(new FileReader((path)));
            while ((bufferedReader.readLine()) != null) {
            }
            bufferedReader.close();
            map.put("BufferedReader", System.currentTimeMillis() - st);
        } catch (FileNotFoundException e) {
            return -1;
        } catch (AccessDeniedException e) {
            return -1;
        } catch (IOException e) {
            return -1;
        }
        return 1;
    }

    public static int checkScannerWork(String path) {
        try {
            long st = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                scanner.next();
            }
            scanner.close();
            map.put("Scanner", System.currentTimeMillis() - st);
        } catch (FileNotFoundException e) {
            return -1;
        }
        return 1;
    }

    public static Map<String, Long> compareReading(String path) {
        Map<String, Long> newMap = new LinkedHashMap<>();
        int file = checkFileReaderWork(path);
        int buffer = checkBufferedReaderWork(path);
        int scanner = checkScannerWork(path);
        if (file == -1 || buffer == -1 || scanner == -1) {
            return new HashMap<>();
        } else {
            map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEach(entry -> newMap.put(entry.getKey(), entry.getValue()));
        }
        return newMap;
    }
}

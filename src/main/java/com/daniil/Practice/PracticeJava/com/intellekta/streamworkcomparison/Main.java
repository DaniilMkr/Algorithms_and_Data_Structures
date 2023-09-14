package com.daniil.Practice.PracticeJava.com.intellekta.streamworkcomparison;

import com.daniil.Practice.PracticeJava.com.intellekta.notetofile.ImportNotesFromFileToList;

public class Main {
    public static String path = "C:\\Users\\Daniil\\Git\\JAVA\\Theory\\Algorithms\\Algorithms and data structures\\src\\main\\java\\com\\daniil\\Practice\\PracticeJava\\com\\intellekta\\file.txt";

    public static void main(String[] args) {

//        System.out.println("From filereader " + StreamWorkComparison.checkFileReaderWork(path));
//        System.out.println("From buffer reader " + StreamWorkComparison.checkBufferedReaderWork(path));
//        System.out.println("From scanner reader " + StreamWorkComparison.checkScannerWork(path));

        System.out.println(StreamWorkComparison.compareReading(path));
    }
}

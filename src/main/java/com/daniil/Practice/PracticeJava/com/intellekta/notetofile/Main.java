package com.daniil.Practice.PracticeJava.com.intellekta.notetofile;

public class Main {
    public static String path = "C:\\Users\\Daniil\\Git\\JAVA\\Theory\\Algorithms\\Algorithms and data structures\\src\\main\\java\\com\\daniil\\Practice\\PracticeJava\\com\\intellekta\\file.txt";

    public static void main(String[] args) {

        System.out.println(ImportNotesFromFileToList.readNotesToList(path));
        ImportNotesFromFileToList.writeCommentToNotes(path);
        System.out.println(ImportNotesFromFileToList.readNotesToList(path));



    }



}

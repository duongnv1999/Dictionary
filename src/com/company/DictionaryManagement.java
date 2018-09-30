/**
 * class  DictionaryManagemen quan li dictionary va word co chuc nang nhap lieu va sua doi
 * @author Nguyen Van Duong - Nguyen Trong Hoang (nhom 8)
 * @Since 30.9.2018
 * Version 1.0
 */


package com.company;
import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class DictionaryManagement {
    Dictionary dictionary = new Dictionary();

    /**
     * nhap vao tu ban phim cac tu moi va giai thich
     */
    void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String temp = sc.nextLine();
        for (int i=0; i<n; i++) {
            String word = sc.nextLine();
            String explain = sc.nextLine();
            Word newWord = new Word(word, explain);
            dictionary.pushNewWord(newWord);
        }
    }

    /**
     * doc du lieu tu file dictionaries.txt su dung bufferedReader
     */
    void insertFromFile() {
        try {
            BufferedReader br = null;
            br = new BufferedReader(new FileReader("dictionaries.txt")); // mo file dictionaries.txt
            String text = br.readLine(); // doc file dictionary theo tung dong mot
            while (text != null) {
                String[] splitStr = text.trim().split("\\s+"); // cat chuoi string boi cac dau space
                String explain = "";
                for (int i=1; i<splitStr.length; i++) explain = explain += (splitStr[i] + " ");
                Word newWord = new Word(splitStr[0], explain); // tao word moi co 2 thanh phan splitStr[o] la wordTarget va explain la wordExplain
                dictionary.pushNewWord(newWord); // them word vao danh sach
                text = br.readLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * lay ra nghia cua word
     * @param word tu can tra
     */
    String dictionaryLookup(String word) {
        return dictionary.getExplain(dictionary.findWord(word));

    }
}

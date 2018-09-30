/**
 * class DictionaryCommandLine chua ham main de quan li cac class
 * @author Nguyen Van Duong - Nguyen Trong Hoang (nhom 8)
 * @Since 30.9.2018
 * Version 1.0
 */

package com.company;
import java.util.*;

public class DictionaryCommandline {

    DictionaryManagement myDictionaryManagement = new DictionaryManagement();
    public void showAllWord() {
        System.out.println("NO     EngLish         VietNamese");
        for (int i=0; i<myDictionaryManagement.dictionary.getSize(); i++) {
            System.out.printf("%-5d|%-20s|%-60s\n",i,myDictionaryManagement.dictionary.getWord(i), myDictionaryManagement.dictionary.getExplain(i));
        }
    }
    public void dictionaryBasic() {
        myDictionaryManagement.insertFromCommandline();
        showAllWord();
    }
    public void dictionaryAdvance(String word) {
        myDictionaryManagement.insertFromFile();
        showAllWord();
        System.out.println(myDictionaryManagement.dictionaryLookup(word));
    }
    public static void main (String[] args) {
        DictionaryCommandline newDictionary = new DictionaryCommandline();
        //newDictionary.dictionaryBasic();
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        newDictionary.dictionaryAdvance(word);

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Word newWord = new Word("nguyen", "Duong");
        //newWord.setWordExplain( "nguyen");
        System.out.println(newWord.getWordExplain());

        System.out.println(newWord.getWordTarget());

    }

}

/**
 * class Word de lam viec voi tung word
 * @author Nguyen Van Duong - Nguyen Trong Hoang (nhom 8)
 * @Since 30.9.2018
 * Version 1.0
 */


package com.company;

public class Word {
    private String wordTarget; // tu moi
    private String wordExplain; // giai nghia

    /**
     * Tao object Word rong
     */
    public Word() {
        this.wordTarget = "";
        this.wordExplain = "";
    }

    /**
     * Tao object word voi 2 thuoc tinh cho san hoac nhap vao
     * @param wordTarget_ tu moi
     * @param wordExplain_ giai nghia
     */
    public Word(String wordTarget_, String wordExplain_) {
        wordTarget = wordTarget_;
        wordExplain = wordExplain_;
    }

    /**
     * set gia tri cho wordTarget;
     * @param wordTarget gia tri wordTarget dich
     */
    void setWordTarget(String wordTarget) {
        this.wordTarget = wordTarget;
    }

    /**
     * set gia tri cho wordExplain
     * @param wordExplain gia tri wordExplain dich
     */
    void setWordExplain(String wordExplain) {
        this.wordExplain = wordExplain;
    }

    /**
     * lay ra gia tri wordTarget
     * @return gia tri wordTarget
     */
    String getWordTarget() {
        return this.wordTarget;
    }

    /**
     * lay ra gia tri wordExplain
     * @return gia tri wordExplain
     */
    String getWordExplain(){
        return this.wordExplain;
    }

}

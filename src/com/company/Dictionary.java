/**
 * class  Dictionar de luu tru danh sach cac word
 * @author Nguyen Van Duong - Nguyen Trong Hoang (nhom 8)
 * @Since 30.9.2018
 * Version 1.0
 */


package com.company;

import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Word> wordList = new ArrayList(); // khoi tao 1 danh sach cac word
    private int size = 0 ;
    /**
     * them 1 word vao vi tri thu pos trong danh sach
     * @param newWord tu muon them.
     */
    public void pushNewWord (Word newWord) {
        wordList.add(newWord);
        size++;
    }

    /**
     * xoa 1 word tai vi tri thu pos
     * @param  pos vi tri muon xoa
     */
    public void removeWord(int pos) {
        wordList.remove(pos);
        size--;
    }

    /**
     * tim 1 word co trong danh sach hay khong
     * @param word tu can tim
     * @return vi tri thu i la vi tri cua word trong danh sach
     */
    int findWord(String word) {
        for (int i=0; i<wordList.size(); i++) {
            if (wordList.get(i).getWordTarget().compareTo(word) == 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     * tim vi tri co the chen 1 word moi vao danh sach
     * @param word word moi
     * @return vi tri co the chen
     */
    int findIndex(String word) {
        for(int i=0; i<wordList.size()-1; i++) {
            if (wordList.get(i).getWordTarget().compareTo(word) > 0 && wordList.get(i+1).getWordTarget().compareTo(word) < 0 ) {
                return i;
            }
        }
        return -1;
    }

    /**
     * lay ra size cua danh sach
     * @return size cua danh sach
     */
    public int getSize() {
        return this.size;
    }

    /**
     * lay ra wordTarget cua word thu i;
     * @param pos vi tri word can lay
     * @return wordTarget cua word
     */
    public String getWord(int pos) {
        return wordList.get(pos).getWordTarget();
    }

    /**
     * lay ra explain cua word thu pos
     * @param pos vi tri can lay ra
     * @return expalint cua word
     */
    public String getExplain(int pos) {
        return wordList.get(pos).getWordExplain();
    }


}

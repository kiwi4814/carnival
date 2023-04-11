package com.geek.design.patterns.creational.prototype;

import com.geek.design.patterns.creational.prototype.entity.SearchWord;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class DemoV2 {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();

    public void refresh() {
        HashMap<String, SearchWord> newKeywords = new LinkedHashMap<>();

        // 从数据库中取出所有的数据，放入到newKeywords中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords();
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            newKeywords.put(searchWord.getKeyword(), searchWord);
        }

        currentKeywords = newKeywords;
    }

    private List<SearchWord> getSearchWords() {
        // TODO: 从数据库中取出所有的数据
        return null;
    }
}
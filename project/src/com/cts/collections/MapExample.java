package com.cts.collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // HashMap<> has key,value pairs
        // no duplicate key, values can be duplicate
        Map<String,String>  alphabets=new HashMap<>();
        alphabets.put("a","apple");
        alphabets.put("b","boy");
        alphabets.put("b","ball");
        System.out.println(alphabets);
        System.out.println(alphabets.get("a"));
        Set<String> strings=alphabets.keySet(); //returns all eys in set form
        for(String key:strings)
            System.out.println(key+"   "+alphabets.get(key));
        alphabets.remove("b");
        Collection<String> values=alphabets.values();

    }
}

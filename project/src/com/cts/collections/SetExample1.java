package com.cts.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {
    public static void main(String[] args) {
        //Set<String> languages=new HashSet<>();
        Set<String> languages=new TreeSet<>();
        languages.add("java");
        languages.add("php");
        languages.add("js");
        languages.add("css");
        languages.add("html");
        languages.add("java");
        System.out.println(languages);
        languages.remove("php");
        System.out.println("all elements using iterator");
        Iterator<String> it=languages.iterator();
        System.out.println("Using Iterator");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("Using for each ");
        for (String s:languages){
            System.out.println(s+", ");
        }

        //TreeSet<>() sorts all elements;
    }
}

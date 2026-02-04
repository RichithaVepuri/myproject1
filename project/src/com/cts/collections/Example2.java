package com.cts.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<String> city=new LinkedList<>();
        city.addLast("chennai");
        city.addFirst("hyderabad");
        city.add("delhi");
        city.add("kolkata");
        city.addLast("cheenai");
        System.out.println(city.getFirst());
        System.out.println(city.getLast());
        System.out.println(city.get(2));
        System.out.println(Collections.max(city));
        System.out.println(Collections.min(city));
    }
}

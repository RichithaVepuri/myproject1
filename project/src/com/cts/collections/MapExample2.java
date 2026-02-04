package com.cts.collections;

import com.sun.source.tree.Tree;

import java.util.*;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Integer,String> employeeMap=new TreeMap<>();
        employeeMap.put(10001,"ramesh");
        employeeMap.put(10002,"suresh");
        employeeMap.put(100003,"rajesh");
        System.out.println(employeeMap);
        System.out.println("Using entry set");
        Set<Map.Entry<Integer,String>> entries=employeeMap.entrySet();
        for(Map.Entry<Integer,String> e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        List<String> list1=new ArrayList<>(employeeMap.values());
        System.out.println(list1);
        List<String> strings=Collections.unmodifiableList(list1);
        strings.add("hello"); //error
    }
}

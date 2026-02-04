package com.cts.collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List list1=new ArrayList();
        list1.add(42535);
        list1.add(new Integer(124));
        list1.add("hello world");
        list1.add(89707);
        list1.add(24435.5f);
        System.out.println(list1);
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        list1.remove(3);
        list1.remove("hello world");
        System.out.println("using for loop");
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println("using for each");
        for (Object o:list1){
            System.out.print(o+" ");
        }
        System.out.println(list1.size());
    }
}

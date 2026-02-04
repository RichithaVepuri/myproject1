package com.cts.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        String[] words=s.toLowerCase().split("\\s+");
        Map<String,Integer> mp=new HashMap<>();
        for(String word:words){
            if(mp.containsKey(word)){
                mp.put(word,mp.get(word)+1);
            }else{
                mp.put(word,1);
            }
        }
        System.out.println("Total number of words "+mp.size());
        for(Map.Entry<String,Integer> e: mp.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}

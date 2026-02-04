package com.cts.collections;

import java.util.Arrays;

public class ArraysPrg1 {
    public static void main(String[] args) {
        int a1[]={11,2,3,1,4};
        int a2[]={11,2,3,1,4,33};
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.equals(a1,a2));
        Arrays.sort(a1);
        System.out.println("sorted arrays"+Arrays.toString(a1));
        System.out.println("found at"+Arrays.binarySearch(a1,3));
    }
}

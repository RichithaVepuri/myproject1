package com.cts.exception;

public class Divison {
    int divison(int a,int b) throws Exception {
        if(b==0)
            throw new Exception("Second number is invalid");
        else
            return a/b;
    }

    public static void main(String[] args) {
        System.out.println("start of program");
        try {
            System.out.println(new Divison().divison(11,10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end of program");
    }
}

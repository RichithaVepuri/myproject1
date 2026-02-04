public class Overloading {
    //compile time polymorphism
    void addition(int a,int b){
        System.out.println("addition is "+(a+b));
    }
    void addition(int a,int b,int c){
        System.out.println("addition is "+(a+b+c));
    }
    void addition(float a,float b){
        System.out.println("addition is "+(a+b));
    }
    void addition(String a,String b){
        System.out.println("addition is "+(a+b));
    }

    public static void main(String[] args) {
        Overloading ol=new Overloading();
        ol.addition(10,20);
        ol.addition(10,20,30);
        ol.addition(10.5f,20.5f);
        ol.addition("hello","world");
    }
}

package com.cts;

public abstract interface Phone {
    void call();
    void message();
    String country="india";
}
interface BudgetPhone extends Phone{
    void audioPlay();
}
//multiple inheritance
//SmartPhone has two parent classes that is Phone,BudgetPhone
interface SmartPhone extends Phone,BudgetPhone{
    void internetSurfing();
    void banking();
    void videoPlay();
    void gamePlay();
}
class MyPhone extends A implements Phone,SmartPhone,BudgetPhone{

    @Override
    public void internetSurfing() {
        System.out.println("MyPhone can do internetsurfing");
    }

    @Override
    public void banking() {
        System.out.println("MyPhone can do banking");
    }

    @Override
    public void videoPlay() {
        System.out.println("MyPhone can do videoPlay");
    }

    @Override
    public void gamePlay() {
        System.out.println("MyPhone can do gamePlay");
    }

    @Override
    public void audioPlay() {
        System.out.println("MyPhone can do audioPlay");
    }

    @Override
    public void call() {
        System.out.println("MyPhone can do call");
    }

    @Override
    public void message() {
        System.out.println("MyPhone can do message");
    }

    public static void main(String[] args) {
        MyPhone myphone=new MyPhone();
        System.out.println("Phone features");
        myphone.call();
        myphone.message();
        myphone.audioPlay();
        myphone.banking();
        myphone.gamePlay();
        myphone.internetSurfing();;
        myphone.videoPlay();
        System.out.println("country name: "+Phone.country);
    }
}
class A{

}
class B{

}
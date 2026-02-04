public class User {
    void introduction(){
        System.out.println("i m User");
    }
    static void hello(){
        System.out.println("this is polymorphism");
    }
}
class Passenger extends User{
    static void hello(){
        System.out.println("this is polymorphism by passenger");
    }
    void introduction(){
        System.out.println("i m passenger");
    }
}
class Father extends User{
    void introduction(){
        System.out.println("I m father");
    }
}
class UserMain{
    public static void main(String[] args){
        User u; //dynamic binding, by overriding, runtime polymorhism
        u=new Father();
        u.introduction();
        u=new Passenger();
        u.introduction();
        Father.hello();
        Passenger.hello();
    }
}

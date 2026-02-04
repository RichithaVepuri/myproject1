public class Z {
    Z(){
        super();
        System.out.println("Z constructor");
    }
}
class Y extends Z{
    public Y(){
        super();
        System.out.println("Y constructor");
    }
}
class X extends Y{
    public X(){
        super();
        System.out.println("X constuctor");
    }

    public static void main(String[] args) {
        new X();
    }
}

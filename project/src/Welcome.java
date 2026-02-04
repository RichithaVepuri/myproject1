public class Welcome {
    void hello(String s){
        System.out.println("hello "+s);
    }
}
class Greeting extends Welcome{
    @Override
    void hello(String s){
        System.out.println("greeting "+s);
    }
    public static void main(String[] args) {
        Greeting greeting=new Greeting();
        greeting.hello("mohan");
    }
}
/* overriden methods cannot have weaker access modifier
public
protected
default
pivate
*/
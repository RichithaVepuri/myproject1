public class Test1 {
    int x;
    Test1(){}
    public Test1(int x) {
        this.x = x;
    }
}
//if default constructor not added it shows error so, we can add
// Test1(){} with super()
//if we not put Test1() then we add super(x:10)
class Test2 extends Test1{
    Test2(){
        super();
    }
}

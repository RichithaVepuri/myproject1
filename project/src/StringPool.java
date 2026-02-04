import java.util.Scanner;

public class StringPool {
    public static void main(String[] args) {
        String s1="welcome";
        String s2="welcome";
        System.out.println(s1==s2); // == checks references
        String s3=new String("welcome");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3)); //.equals check content
        System.out.println(new Scanner(System.in).next().equals("hello"));
        System.out.println(new Scanner(System.in).next()=="hello");
    }
}

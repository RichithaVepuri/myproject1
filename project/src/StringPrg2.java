public class StringPrg2 {
    public static void main(String[] args) {
        String s1="hello world";
        String s2="hello world";
        String s3="Hello World";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        String email="cts_abc@gmail.com";
        System.out.println(email.startsWith("cts"));
        System.out.println(email.endsWith(".com"));
        int pos=email.indexOf("@");
        if(pos>=0)
            System.out.println("Email is valid");
        else
            System.out.println("Email is Invalid");
        String var="we are learning java. we will lean java 8 also";
        System.out.println(var.indexOf("java"));
        System.out.println(var.lastIndexOf("java"));
        String[] s=var.split(" ");
        for(String p:s){
            System.out.println(p+", ");
        }
        var="in-course@we$will-react#spring-boot";
        s=var.split("-");
        System.out.println("split with - ");
        for(String p:s)
            System.out.print(p+", ");

        s=var.split("-|@|#|$");
        System.out.println("split with - @ # $");
        for(String p:s)
            System.out.print(p+", ");

        System.out.println("\nhello world ".length());
        System.out.println(" hello world ".trim().length());

        String location="";
        System.out.println(location.isBlank());
        System.out.println(location.isEmpty());
    }
}

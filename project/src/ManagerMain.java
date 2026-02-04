public class ManagerMain {
    public static void main(String[] args) {
        Manager m1=new Manager(10001,"suresh",20000,"hyderabad","tamilnadu");
        System.out.println("\t id:"+m1.getPersonId());
        System.out.println("\t name:"+m1.getPersonName());
        System.out.println("\t salary:"+m1.getPersonSalary());
        System.out.println("\t location:"+m1.getLocation());
        System.out.println("\t state:"+m1.getState());
    }
}

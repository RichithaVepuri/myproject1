public class Manager extends Person{
    private String location;
    private String state;

    public Manager(int personId, String personName, float personSalary, String location, String state) {
        super(personId, personName, personSalary);
        this.location = location;
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public String getState() {
        return state;
    }

    public static void main(String[] args) {
//        Manager m1=new Manager();
//        m1.personId=890708;
//        m1.personName="suresh";
//        m1.personSalary=90892.0f;
//        m1.location="chennai";
//        m1.state="tamilnadu";
//        System.out.println("Manager data");
//        System.out.println("\t id:"+m1.getPersonId());
//        System.out.println("\t name:"+m1.getPersonName());
//        System.out.println("\t salary:"+m1.getPersonSalary());
//        System.out.println("\t location:"+m1.location);
//        System.out.println("\t state:"+m1.state);
    }
}

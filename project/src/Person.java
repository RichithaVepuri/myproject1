public class Person {
    protected int personId;
    protected String personName;
    protected float personSalary;

    Person(){}
    public Person(int personId,String personName,float personSalary){
        this.personId=personId;
        this.personName=personName;
        this.personSalary=personSalary;
    }
    public int getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public float getPersonSalary() {
        return personSalary;
    }
}

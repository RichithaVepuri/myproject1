package com.cts;

public class Manager extends Employee{
    private float pf;
    private String location;

    public Manager(int employeeId, String employeeName, float employeeSalary, float pf, String location) {
        super(employeeId, employeeName, employeeSalary);
        this.pf = pf;
        this.location = location;
    }

    public static void main(String[] args) {
        Manager manager=new Manager(10001,"sarath",39087,0.05f,"chennai");
        System.out.println("Manager data");
        System.out.println("\t id:"+manager.getEmployeeId());
        System.out.println("\t name:"+manager.getEmployeeName());
        System.out.println("\t salary:"+manager.getEmployeeSalary());
        System.out.println("\t salary:"+manager.getEmployeeSalary());

    }


    public float calculateSalary() {
        return getEmployeeSalary()-getEmployeeSalary()*pf;
    }
    void employeeInfo(){
        System.out.println("manager data:");
        super.employeeInfo();
        System.out.println("\t gross salary:"+calculateSalary());
        System.out.println("\t pf: "+pf);
        System.out.println("\t location:"+location);
    }
}

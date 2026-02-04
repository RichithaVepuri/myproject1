package com.cts.collections;

import java.util.Map;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee[]=new Employee[3];
        int id[]={111,112,113};
        String name[]={"suresh","rahmds","weqa"};
        float salary[]={20000,39500,13900};
        EmployeeOperation operation=new EmployeeOperation();
        for(int i=0;i< employee.length;i++){
            employee[i]=new Employee();
            employee[i].setId(id[i]);
            employee[i].setName(name[i]);
            employee[i].setSalary(salary[i]);
            operation.addEmployee(employee[i]);
        }
        System.out.println("all employee list");
        Map<Integer,Employee> allEmployee=operation.getAllEmployee();
        for (int k:allEmployee.keySet()){
            System.out.println(allEmployee.get(k));
        }
        Employee e1=operation.searchEmployeeById(2000);
        if(e1!=null){
            System.out.println("found "+e1);
        }else {
            System.out.println("not found");
        }

    }
}

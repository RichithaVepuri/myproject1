public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Employee Data");
        Employee employee=new Employee();
        Address address=new Address();
        address.setAddrId(1);
        address.setAddrLocation("chennai");
        address.setAddrState("tamil nadu");
        employee.setEmployeeId(10001);
        employee.setEmployeeName("suresh");
        employee.setEmployeeSalary(32908);
        employee.setAddress(address);
        System.out.println("\t id "+employee.getEmployeeId());
        System.out.println("\t name "+employee.getEmployeeName());
        System.out.println("\t salary "+employee.getEmployeeSalary());
        System.out.println("\n\t Address\n");
        System.out.println("\t id "+address.getAddrId());
        System.out.println("\t location "+address.getAddrLocation());
        System.out.println("\t state "+address.getAddrState());
    }
}

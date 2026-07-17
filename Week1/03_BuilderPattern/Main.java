public class Main {
    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder()
                .setEmployeeId(101)
                .setName("Dheeraj")
                .setDepartment("Development")
                .setSalary(55000)
                .build();

        employee.displayEmployee();
    }
}

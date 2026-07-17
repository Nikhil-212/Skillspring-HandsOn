public class Main {
    public static void main(String[] args) {
        Report employeeAccess = new ReportProxy("employee");
        Report managerAccess = new ReportProxy("manager");

        // Same interface is used for both controlled and allowed access.
        employeeAccess.viewReport();
        managerAccess.viewReport();
    }
}

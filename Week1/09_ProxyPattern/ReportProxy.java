public class ReportProxy implements Report {
    private String userRole;
    private ConfidentialReport confidentialReport;

    public ReportProxy(String userRole) {
        this.userRole = userRole;
    }

    public void viewReport() {
        // Proxy checks permission before creating the real object.
        if (userRole.equalsIgnoreCase("manager")) {
            if (confidentialReport == null) {
                confidentialReport = new ConfidentialReport();
            }
            confidentialReport.viewReport();
        } else {
            System.out.println("Access denied. Only managers can view this report.");
        }
    }
}

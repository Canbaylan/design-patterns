public class main {
    public static void main(String[] args) {
        Report empReport = new EmployeeReport(new DesktopFormat());
        empReport.Display();

        Report salReport = new SalesReport(new WebFormat());
        salReport.Display();

        salReport = new EmployeeReport(new DesktopFormat());
        salReport.Display();
    }
}

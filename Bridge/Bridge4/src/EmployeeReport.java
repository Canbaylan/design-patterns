public class EmployeeReport extends Report{
    public EmployeeReport(IReportFormat _reportFormat) {
        super(_reportFormat);
    }

    @Override
    public void Display() {
        System.out.println("----Employee Report ----");
        super.Display();
    }
}

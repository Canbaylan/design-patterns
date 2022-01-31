public class SalesReport extends Report{
    public SalesReport(IReportFormat _reportFormat) {
        super(_reportFormat);
    }

    @Override
    public void Display() {
        System.out.println("----Sales Report----");
        super.Display();
    }
}

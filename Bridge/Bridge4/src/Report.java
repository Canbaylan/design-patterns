public abstract class Report {
    private IReportFormat ReportFormat ;
    public Report(){}
    public Report(IReportFormat _reportFormat)
    {
        this.ReportFormat = _reportFormat;
    }
    public void Display()
    {
        ReportFormat.Generate();
    }
}

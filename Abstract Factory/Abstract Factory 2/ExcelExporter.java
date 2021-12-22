
class ExcelExporter implements FileExporter {
    private String content;

    public ExcelExporter(String content)
    {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Excel {" +
                "Content=" + content + " }";
    }

}

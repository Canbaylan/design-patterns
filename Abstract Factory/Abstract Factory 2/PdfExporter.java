
class PdfExporter implements FileExporter {
    private String content;

    public PdfExporter(String content)
    {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Pdf {" +
                "Content=" + content + " }";
    }

}

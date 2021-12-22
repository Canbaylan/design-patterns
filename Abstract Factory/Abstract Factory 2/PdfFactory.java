public class PdfFactory implements FileExporterFactory{
    @Override
    public FileExporter getFile(String content) {
        return new PdfExporter(content);
    }
}

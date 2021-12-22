public class ExcelFactory implements FileExporterFactory{
    @Override
    public FileExporter getFile(String content) {
        return new ExcelExporter(content);
    }
}

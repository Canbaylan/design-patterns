public class main {
    public static void main(String[] args) {
        //Factory
        /*String file = FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF)
                .export("Test content");
        System.out.println(file);*/

        ExcelFactory excelFactory = new ExcelFactory();
        FileExporter excel =  excelFactory.getFile("Excel File");
        System.out.println(excel);

        PdfFactory pdfFactory = new PdfFactory();
        FileExporter pdf = pdfFactory.getFile("Pdf file");
        System.out.println(pdf);

    }
}

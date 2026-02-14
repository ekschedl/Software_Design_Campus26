package Adapter.PdfDocx;

public class DocxPlugin implements TextEditor{
    @Override
    public void open(String file) {
        System.out.println("Opening Docx file: example.docx");
    }

    @Override
    public boolean supportsFormat(String format) {
        if (format.equals("docx")) {
            return true;
        }
        return false;
    }
}

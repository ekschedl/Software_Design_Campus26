package Adapter.PdfDocx;

public interface TextEditor {

    public boolean supportsFormat(String format);
    public void open(String file);
}

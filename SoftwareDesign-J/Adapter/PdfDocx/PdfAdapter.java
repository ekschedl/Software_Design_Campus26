package Adapter.PdfDocx;

public class PdfAdapter implements TextEditor{

    private PdfReader reader;
    private static PdfAdapter instance;
    public PdfAdapter(PdfReader reader) {
        this.reader = reader;
    }
    public static PdfAdapter getInstance(PdfReader reader) {
        if (instance == null) {
            instance = new PdfAdapter(reader);
        }
        return instance;
    }

    @Override
    public void open(String file) {
        reader.loadPfd(file);
    }

    @Override
    public boolean supportsFormat(String format) {
        if (format.equals("pdf")) {
            return true;
        }
        return false;
    }
}

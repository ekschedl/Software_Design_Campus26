package Adapter.PdfDocx;

public class Main {
    public static void main(String[] args) {
        TextEditorManager textEditorManager = new TextEditorManager();
        textEditorManager.addTextEditor(new DocxPlugin());
        textEditorManager.addTextEditor(new PdfAdapter(new PdfReader()));

        // Dateien öffnen
        textEditorManager.openFile("example.docx");
        textEditorManager.openFile("example.pdf");
        textEditorManager.openFile("example.txt");
    }
}

package Adapter.PdfDocx;

import java.util.ArrayList;
import java.util.List;

public class TextEditorManager {

    private List<TextEditor> plugins;

    public TextEditorManager() {
        plugins = new ArrayList<TextEditor>();
    }

    public void addTextEditor(TextEditor plugin) {
        plugins.add(plugin);
    }

    public void openFile(String file) {
        String format = file.contains(".") ? file.substring(file.lastIndexOf(".") + 1).toLowerCase() : "";

        for (TextEditor plugin : plugins) {
            if (plugin.supportsFormat(format)) { // Prüfen, ob Plugin das Format unterstützt
                plugin.open(file);
                return;
            }

        }
    }
}



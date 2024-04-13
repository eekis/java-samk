package org.example.T18_filehandler;

public class Text extends File {
    public Text(String path) {
        super(path, FileType.TEXT);
    }

    @Override
    public void open() {
        System.out.println("Opening " + getType() + " file from " + getPath());
    }

    @Override
    public void close() {
        System.out.println("Closing " + getType() + " file from " + getPath());
    }
}

package org.example.T18_filehandler;

public class Audio extends File {
    public Audio(String path) {
        super(path, FileType.AUDIO);
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

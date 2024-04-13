package org.example.T18_filehandler;


enum FileType {
    TEXT,
    AUDIO,
}

abstract class File {
    final String path;
    FileType type;

    abstract void open();
    abstract void close();

    public File(String path, FileType type) {
        this.path = path;
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public FileType getType() {
        return type;
    }
}
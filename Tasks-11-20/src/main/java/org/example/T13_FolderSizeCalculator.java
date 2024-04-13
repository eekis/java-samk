package org.example;

import java.io.File;

public class T13_FolderSizeCalculator {
    public static long getFolderSize(File folder) {
        long result = 0;
        File[] files = folder.listFiles();

        assert files != null;

        for (File file : files) {
            if (file.isFile()) {
                result += file.length();
            } else {
                result += getFolderSize(file);
            }
        }
        return result;
    }
}

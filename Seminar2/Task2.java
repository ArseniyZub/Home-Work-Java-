// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.
package Seminar2;

import java.io.*;
import java.nio.file.*;
import java.nio.file.Path; 


public class Task2 {
    public static void main(String[] args) {
        Path file = Path.of("Seminar2", "file.txt");
        boolean isFileExists = Files.exists(file);
        
        if (!isFileExists) {
            try {
                Files.createFile(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        String words = "";
        for (int i = 0; i < 100; i++) {
            words += "TEST\n";
        }

        try {
            Files.writeString(file, words);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}    


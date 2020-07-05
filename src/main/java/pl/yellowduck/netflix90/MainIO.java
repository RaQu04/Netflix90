package pl.yellowduck.netflix90;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

public class MainIO {
    public static void main(String[] args) throws IOException {

        //Wylisotwać katalog
        //listFiles();

        Path path = Paths.get("C:/users/domownicy/test.txt");
        File file = new File("C:/users/domownicy/test.txt");


        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardOpenOption.APPEND)){
            bufferedWriter.write("Jakiś tekst5");
        };
//        bufferedWriter.write("Jakis tekst");
//        bufferedWriter.flush();
//        bufferedWriter.close();

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


    private static void listFiles() {
        File file = new File("c:/Users/Domownicy");

        boolean exists = file.exists();

        System.out.println(exists);

        for (File list : Objects.requireNonNull(file.listFiles())) {
            System.out.println(list.getName());
        }
    }
}

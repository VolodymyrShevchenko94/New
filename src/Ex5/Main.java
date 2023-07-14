package Ex5;

import java.io.*;

/**
 * Створіть файл, запишіть у нього довільні дані та закрийте файл.
 * Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.
 */

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
            bufferedWriter.write("Some text\n");
            bufferedWriter.write("hello text\n");
            bufferedWriter.close();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

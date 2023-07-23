package Ex7_2;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
 * Виведіть на екран вміст файлу
 */


public class Main {
    public static void main(String[] args) throws IOException {
        String poem = "fdfdfd\n" +
                "dfdfdf,\n" +
                "dff\n" +
                "fd.";

        FileWriter fileWriter = null;
        FileReader fileReader = null;

        try {
            fileWriter = new FileWriter("/Users/alina/Desktop/untitled folder/Ex11_7/src/Ex7_2/SomeTxtFile.txt");
            for (int i = 0; i < poem.length(); i++) {
                fileWriter.write(poem.charAt(i));
            }
            System.out.println("Файл записаний!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }

        try {
            fileReader = new FileReader("/Users/alina/Desktop/untitled folder/Ex11_7/src/Ex7_2/SomeTxtFile.txt");
            int symbol = 0;
            while ((symbol = fileReader.read()) != -1) {
                System.out.print((char) symbol);
            }
            System.out.println();
            System.out.println("Файл прочитаний!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }

}
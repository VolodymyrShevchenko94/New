package Decryptor2;

import java.io.*;

public class Decryptor {
    public static void main(String[] args) {
        File file_in = new File("/Users/alina/Desktop/untitled folder/Ex11_7/src/Decryptor2/text.txt");
        File file_out = new File("/Users/alina/Desktop/untitled folder/Ex11_7/src/Decryptor2/text.txt");
        String[] values = {"до", "за", "в", "під", "для", "по", "поза", "понад", "через", "крім", "поміж", "з-за", "з-під", "з", "від", "між",};

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file_in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_out))
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");

                for (int i = 0; i < words.length; i++) {
                    for (int j = 0; j < values.length; j++) {
                        if (words[i].equalsIgnoreCase(values[j])) {
                            words[i] = "Java";
                        }
                    }
                }
                String resultLine = String.join(" ", words);
                bufferedWriter.write(resultLine + "\n");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        try {
            if (file_in.delete()) {
                file_out.renameTo(file_in);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

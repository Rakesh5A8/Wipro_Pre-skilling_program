package Day8;

import java.io.*;

public class Fileprocessor {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;

        try {
            BufferedWriter essayWriter = new BufferedWriter(
                new FileWriter("D:\\Vs code for Wipro\\Day 8\\essay.txt")
            );
            essayWriter.write("Java is a versatile programming language.\n");
            essayWriter.write("It is used to build web, desktop, and mobile applications.\n");
            essayWriter.write("File handling in Java is efficient and reliable.\n");
            essayWriter.close();

            BufferedReader reader = new BufferedReader(
                new FileReader("D:\\Vs code for Wipro\\Day 8\\essay.txt")
            );
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(
                new FileWriter("D:\\Vs code for Wipro\\Day 8\\report.txt")
            );
            writer.write("Total number of lines: " + lineCount + "\n");
            writer.write("Total number of words: " + wordCount + "\n");
            writer.close();

            System.out.println("Report generated successfully!");
            System.out.println("Total number of lines: " + lineCount);
            System.out.println("Total number of words: " + wordCount);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
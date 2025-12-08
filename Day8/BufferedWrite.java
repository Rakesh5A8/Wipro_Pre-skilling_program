package Day8;

import java.io.*;

public class BufferedWrite {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\rakes\\OneDrive\\Documents\\hello.txt");
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error while creating file.");
        }

        // 2. Write to File using BufferedWriter
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\rakes\\OneDrive\\Documents\\hello.txt"));
            bw.write("Hello! This is written using buffered reader");
            bw.newLine();
            bw.write("Content written using BufferedWriter.");
            bw.close();
            System.out.println("Successfully wrote to the file using BufferedWriter.\n");
        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        }

    }
}
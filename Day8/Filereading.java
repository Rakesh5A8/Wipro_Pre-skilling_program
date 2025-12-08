package Day8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereading{
    public static void main(String[] args) {
        File file = new File("myJavaFile.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file creation.");
            
        }

        String data = "Hello, Java File Handling!";

        try (FileWriter writer = new FileWriter("myJavaFile.txt")) {
            writer.write(data);
            System.out.println("Successfully wrote data to myJavaFile.txt");
        } catch (IOException e) {
            System.out.println("An error occurred during writing.");
        }

        try (FileReader reader = new  FileReader("myJavaFile.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Cast the integer back to a character
            }
            
            System.out.println("End of file");

        } catch (IOException e) {
            System.out.println("An error occurred during reading.");
        }

        File oldFile = new File("myJavaFile.txt");
        File newFile = new File("newfile.txt");
        oldFile.renameTo(newFile);
        System.out.println("file renamed");
    }

    
}
package InputOutputHandlingAssertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

// This version uses try-with-resources construct that auto closes the file.
public class ShowFileTryWithResources {
    public static void main(String[] args) {
        int i;
        PrintWriter pw = new PrintWriter(System.out, true);
        // Confirm, that filename has been specified.
        if (args[0] == null) {
            pw.println("Enter filename as argument.\nExample: java ShowFile test.txt");
            pw.flush();
            return;
        }

        try(FileInputStream fileInputStream = new FileInputStream(args[0]);) {
            do {
                i = fileInputStream.read(); // Reads the data from the file in ASCII format and stored in the integer.
                pw.print((char) i); // Converting the integer back to the character.
                pw.flush();
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.err.println("Error occured while opening the file.");
            return;
        }catch (IOException e) {
            System.err.println("Error occured while reading the file.");
        }
    }
}

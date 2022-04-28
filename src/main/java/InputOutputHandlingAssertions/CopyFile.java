package main.java.InputOutputHandlingAssertions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* COPY A FILE
To use this program, specify the name of the source file and then the name of the destination file.
For example, java CopyFile FIRST.txt SECOND.txt
*/

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fis = null;
        FileOutputStream fos = null;

        if (args.length != 2) {
            System.err.println("example, java CopyFile FIRST.txt SECOND.txt");
        }

        // Copy a file
        try {
            // Attempt to open the files
            fis = new FileInputStream(args[0]);
            fos = new FileOutputStream(args[1]);

            do {
                i = fis.read();
                fos.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.err.println("I/O Exception: " + e);
        } finally {
            // Close the filestreams.
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                System.out.println("I/O Exception: " + e);
            }
        }
    }
}

package main.java.InputOutputHandlingAssertions;

// Read a string from the console using a BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) {
        // Create a BufferedReader using System.in
        String s = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter lines of text, Type \"STOP\" to stop inputs");
            do {
                s = bufferedReader.readLine();
                System.out.println(s);
            } while (!s.equalsIgnoreCase("stop"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
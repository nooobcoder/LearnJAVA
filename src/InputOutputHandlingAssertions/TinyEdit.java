package InputOutputHandlingAssertions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A very basic, tiny text editor

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        String strArray[] = new String[100];
        System.out.println("Start typing into the file, type \"STOP\" to terminate input");

        for (int a = 0; a < 100; ++a) {
            strArray[a] = bR.readLine();
            if (strArray[a].equalsIgnoreCase("stop"))
                break;
        }
        System.out.println("\nHere is your file");
        System.out.println("------------------ START OF FILE -------------------\n");

        for (String string : strArray) {
            if (string.equalsIgnoreCase("stop") || string == null)
                break;
            else
                System.out.println(string);
        }

        System.out.println("\n------------------ END OF FILE -------------------");
    }
}

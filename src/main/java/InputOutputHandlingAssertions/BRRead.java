package main.java.InputOutputHandlingAssertions;

// Use a BufferedReader to read characters from the console
import java.io.*;

public class BRRead {
	public static void main(String[] args) {
		char ch;
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter characters, \'q\' to quit: ");
			do {
				ch = (char) bufferedReader.read();
				System.out.print(ch);
			} while (ch != 'q');
			System.out.println();
		} catch (IOException exception) {
			System.out.println(exception);
		}
	}
}
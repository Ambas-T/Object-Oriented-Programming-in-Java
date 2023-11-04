package Fundamental;

import java.io.FileWriter;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {
		readFile();
		writeFile();
	}

	private static void readFile() {
		FileReader reader = null;
		try {
			reader = new FileReader("input.txt");
			int character;
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeFile() {
		try (FileWriter writer = new FileWriter("output.txt")) {
			writer.write("Hello, World!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

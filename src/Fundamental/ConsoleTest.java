package Fundamental;

import java.io.Console;
import java.util.Arrays;

public class ConsoleTest {
	
	public static void main(String[] args) {
		Console console = System.console();
		
		if(console!=null)
		{
			char[] password = console.readPassword("Enter your password: ");
			console.printf("You entered %s as your password.%n", new String(password));
			// It's good practice to immediately clear the password from memory after use
			Arrays.fill(password, ' ');
		}
	}
}


package java_exceptions;

import java.io.IOException;

public class throw_and_throws_keyword {
public static void findFile()throws IOException,ArithmeticException{
	System.out.println("File not found");
}
	
	public static void main(String[] args) {
		try {
		findFile();
		System.out.println("Rest of code in try block");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}

package GarbageCollection;

import java.util.Scanner;

public class Garbage1 {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your location");
		String location = scanner.nextLine();
		System.out.println("Your location is "+location);
		//scanner.close(); As we can see memory is leaking without closing scanner
		
	}

}

package Internship;

import java.io.*;
import java.util.*;

public class File_Handling {

	public static void main(String[] args) {
		
		 try {
	            // Create a File object for the sample text file
	            File file = new File("Personal Information.txt");

	            // Create Scanner object to read the file
	            Scanner reader = new Scanner(file);

	            System.out.println("Contents of the file:");
	            // Read the file line by line
	            while (reader.hasNextLine()) {
	                String line = reader.nextLine();
	                System.out.println(line);
	            }

	            // Close the scanner
	            reader.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found. Please make sure file exists.");
	        }

	}

}

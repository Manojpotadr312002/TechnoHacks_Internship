package Internship;
import java.io.*;
import java.util.*;

public class Palindrome {
	
	// Method to reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase for accurate comparison
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = reverseString(cleanedInput);

        // Check if palindrome
        if (cleanedInput.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }	

	}

}

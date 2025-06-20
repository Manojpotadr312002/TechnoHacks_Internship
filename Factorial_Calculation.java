package Internship;
import java.io.*;
import java.util.*;

public class Factorial_Calculation {
	
	public static long factorial(int number) {
		if(number ==1 || number ==0) {
			return 1;
		}
		else {
			return number * factorial(number-1);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a non-negative integer: ");
	    int number = sc.nextInt();

	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            long result = factorial(number);
	            System.out.println("Factorial of " + number + " is: " + result);
	        }
	}

}

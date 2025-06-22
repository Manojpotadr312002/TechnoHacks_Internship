package Internship;

import java.util.Scanner;

public class Exception_Handling {
	
	public static int divide(int a, int b)throws ArithmeticException{
		return a/b;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Divident : ");
		int Dividend = sc.nextInt();
		
		System.out.println("Enter the Divisor : ");
		int Divisor = sc.nextInt();
		
		int result = 0;
		
		try {
			result = divide(Dividend,Divisor);
			System.out.println("The result of "+Dividend+" divide by "+Divisor+" is : "+result);
		} 
		catch (ArithmeticException e) {
			System.out.println("Invalid Divisor");
		}
		catch (Exception e){
			System.out.println("Error: unexpected error ....!"+ e.getMessage());
		}
		finally {
			System.out.println("Program Completed ...!");
		}

	}

}

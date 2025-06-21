package Internship;
import java.io.*;
import java.util.*;

public class Fibonacci_Series {
	
	public static void fibonacci(int limit) {
		int a=0, b=1;
		
		System.out.println("Fibonacci series upto "+limit+" is : ");
		
		while(a<=limit) {
			System.out.print(a+" ");
			int next = a+b;
			a=b;
			b=next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit of fibonacci series : ");
		int limit = sc.nextInt();
		
		fibonacci(limit);
	}

}

package Internship;

import java.util.Scanner;

public class Array_Manipulation {
	
	public static void BubbleSort(int a[]) {
		int n = a.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	
	public static int LinearSort(int a[], int element) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == element) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void Display(int a[]) {
		for(int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of element : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter the element in array : ");
		for(int i=0; i<size; i++) {
		a[i] = sc.nextInt();
		}
		
		BubbleSort(a);
		System.out.println("Sorted array : ");
		Display(a);
		
		System.out.println("Enter the element to search : ");
		int number = sc.nextInt();
		int result = LinearSort(a, number);
		
		if(result != -1) {
			System.out.println("Element " + number + " found at index " + result);
	    } 
		else {
	        System.out.println("Element " + number + " not found in the array.");
	    }

	}

}

package Internship;

	
	import java.util.Scanner;

	public class Zig_Zag {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take input for number of rows and columns
	        System.out.print("Enter number of rows (typically 3): ");
	        int rows = sc.nextInt();
	        System.out.print("Enter number of columns: ");
	        int columns = sc.nextInt();

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= columns; j++) {
	                // Logic to print stars in zig-zag (example for 3 rows)
	                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}




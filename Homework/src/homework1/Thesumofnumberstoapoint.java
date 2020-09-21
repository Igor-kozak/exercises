package homework1;

import java.util.Scanner;

public class Thesumofnumberstoapoint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		int userNumber = -1;
		int sum = 0;
		
		while( userNumber < 1) {
			System.out.println(" Enter a positive number ");
			userNumber =  scanner.nextInt();
					
		}
		/* the program will loop the amount of times the user will ask it to thus substitute the sum into the equation
		 * and add consequent numbers in the sequence.
		 */
		
		for( int number = -1; number <=userNumber; number++) {
		 
			sum = sum + number;
			
		}
		System.out.println("the sum of numbers from 1 to " + userNumber + " is " + sum );
	}
}

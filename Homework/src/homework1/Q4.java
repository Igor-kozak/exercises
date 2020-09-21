package homework1;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner method = new Scanner(System.in);
				System.out.println("Eneter numbers you want added. \n type 0 to end");
				int sum = 0;
				
				while (true) {
					int number = method.nextInt(); //we assume the user will add only integers
						if (number == 0) break;
							sum += number;
						
				}
				System.out.println("Sum is " + sum);
	}
}

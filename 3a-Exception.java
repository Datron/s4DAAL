
/* 3a. Write a Java program to read two integers a and b. Compute a/b and print, when b is not zero. Raise an exception when b is equal to zero.
*/
import java.util.Scanner;

class exception {

	public static void main(String[] args) {
		int a, b, result;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");

		a = input.nextInt();
		b = input.nextInt();

		try {
			result = a / b;
			System.out.println("Result = " + result);
		}

		catch (ArithmeticException e) {
			System.out.println("Exception caught: Division by zero.");
		}
	}
}

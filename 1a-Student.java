
/* 1a. Create a Java class called Student with the following details as variables within it.
(i)  USN
(ii)  Name
(iii) Branch
(iv) Phone
Write a Java program to create nStudent objects and print the USN, Name, Branch, and Phone of these objects with suitable headings.

*/

import java.util.Scanner;

class Student {

	String USN, Name, Branch, Phone;

	Scanner input = new Scanner(System.in);

	void read() {
		System.out.println("Enter Student Details");
		System.out.println("Enter USN");
		USN = input.nextLine();

		System.out.println("Enter Name");
		Name = input.nextLine();

		System.out.println("Enter Branch");
		Branch = input.nextLine();

		System.out.println("Enter Phone");
		Phone = input.nextLine();
	}

	void display() {
		System.out.printf("%-20s %-20s %-20s %-20s", USN, Name, Branch, Phone);
	}
}

class studentdetails {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of student details to be created");
		int number = input.nextInt();

		Student s[] = new Student[number];

		// Read student details into array of student objects

		for (int i = 0; i < number; i++) {
			s[i] = new Student();
			s[i].read();
		}

		// Display student information

		System.out.printf("%-20s %-20s %-20s %-20s", "USN", "NAME", "BRANCH", "PHONE");
		for (int i = 0; i < number; i++) {
			System.out.println();
			s[i].display();
		}
	 input.close();
	}
}

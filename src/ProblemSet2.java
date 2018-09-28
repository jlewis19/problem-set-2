/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */
import java.util.Scanner;

public class ProblemSet2 {
	
	/**
	 * You need not modify the main method.
	 */
	Scanner in = new Scanner(System.in);
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		System.out.print("Enter your first name: ");
		String firstName = in.nextLine();
		System.out.print("Enter your last name: ");
		String lastName = in.nextLine();
		System.out.println("Hello, " + firstName + " " + lastName + "!\n");
	}
	
	public void gradeMe() {
		System.out.print("Insert homework score 1: ");
		Double h1 = in.nextDouble();
		System.out.print("Insert homework score 2: ");
		Double h2 = in.nextDouble();
		System.out.print("Insert homework score 3: ");
		Double h3 = in.nextDouble();
		
		System.out.print("Insert quiz score 1: ");
		Double q1 = in.nextDouble();
		System.out.print("Insert quiz score 2: ");
		Double q2 = in.nextDouble();
		System.out.print("Insert quiz score 3: ");
		Double q3 = in.nextDouble();
		
		System.out.print("Insert test score 1: ");
		Double t1 = in.nextDouble();
		System.out.print("Insert test score 2: ");
		Double t2 = in.nextDouble();
		System.out.print("Insert test score 3: ");
		Double t3 = in.nextDouble();
		
		Double homework = (h1 + h2 + h3) / 3;
		Double quiz = (q1 + q2 + q3) / 3;
		Double test = (t1 + t2 + t3) / 3;
		
		Double finalGrade = homework*0.15 + quiz*0.3 + test*0.55;
		System.out.printf("Your grade: %.2f", finalGrade);
		System.out.println("%\n");
	}

	public void groupUs() {
		System.out.println("How many students are attending the field trip?");
		int students = in.nextInt();
		System.out.println("How many teachers are attending the field trip?");
		int teachers = in.nextInt();
		int people = students + teachers;
		int buses = people / 47;
		if (people % 47 >= 1) {
			buses++;
		}
		
		if (buses == 1) {
			System.out.println(buses + " bus will be required.\nThere will be " + (people + 1) + " people on the bus (including the driver).\n");
		}
		else {
			System.out.println(buses + " buses will be required.");
			System.out.println("There will be 48 people on every bus (including drivers) except one, which will have " + ((people % 47) + 1) + " people.\n");
		}
	}
	
	public void info() {
		in.nextLine();
		System.out.println("What is your first name?");
		String fName = in.nextLine();
		System.out.println("What is your last name?");
		String lname = in.nextLine();
		System.out.println("What grade are you in?");
		int grade = in.nextInt();
		System.out.println("How old are you?");
		int age = in.nextInt();
		System.out.println("What town are you from?");
		in.nextLine();
		String hometown = in.nextLine();
		
		System.out.println("NAME\t : {" + fName + "} {" + lname + "}");
		System.out.println("GRADE\t : {" + grade + "}");
		System.out.println("AGE\t : {" + age + "}");
		System.out.println("HOMETOWN : {" + hometown + "}\n");
	}
	
	public void initials() {
		System.out.print("Please enter your first name: ");
		String fName = in.nextLine();
		System.out.print("Please enter your middle name: ");
		String mName = in.nextLine();
		System.out.print("Please enter your last name: ");
		String lName = in.nextLine();
		
		System.out.println("Your initials are " + Character.toUpperCase(fName.charAt(0)) + Character.toUpperCase(mName.charAt(0)) + Character.toUpperCase(lName.charAt(0)));
		
		in.close();
	}
}
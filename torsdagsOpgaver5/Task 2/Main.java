import java.util.Scanner;
class Main {

	public static void main(String[] args) {


		System.out.println("Please type your name");

		Scanner myScanner = new Scanner(System.in);

		String name = myScanner.nextLine(); 

		System.out.println("Hello " + name + " " + "Please type your age");

		int age = myScanner.nextInt(); 

		System.out.println("You are  " + age + " " + "years old");
		int retirementAge = 67;
		int zero = 0;

		if(age >= zero && age >= retirementAge){

			System.out.println("You're retired");

		} else {

			System.out.println("You have " + (retirementAge - age) + " years until retirement");

		}
		

	}



}
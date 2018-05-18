import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		
		System.out.println("How old are you?");
		int age = input.nextInt();
		
		System.out.println("What is your birth month?");
		int birthMonth = input.nextInt();
		
		System.out.println("What is your favorite ROYGBIV color?");
		String favColor = input.next();
		
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		
		
	}

}

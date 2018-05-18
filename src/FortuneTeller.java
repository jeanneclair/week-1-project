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
		int retirementAge = 0;
		
		if (age % 2 == 0) {retirementAge = 20;
			
		} else { retirementAge = 15;
		}
			
		
		System.out.println("What is your birth month?");
		int birthMonth = input.nextInt();
		int bankBalance = 0;
		
		switch (birthMonth) {
			case 1: 
			case 2:  
			case 3:  
			case 4: bankBalance = 100000;
				break;
			case 5:
			case 6:
			case 7:
			case 8: bankBalance = 1000000;
				break;
			default: bankBalance = 500000;
			break;
		}
		
		System.out.println("What is your favorite ROYGBIV color?");
		String favColor = input.next();
		
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		
	System.out.println(firstName + " " + lastName  + " will retire in " + retirementAge + "years, with " + bankBalance + " in the bank");
	}
}

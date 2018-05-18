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

		if (age % 2 == 0) {
			retirementAge = 20;

		} else {
			retirementAge = 15;
		}

		System.out.println("What is your birth month?");
		int birthMonth = input.nextInt();
		input.nextLine();
		int bankBalance = 0;

		switch (birthMonth) {
		case 1:
		case 2:
		case 3:
		case 4:
			bankBalance = 100000;
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			bankBalance = 1000000;
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			bankBalance = 500000;
		default:
			bankBalance = 1;
			break;
		}

		System.out.println("What is your favorite ROYGBIV color?");
		String favColor = input.nextLine();
		
		while(favColor.equals("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet.");
			favColor = input.nextLine();
		}
		
		
		String transport = " ";

		switch (favColor.toLowerCase()) {
		case "red":
			transport = "minivan";
			break;
		case "orange":
			transport = "VW bus";
			break;
		case "yellow":
			transport = "taxi cab";
			break;
		case "green":
			transport = "hybrid car";
			break;
		case "blue":
			transport = "electric car";
			break;
		case "indigo":
			transport = "pickup truck";
			break;
		case "violet":
			transport = "sports car";
			break;

		default:
			transport = "foot";
			break;
		}

		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		String vacationHome = " ";

		switch (siblings) {
		case 0:
			vacationHome = "Costa Rica";
			break;

		case 1:
			vacationHome = "the Colorado mountains";
			break;

		case 2:
			vacationHome = "the Pacific Northwest";
			break;

		case 3:
			vacationHome = "Belize";

			break;
			
	

		default:
			if (siblings >= 4) {
				vacationHome = "Paris, France";
			} else {
				vacationHome = "the Arctic Circle";
			}
			break;
		}

		System.out.println(firstName + " " + lastName + " will retire in " + retirementAge + " years, with "
				+ bankBalance + " in the bank, a vacation home in " + vacationHome + ", and travel by " + transport + ".");
	}
}

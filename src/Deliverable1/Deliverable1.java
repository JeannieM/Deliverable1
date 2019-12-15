package Deliverable1;

import java.util.Scanner;

public class Deliverable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String vacationType;
		int groupSize;
		String result;
		String suggestDest;
		String suggestTravel;
		
		
		System.out.println("What kind of vacation would you like to go on? Choose musical, tropical, or adventurous:");
		vacationType = scan.nextLine();
		
		if (vacationType.equalsIgnoreCase("musical")) {
			suggestDest = "New Orleans";
		}
		else if (vacationType.equalsIgnoreCase("tropical")) {
			suggestDest = "a beach vacation in Mexico";
		}
		else if (vacationType.equalsIgnoreCase("adventurous")) {
			suggestDest = "go whitewater rafting in the Grand Canyon";
		}
		else {
			System.out.println("invalid input");
			return;
		}
		
		
		System.out.println("How many are in your group?");
		groupSize = scan.nextInt();
		
		if ((groupSize == 1) || (groupSize == 2)) {
			suggestTravel = "first class flight";
		}
		else if ((groupSize >= 3) && (groupSize <= 5)) {
			suggestTravel = "helicopter";
		}
		else if (groupSize > 5) {
			suggestTravel = "charter flight";
		}
		else {
			System.out.println("invalid input");
			return;
		}
		
		
		if (vacationType.equalsIgnoreCase("adventurous")) {
			result = "Since you are a group of " + groupSize + " and you want to go on an " + vacationType + " vacation, you should take a " + suggestTravel + " to " + suggestDest + "!";
		}
		else {
			result = "Since you are a group of " + groupSize + " and you want to go on a " + vacationType + " vacation, you should take a " + suggestTravel + " to " + suggestDest + "!";
		}	
		
		System.out.println(result);
	}

}

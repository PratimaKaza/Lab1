import java.util.Scanner;

public class Perimeterandarea {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);              // initiating Scanner class
		/*** declaring variables ***/
		double roomLength = 0.0;
		double roomWidth = 0.0;
		double roomArea = 0.0;
		double roomPerimeter = 0.0;
		String roomContinue = "y";
		Boolean roomRedo = true;

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		while (roomRedo == true) {		//main loop to rerun main part of pgrm if user wants to continue.
			/* taking input from user */
			System.out.println("Please enter the lenght of the room.");
			roomLength = scnr.nextDouble();
			System.out.println("Please enter the width of the room.");
			roomWidth = scnr.nextDouble();

			//System.out.println(roomLength);    //checking that the input was scanned.
			//System.out.println(roomWidth);

			roomPerimeter = (2 * (roomLength)) + (2*(roomWidth));  // applying formulas and assigning those to variables
			System.out.println(roomPerimeter);
			roomArea = roomLength * roomWidth;
			System.out.println(roomArea);

			System.out.println("Continue? (y/n)");     // input from user as whether or not continue pgrm
			scnr.nextLine();
			scnr.close();
			//roomContinue = scnr.nextLine();
			System.out.println(roomContinue);
				if ((roomContinue.equals("y")) || (roomContinue.equals("Y"))) {  // loop as to continue or not depending on user input.
					roomRedo = true;
				} else {
					roomRedo = false;
				}

		}

	}
}

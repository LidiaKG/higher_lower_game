package new_pseudocode_game;

import java.util.Scanner;
import java.util.Random;

public class new_pseudocode_game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String playAgain = "Y";
		String playAgain2;
		// random number between 1 and 100
		
		Random rand = new Random();

		int  randNum = rand.nextInt(100) + 1;


		//While play again = yes, then go again
		
			while (playAgain.equals("Y")) {
					

				// user inputs guess	
				System.out.print("Guess number between 1 and 100  ");
				System.out.print("\n");	
				int guess = scanner.nextInt();	
				int guess_num = guess; 
		
				// while random != guess
				while (randNum != guess_num) {
					
					if (randNum < guess_num) {
					System.out.println("Too big. Try again.");
					System.out.print("\n");	
					break;
					} 
					
					if (randNum > guess_num) {
					System.out.println("Too small. Try again.");
					System.out.print("\n");	
					break;
					} 
				} // close while
		
		// if random num = guess num, correct, and ask if play again
			if (randNum == guess_num)  {
					System.out.println("Correct.");
					System.out.print("\n");	
					
					// end and play again - Y for play again, N for quit
					
					System.out.print("Do you want to play again? Y/N");
					System.out.print("\n");	
					playAgain2 = scanner.next();	
		
					playAgain = playAgain2; 
				} 
			}
			
				System.out.println("Bye");
				System.out.print("\n");	
			
		scanner.close();
		
	}
} 


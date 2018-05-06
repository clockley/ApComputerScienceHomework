/*
 * get random number and make user guess that number.
 * 
 * Christian Lockley
 * 8/30/14
 */
 
import java.util.Scanner;
public class GuessingGameV1 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int guess = -1;
		int counter = 0;
		int randomNumber = (int)(Math.random() * 100)+1;

		while (guess != randomNumber) {
			counter+=1;
			System.out.print("Enter your guess: ");
			guess = in.nextInt();
			if (guess < randomNumber) {
				System.out.println("too low");
			} else if (guess > randomNumber) {
				System.out.println("too high");
			} else {
				System.out.println("just right");
			}
		}

		System.out.println("Random number was: "+randomNumber+
		"\nNumber of guesses: "+counter);
	}
}

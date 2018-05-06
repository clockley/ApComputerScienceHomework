 /* get a range of numbers then randomly select a number within the given range
  * user guesses selected random number.
  * Christian Lockley
  * 10/13/14
  */
import java.util.Scanner;
public class GuessingGameV2 {
	
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int counter = 0, randomNumber;
		int guess = -1;

		System.out.print("Enter lower end of range: ");
		int lower = in.nextInt();
		System.out.print("Enter upper end of range: ");
		int upper = in.nextInt();

		if (upper == lower) {
			randomNumber = lower;
		} else {
			randomNumber = (int)(Math.random()*(upper-lower)+lower+1);
		}

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

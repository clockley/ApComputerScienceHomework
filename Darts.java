
import java.security.SecureRandom;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

public class Darts {
	public static void main (String args[]) {
		long trials = PromptUserTrials();
		long darts = PromptUserDarts();
		double averagePi = 0;
		long match = 0;
		for (long i = 0; i < trials; i += 1) {
			double x = 0, y = 0;
			System.out.print("Trial [ "+i+" ] : " );
			for (long j = darts; j != 0; j -=1) {
				x = ChooseRandomValues();
				y = ChooseRandomValues();
				if (PointInCircle(x, y)) {
					match += 1;
				}
			}
			averagePi += 4.0*(double)match/darts;
			System.out.println(4.0*(double)match/darts);
			match = 0;
		}
		System.out.println("Estimate of pi = "+averagePi/(trials+.0));
	}
	
	public static boolean PointInCircle(double x, double y) {
		return Math.pow(x, 2) + Math.pow(y, 2) <= 1;
	}
	
	public static long PromptUserDarts() {
		System.out.print("darts thrown per trial: ");
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
	
	public static long PromptUserTrials() {
		System.out.print("number of trials to run: ");
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}
	
	public static double ChooseRandomValues() {
		Random randNum = new SecureRandom();
		return randNum.nextDouble();
	}
}

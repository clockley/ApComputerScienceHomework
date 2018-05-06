/**
 * Description for 5.05 Dice Probability project
 *
 * @author (Christian lockley)
 * @version (10/21/14)
 *
 * This program simulates the tossing of dice and determines the likelihood of different combinations.
 *
 */

import java.util.Random;
import java.util.Scanner;

public class DiceProbability
{
    public static void main(String[] args)
    {
		int sum = 0;
		int numSides = 0;
		int numRolls = 0;
		int match = 0; //Number of times sum of dice matches the current sum
		int die2 = 0;
		int die1 = 0;
		double probability = 0.0;
		Scanner in = new Scanner(System.in);
		Random randNum = new Random();

    	//Declare and initialize variables and objects

        //Input: ask user for number of rolls and number of sides on a die
		System.out.print("Please enter the number of rolls: ");
		numRolls = in.nextInt();
		
        System.out.print("Please enter the number of sides on a die: ");
        numSides = in.nextInt();

        //Print heading for output table
		System.out.print("\n Sum of dice \t Probability \n");

        //***************************************************************************************
        //Using nested loops, cycle through the possible sums of the dice.
        //Roll the dice the given number of times for each sum.
        //Count how many times the sum of the dice match the current sum being looked for.
        //***************************************************************************************
        //Loop to increment through the possible sums of the dice
        	//Loop to throw dice given number of times
        		//Randomly generate values for two dice
            	//Check if the sum of dice is equal to the given sum
            //After all throws, calculate percentage of throws that resulted in the given sum
            //Print results

		for (sum = 2; sum <= (numSides * 2); sum++) {
			match = 0;
			for(int roll  = 0; roll < numRolls; roll++) {
				die2 = randNum.nextInt( numSides ) +1;
				die1 = randNum.nextInt( numSides ) +1;
				if ( die1 + die2 == sum ) {
					match++;
				}
			}
			probability = (double)match / numRolls * 100;
			System.out.println("    " + sum + "\t\t" + probability );
		}
    } //end main
}//end class DiceProbability

/**
 * Description for 5.04 Lottery project
 * 
 * @author (Christian Lockley)
 * @version (10/20/14)
 */
 
import java.util.Scanner;
public class Lottery4
{
    public static void main(String[] args)
    {
		int debug = 0;
        //declare and initialized variables and objects
        Scanner in = new Scanner(System.in);
        
        String lotteryNum = "";
        String userGuess = "";
        
        //Generate a 3-digit "lottery" number composed of random numbers
        //Simulate a lottery by drawing one number at a time and 
        //concatenating it to the string
        //Identify the repeated steps and use a for loop structure
        
        for (int i = 0; i <= 2; i += 1) {
			lotteryNum += ((int)(Math.random()*100)%9) + "";
		}

		//lotteryNum = "123";
       
		if (debug != 0) {
			System.out.println("RANDOM NUMBER: "+lotteryNum);
		}
       
        //Input: Ask user to guess 3 digit number
        /*123
         * 120
         * 023
         * 022
         * 333
         * 325
         * 020
		 * */
		 
		System.out.print(" Please enter a three digit number: ");
		userGuess = in.next();

        //Compare the user's guess to the lottery number ...
        int matched = 0;
        for (int i = 0; i < 3; i += 1) {
			String tmp = userGuess.substring(i, i + 1);
			if (tmp.equals(lotteryNum.substring(i, i + 1))) {
				if (i == 0) {
					matched += 1;
				}
				if (i == 1) {
					matched += 1;
				}	
				if (i == 2) {
					matched += 1;
				}
			} else {
				if (i == 0) {
					matched -= 3;
				}
				if (i == 1) {
					matched -= 2;
				}
				if (i == 2) {
					matched -= 1;
				}
			}
		}
	
		if (debug != 0) {
			System.out.println(matched);
		}

		//and report results
		if (matched == 1) {
			System.out.println("\tCongratulations, the front pair matched\n\tWinner: "+lotteryNum);
		} else if (matched == -1) {
			System.out.println("\tCongratulations, the end pair was matched\n\tWinner: "+lotteryNum);
		} else if (matched == 3) {
			System.out.println("Congratulations, both pairs matched\n\tWinner: "+lotteryNum);
		} else {
			System.out.println("\tSorry, no matches\n\tWinner: "+lotteryNum);
		}
		        
    } //end main
}//end class Lottery

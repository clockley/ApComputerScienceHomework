/**
 * The purpose of this program is to demonstrate how to write information to
 * a text file on the hard disk.
 * 
 * @author Christian Lockley
 * @version 11/4/2014
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

class BottleCapPrize
{
   public static void main (String [ ] args) throws IOException
   {
       String pathName = "BottleCapPrize.txt";
       Random randNum = new Random();
       System.out.print("Enter number of trials: ");
       Scanner in = new Scanner(System.in);
       PrintWriter outFile = new PrintWriter(new File(pathName));
       int timesOpened = 0;
       int numReqRolls;
	
        for (int tmp = numReqRolls = in.nextInt(); tmp != 0; tmp -= 1) {	
	    int opened = 0;	
            int dieValue = randNum.nextInt(5);  
            while (dieValue != 1) {
			   dieValue = randNum.nextInt(5);
               opened+=1;
            }   
            if (dieValue == 1) {
				opened+=1;
	        }
           outFile.println(opened);
        }

        outFile.close();

        Scanner inFile = new Scanner(new File(pathName));

	while (inFile.hasNextLine()) {
         String line = inFile.nextLine();
         timesOpened += Integer.parseInt(line);
	}

	System.out.println("average number of bottles opened before opening winning cap: "+(timesOpened/numReqRolls)*1.0);
   }
}

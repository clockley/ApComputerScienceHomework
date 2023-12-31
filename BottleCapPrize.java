
import java.security.SecureRandom;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

class BottleCapPrize
{
   public static void main (String [ ] args) throws IOException
   {
	   String pathName = "BottleCapPrize";
       Random randNum = new SecureRandom();
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
		   outFile.println(opened+" "+(numReqRolls-(tmp - 1)));
         }

         outFile.close();
         //delete outFile;

        Scanner inFile = new Scanner(new File(pathName));

		while (inFile.hasNextLine()) {
            String line = inFile.nextLine();
            timesOpened += Integer.parseInt(line.substring(0, line.indexOf(" ")));
		}
		System.out.println("average number of bottles opened before opening winning cap: "+timesOpened/numReqRolls);
   }
}


/**
 * This program models flipping an unbiased coin and counting the
 * number of times heads or tails occurs.
 * 
 * @author C. Lockley 
 * @version 08/12/14
 */
 
import java.util.Scanner;

public class PopulationRatio
{
	public static void main(String[] args)
	{
	    int women = 0;
	    int men = 0;
	    int counter = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Population ratio simulator for U.S");
	    System.out.println("population? ");
	    int population = in.nextInt();
	    
	    while(counter <= population)
	    {
			if(randNum <= .493) {
				men += 1;
			} else {
				women +=1;
			}
	        randNum = Math.random();
			counter += 1;
	    }
	    System.out.println();

	    System.out.println("men = " + men);
	    System.out.println("women = " + women);
	}
}

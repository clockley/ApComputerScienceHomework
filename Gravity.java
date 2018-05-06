
/**
 * cacluate surface gravity on different Planets
 *
 * @author (Christian Lockley)
 * @version (11/27/14)
 */
 
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

public class Gravity
{
	// calcGravity returns an array of doubles containing teh gravity values
	//and takes two arrays of doubles as parameters for the radius values and mass
	public static double[] calcGravity(double[] radius, double [] mass)
	{
		double [] ret = new double[radius.length];
		// fill in code here
		// The formula to calculate gravity is:
		// 6.67E-17 times the massOfPlanet divided by the radius of the planet squared
		for (int i = 0; i != radius.length; i +=1) {
			ret[i] = (6.67E-17 * mass[i]) / (radius[i] * radius[i]);
		}
		return ret;
	}

	// printResults will print the table to output screen
	// return type is voide because no values are returned
	public static void printResults(String[] name, double[] radius, double[] mass, double gravity[])
	{
		    System.out.printf("%40s", "Planetary data\n");
		    System.out.printf(" %-8s%10s    %s       %s\n", "Planet", "Diameter", "(km Mass (kg)", "g (m/s^2)");
		    for (int i = 10; i != 0; i -= 1) {
				System.out.printf("________");
			}
			for (int i = 0; i != radius.length; i +=1) {
				System.out.printf(" %-8s%10.2f    %.2e            %.2e\n", name[i], radius[i], mass[i], gravity[i]);
			}
	}

	//print the gravity values to text file
	public static void printToFile(String fileName, String[] name, double gravity[])throws IOException
	{
		    PrintWriter outFile = new PrintWriter(new File(fileName));
			for (int i = 0; i != gravity.length; i +=1) {
				outFile.printf(" %-8s    %.2f\n", name[i], gravity[i]);
			}
			outFile.close();
	}

    public static void main(String[] args)throws IOException
    {
        // Initialize variables
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] radii = {2439.7, 6051.9, 6378, 3402.5, 71492, 60270, 25562, 24774, 1195};
        double [] masses = {3.30E23, 4.87E24, 5.97E24, 6.42E23, 1.90E27, 5.68E26, 8.68E25, 1.02E26, 1.27E22};
        String fileName = "gravity1.txt";

		// Processing
		double[] gravities = calcGravity(radii, masses);

		// Output
		printResults(names, radii, masses, gravities);
		printToFile(fileName, names, gravities);


    } //end main
}//end class

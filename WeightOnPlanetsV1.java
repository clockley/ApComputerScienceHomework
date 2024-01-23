/**
 * This program cacluates your weight on the Planets.
 *
 * @author (Christian Lockley)
 * @version (11/27/15)
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

public class WeightOnPlanetsV1 {
	public static int fileLength(String fileName) throws IOException {
		Scanner inFile = new Scanner(new File(fileName));
		int i = 0;
		while (inFile.hasNextLine()) {
			inFile.nextLine();
			i += 1;
		}
		inFile.close();
		return i;
	}

	public static void printHeader() {
		System.out.printf("My Weight on the Planets\n");
		System.out.printf(" %-5s     %-5s     %-5s", "Planet", "Gravity", "Weight(lbs)\n");
		for (int i = 40; i != 0; i -= 1) {
			System.out.printf("-");
		}
		System.out.printf("\n");
	}

	public static void readFile(String fileName, String[] name, double sg[]) throws IOException {
		Scanner inFile = new Scanner(new File(fileName));
		int i = 0;
		while (inFile.hasNext()) {
			name[i] = inFile.next();
			sg[i] = inFile.nextDouble() / 10;
			if ("earth".equalsIgnoreCase(name[i]) == true)  {
				sg[i] += 1.0 - sg[i];
			}
			i++;
		}
		inFile.close();
	}

	public static double [] calculateWeight(double w, double [] sg, String n[]) {
		double [] ret = new double[sg.length];
		for (int i = 0; i < sg.length; i+=1) {
			ret[i] = (((w * 433.59237) / 1.0) *sg[i]) / 433.59237;
		}
		return ret;
	}

	public static void WriteToFile(String fileName, double [] w, String name[], double sg[]) throws IOException {
		PrintWriter outFile = new PrintWriter(new File(fileName));
		for (int i = 0; i < sg.length; i += 1) {
			outFile.printf(" %-8s    %-2.2f    %8.2f\n", name[i], sg[i], w[i]);
		}
		outFile.close();
	}
	public static void WriteToScreen(double [] w, String name[], double sg[]) {
		for (int i = 0; i < sg.length; i += 1) {
			System.out.printf(" %-8s    %-2.2f    %8.2f\n", name[i], sg[i], w[i]);
		}
	}

	public static void main (String args[]) throws IOException {
		String fileName = "gravity1.txt";
		String outFile = "output.txt";
		int len = fileLength(fileName);
		double [] sg = new double[len];
		String [] name = new String[len];
		
		printHeader();
		readFile(fileName, name, sg);
		double [] w = calculateWeight(140, sg, name);
		WriteToFile(outFile, w, name, sg);
		WriteToScreen(w, name, sg);
	}
}

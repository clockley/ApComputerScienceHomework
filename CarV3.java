/**
 * The purpose of this program is learn about default constructors and OOP
 * 
 * @author Christian Lockley
 * @version 12/16/14
 * Lesson: 08.03
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

public class CarV3
{
    CarV3()
    {
	}

	public int calcDistance(int sMiles, int eMiles) {
		return eMiles - sMiles;
	}
	
	public double calcMPG(int dist, double gals) {
		return dist / gals;
	}
	
	public static void main(String[] args) {
		CarV3 car1 = new CarV3();
		System.out.printf("%40s", "Gas Mileage Cacluations\n");
		String [] c = {"Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gal"};
		String pff = " %-3s   %-3s   %-3s   %-3s   %-3s   %-3s\n";
		System.out.printf(pff, c[0], c[1], c[2], c[3], c[4], c[5]);
		for (int i = 80; i != 0; i -= 1) {
			System.out.print("=");
		}
		System.out.printf("\n");
		int sm1 = 1024;
		int em1 = 2048;
		int g1 = 256;
		int d1 = 4096;
		String m1 = "03 Kia Sedona";
		String spaced="    ";
		System.out.printf(pff, m1+spaced, sm1+spaced, em1+spaced,
						   car1.calcDistance(sm1, em1)+spaced, g1+spaced,
						   car1.calcMPG(d1,g1)+spaced);
	}
}

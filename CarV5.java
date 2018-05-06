/**
 * This program sets class variables to values given in default constructor.
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

public class CarV5
{
	private double myPricePerGallon;
	private double myGallonsUsed;
	private double myEndMiles;
	private double myStartMiles;
	private String myType;
	
    CarV5(String type, double startMiles, double endMiles, double gallonsUsed, double pricePerGallon)
    {
		myType = type;
		myStartMiles = startMiles;
		myEndMiles = endMiles;
		myGallonsUsed = gallonsUsed;
		myPricePerGallon = pricePerGallon;
	}


	public double calcDistance() {
		return myEndMiles - myStartMiles;
	}
	
	public double calcMPG() {
		return calcDistance() / myGallonsUsed;
	}

	public double calcGPM() {
		return myGallonsUsed / calcDistance();
	}

	public double totalCost() {
		return myPricePerGallon * myGallonsUsed;
	}

	public String getType() {
		return myType;
	}
	
	public double getGallons() {
		return myGallonsUsed;
	}
	
	public double pricePerGallon() {
		return myPricePerGallon;
	}
	public double getStartMiles() {
		return myStartMiles;
	}
	
	public double getEndMiles() {
		return myEndMiles;
	}
	
	public static void main(String[] args) {
		CarV5 car1 = new CarV5("03 Saturn Vue", 14373, 14731, 16.2, 2.98);
		String [] col = {"Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gal", "Gal/Miles"};
		String [] col2 = new String[col.length];
		col2[0] = car1.getType();
		col2[1] = String.format("%.2f", car1.getStartMiles());
		col2[2] = String.format("%.2f", car1.getEndMiles());
		col2[3] = String.format("%.2f", car1.calcDistance());
		col2[4] = String.format("%.2f", car1.getGallons());
		col2[5] = String.format("%.2f", car1.calcMPG());
		col2[6] = String.format("%.3f", car1.calcGPM());
	
		for (int i = 0; i < col.length; i += 1) {
			System.out.printf("%-15s    %-5s\n", col[i], col2[i]);
		}

	}
}

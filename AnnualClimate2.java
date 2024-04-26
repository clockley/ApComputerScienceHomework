/**
 * Annual Climate description: calculate average temperature and annual precipitation.
 *
 * @author:Christian Lockley
 * @version:2
 *
 */

import java.util.Scanner;
class AnnualClimate2
{

   	public static void main (String [ ] args)
	{

		//Declare and intialize variables - programmer to provide initial values
		Scanner in = new Scanner(System.in);
		String city = "Jacksonville";
		String state = "Florida";

		String month [] ={"Jan", "Feb","Mar", "April", "May" , "June", "july","Aug", "Sep", "Oct", "Nov", "Dec"};
		double temperature [] ={53.1, 55.8, 61.6, 66.6, 73.4, 79.1, 81.6, 80.8, 77.8, 69.4, 61.7, 55.0}; 		//initialize with Fahrenheit values
		double precipitation [] ={3.7, 3.2, 3.9, 3.1, 3.5, 5.4,6.0,6.9,7.9,3.9,2.3,2.6}; 	//initialize with inches values
		
		/*
		String city = "Gainesville";
		String state = "Florida";
		double temperature [] ={54.3,57.0,62.5,67.6,74.3,79.2,80.9,80.4,77.8,70.1,62.8,56.3};
		double precipitation [] ={3.5,3.4,4.3,2.9,3.2,6.8,6.1,6.6,4.4,2.5,2.2,2.6};
		*/
		
		double atemp = 0;
		double aperc = 0;
		boolean fahrenheit = false;
		boolean inches = false;

		String tempLabel = "F"; 
		String precipLabel = "in";


		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = in.next();
		
		if ("f".equalsIgnoreCase(tempChoice)) {
			fahrenheit = true;
		}
		
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = in.next();
		
		if ("i".equalsIgnoreCase(precipChoice)) {
			inches = true;
		}

		if (inches == false) {
			for (int i = 0; i < precipitation.length; i +=1) {
					precipitation[i] *= 2.54;
			}
			precipLabel = "cm.";
		}

		if (fahrenheit == false) {
			for (int i = 0; i < temperature.length; i +=1) {
					temperature[i] = (((temperature[i] - 32)*5)/9);
			}
			tempLabel = "C";
		}

		System.out.println();
		System.out.println("Climate Data");
		System.out.println("Location: " + city +", " + state);
		System.out.printf("%5s %18s %s %18s %s\n","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		System.out.printf("***************************************************\n");

		for (int i = 0; i <= 11; i+=1) {
			System.out.printf("%s\t\t%.1f\t\t%.1f\n", month[i], temperature[i], precipitation[i]);
			atemp += temperature[i];
			aperc += precipitation[i];
			if (i == 11) {
				System.out.println("***************************************************");
				System.out.printf("%-5sAverage: %.1f\t\tAnnual: %.1f\n", " ", (atemp/12), aperc);
			}
		}

	}//end main
}//end Annual Climate

import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

/**
 * Write a description of class CarV7Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarV7Tester
{
    public static void main(String[] args)
    {
        CarV7 [] car1 = {new CarV7("03 Saturn Vue", 14373, 14731, 16.2, 2.98), new CarV7("03 Saturn Mars", 14373, 14731, 16.2, 2.98)};
        String [] col = {"Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gal", "Gal/Miles"};
   
        System.out.printf("%s%n%n", "Gas Mileage Calculations");
        
        for (int i = 0; i < car1.length; i += 1) {
               String [] col2 = new String[col.length];
               col2[0] = car1[i].getType();
               col2[1] = String.format("%.2f", car1[i].getStartMiles());
               col2[2] = String.format("%.2f", car1[i].getEndMiles());
               col2[3] = String.format("%.2f", car1[i].calcDistance());
               col2[4] = String.format("%.2f", car1[i].getGallons());
               col2[5] = String.format("%.2f", car1[i].calcMPG());
               col2[6] = String.format("%.3f", car1[i].calcGPM());
               for (int j = 0; j < col.length; j +=1) {
                   System.out.printf("%-15s    %-5s%n", col[j], col2[j]);
               }
               System.out.printf("%n");
        }
    }
}

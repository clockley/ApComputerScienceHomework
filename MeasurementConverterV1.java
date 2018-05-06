/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * �FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: (Christian Lockley)
 * Date: (9/1/14)
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double kilograms;
        double pounds = 0;
        double gallons = 0;
        double liters = 0;
        final double feetPerMile = 5280;      //number of feet per 1 mile
        final double feetPerYard = 3;         //number of feet per 1 yard
        final double milesPerKmeters = 1.609; //number of miles per kilometer
        final double kmetersPerMiles = 0.6214; //varibable name is missleading
        final double unitMultplierKilogramsToPounds = 2.2046 / 1; //unit multiplier
        final double unitMultplierPoundsToKilograms = 1 / 2.20461; //unit multiplier
        final double litersPerGallon = 3.785; //liters per gallon
        final double litersToGallonsUnitMultiplier = 0.26417;//unit multiplier
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable

        System.out.println("***************************************");
        System.out.println("     This program converts between");
        System.out.println("     selected units of measurement");
        System.out.println("***************************************");
        
        
        //convert feet to miles\\a
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");
        System.out.println();
        
        //convert miles to feet\\a
        double result = miles * feetPerMile;
        System.out.println(miles + " mi. = " + result + " ft. ");
        System.out.println();
        
        //convert miles  to kilometers\\b
        result = miles * milesPerKmeters;
        System.out.println(miles + " mi. = " + result + " km.");
        System.out.println();
        
        //kilometers to miles\\b
        System.out.print(result + " km. = ");
        result = miles * 0.6214;
        System.out.println(miles + " mi. ");
        System.out.println();

        //convert kilograms to pounds\\c
        kilograms = 1000;
        pounds = kilograms * unitMultplierKilogramsToPounds;
        System.out.println(kilograms + " kg. = "  + pounds + " lbs. ");
        System.out.println();
        
        //convert pounds to kilograms\\c
        kilograms = pounds * unitMultplierPoundsToKilograms;
        System.out.println(pounds + " lbs. = " + kilograms + " kg. ");
        System.out.println();
        
        //convert gallons to liters\\d
        gallons = 99;
        liters = gallons * litersPerGallon;
        System.out.println(gallons + " gal. = " + liters + " L. ");
        System.out.println();
        
        //convert liters to gallons\\d
        gallons = liters * litersToGallonsUnitMultiplier;
        System.out.println(liters + " L. = " + gallons + " gal. ");
        System.out.println();
        
        //convert feet to yards\\2
        double yards = feet / feetPerYard; //distance in yards
        System.out.println(feet + " ft. = " + yards + " yd." );
        System.out.println();
    }//end of main method
}//end of class


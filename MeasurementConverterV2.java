
/**
 * Write a program to convert between U.S and metric units using functions.
 * 
 * @author (Christian lockley) 
 * @version (11/24/14)
 */
public class MeasurementConverterV2
{
//Purpose of program
    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi)
    {
        return mi *1.60934;
    } 
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        return km * 0.621371;
    } 
    
    //convert pounds to kilograms
    //method header to convert pounds to kilograms goes here
    public static double poundsTokilograms(double a1){
        return a1 * 0.453592;
    } 
    
    //convert kilograms to pounds
    // method header to convert kilograms to pounds goes here
    public static double kilogramsToPounds(double a1){
         return a1 * 2.20462;
    } 
    
    public static double gallonsToLiters(double a1) {
        return a1 * 3.78541;
    }
    
    public static double litersToGallons(double a1) {
        return a1 * 0.264172;
    }
        
    public static void main(String[ ] args)
    {
        //local variables
        double miles, feet, inches, pounds, gallons;
        double kilometers, kilograms, liters;
                
        //variable declaration and initialization
    
        printPurpose();                                    //invoke the printPurpose() method
        feet = 6230;
        miles = convertFeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        System.out.printf("%8.1f km. = %7.1f mi.\n", kilometers, convertKilometersToMiles(kilometers));
        
        pounds = 204;
        kilograms = poundsTokilograms(pounds);
        System.out.printf("%8.1f lds. = %7.1f kg.\n", pounds, kilograms);
      
        kilograms = 196;
        System.out.printf("%8.1f kg. = %7.1f lbs.\n", kilograms, kilogramsToPounds(kilograms));
        
        gallons = 64;
        liters = gallonsToLiters(gallons);
        System.out.printf("%8.1f gl. = %7.1f li.\n", gallons, liters);
        
        liters = liters;
        System.out.printf("%8.1f li. = %7.2f gal.\n", liters, litersToGallons(liters)); 
    }//end of main method
    
}//end of class


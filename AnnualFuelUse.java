/**
 * Write a description of class AnnualFuelUse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class AnnualFuelUse
{
    private double myPricePerGallon;
    private double myGallonsUsed;
    private double myEndMiles;
    private double myStartMiles;
    private int myDay;

    public AnnualFuelUse(int day, double startMiles, double endMiles, double gallonsUsed, double pricePerGallon)
    {
        myDay = day;
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
    
    public int getDays() {
        return myDay;
    }
    
    public double getPrice() {
        return myPricePerGallon;
    }
}

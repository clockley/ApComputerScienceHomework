
/**
 * This program sets class variables to values given in default constructor.
 * 
 * @author (Christian Lockley) 
 * @version (12/24/14)
 */
public class CarV7
{
    private double myPricePerGallon;
    private double myGallonsUsed;
    private double myEndMiles;
    private double myStartMiles;
    private String myType;
    
    public CarV7(String type, double startMiles, double endMiles, double gallonsUsed, double pricePerGallon)
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
}

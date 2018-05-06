/**
 * @author (Christian Lockley) 
 * @version (12/29/14)
 */
public class CO2FootprintV1
{
    // instance variables - replace the example below with your own
    private double myGals;
    private double myTons;
    private double myPounds;

    /**
     * Constructor for CO2 object
     * @param gallons consumed
     */
    public CO2FootprintV1(double gals)
    {
        myGals = gals;
        myTons = 8.78 * Math.pow(10, -3) * gals;
        myPounds = myTons * 2000;
    }

    /**
     * Getter method to return tons of co2 emitted.
     * @return tons of CO2  
     */
    double getTons()
    {
        return myTons;
    }
    
    /**
     * getter method
     * @return CO2 emitted in pounds.
     */
    double getPounds()
    {
        return myPounds;
    }
    
    /**
     * getter method
     * @return value passed to constructor
     */
    double getGallons()
    {
        return myGals;
    }
}

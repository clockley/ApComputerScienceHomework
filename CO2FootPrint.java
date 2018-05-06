
/**
 * Write a description of class CO2FootPrint here.
 * 
 * @author (Christian Lockley) 
 * @version (1/12/14)
 */
public class CO2FootPrint
{
    // instance variables - replace the example below with your own
    private double myGasoline = 0,  myElectricity = 0, myPriceOfelectricity = 0;
    private int myPeople = 0, myBulbReduction = 0;
    private boolean recyclePlastic = false, recycleglass = false, recyclecans = false;

    private double grossCO2FootPrint = 0, netCO2FootPrint = 0;
    
    public CO2FootPrint(double gasoline, double electricity, double priceOfelectricity, int people, boolean paper, boolean plastic,
                        boolean glass, boolean cans, int bulbReduction)
    {
       myGasoline = gasoline;
       myElectricity = electricity;
       myPeople = people;
       recycleglass = glass;
       recyclePlastic = plastic;
       recyclecans = cans;
       myPriceOfelectricity = priceOfelectricity;
       myBulbReduction = bulbReduction;
    }
    
    double CO2ReductionFromBulbs()
    {
       return myBulbReduction * 1.37 * 73;
    }
    
    double CO2ReductionFromRecyclingGlass()
    {
        return 46.6 * myPeople;
    }
    
    double CO2ReductionFromRecyclingPaper()
    {
        return 184.0 * myPeople;
    }
    
    double CO2ReductionFromPlastic()
    {
        return  25.6 * myPeople;
    }
    
    double CO2FromGasoline()
    {
        return (2000*(8.78 * Math.pow(10, -3)) * myGasoline);
    }
    
    double CO2FromElectricity()
    {
        return (myElectricity / myPriceOfelectricity) * 1.37 * 12;
    }
    
    double CO2FromTrash()
    {
        return myPeople * 1018;
    }
    
    double CO2ReductionFromRecycling()
    {
        return CO2ReductionFromPlastic() + CO2ReductionFromRecyclingPaper() + CO2ReductionFromRecyclingGlass();
    }
    
    public double calcNetCO2() {
        return netCO2FootPrint = (CO2FromGasoline()+CO2FromElectricity()) - (CO2ReductionFromBulbs() + CO2ReductionFromPlastic() +
                           CO2ReductionFromRecyclingPaper() + CO2ReductionFromRecyclingGlass());
    }
}

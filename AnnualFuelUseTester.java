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
import java.util.ArrayList;

public class AnnualFuelUseTester
{
    
    static private double minDistance(ArrayList<AnnualFuelUse> l)
    {
        AnnualFuelUse tmp = l.get(0);
        double tmp2 = tmp.calcDistance();
        for (AnnualFuelUse i:l) {
            if (i.calcDistance() < tmp2) {
                tmp2 = i.calcDistance();
            }
        }
        return tmp2;
    }
    
    static private double maxDistance(ArrayList<AnnualFuelUse> l)
    {
        AnnualFuelUse tmp = l.get(0);
        double tmp2 = tmp.calcDistance();
        for (AnnualFuelUse i:l) {
            if (i.calcDistance() > tmp2) {
                tmp2 = i.calcDistance();
            }
        }
        return tmp2;
    }
    
    
    static private double maxMpg(ArrayList<AnnualFuelUse> l)
    {
        AnnualFuelUse tmp = l.get(0);
        double tmp2 = tmp.calcMPG();
        for (AnnualFuelUse i:l) {
            if (i.calcMPG() > tmp2) {
                tmp2 = i.calcMPG();
            }
        }
        return tmp2;
    }
    
    static private double minMpg(ArrayList<AnnualFuelUse> l)
    {
        AnnualFuelUse tmp = l.get(0);
        double tmp2 = tmp.calcMPG();
        for (AnnualFuelUse i:l) {
            if (i.calcMPG() < tmp2) {
                tmp2 = i.calcMPG();
            }
        }
        return tmp2;
    }
    
    
    static private double minPrice(ArrayList<AnnualFuelUse> l)
    {
        AnnualFuelUse tmp = l.get(0);
        double tmp2 = tmp.pricePerGallon();
        for (AnnualFuelUse i:l) {
            if (i.pricePerGallon() < tmp2) {
                tmp2 = i.pricePerGallon();
            }
        }
        return tmp2;
    }
    
    static private double maxPrice(ArrayList<AnnualFuelUse> l)
    {
        AnnualFuelUse tmp = l.get(0);
        double tmp2 = tmp.pricePerGallon();
        for (AnnualFuelUse i:l) {
            if (i.pricePerGallon() > tmp2) {
                tmp2 = i.pricePerGallon();
            }
        }
        return tmp2;
    }
    
   
    public static void main(String [] args) 
    {
        double totalCost = 0;
        double totalDistance = 0;
        double totalGallons = 0;
        double projectedCost = 0;
        double projectedDistance = 0;
        double projectedGallons = 0;
        double totalDays = 0;
        ArrayList<AnnualFuelUse> list = new ArrayList<AnnualFuelUse>();
        list.add(new AnnualFuelUse(1, 45023, 45231, 10, 2.95));
        list.add(new AnnualFuelUse(4, 45231,45480, 11.7, 2.99));
        list.add(new AnnualFuelUse(8, 45480, 45659, 9.3, 3.03));
        list.add(new AnnualFuelUse(13, 45659, 45961, 14.9, 3.01));
        
        
        System.out.printf(" %2s      %2s      %2s      %2s      %2s      %2s      %2s      %2s      %2s\n",
                          "Fill up", "Days", "Start Miles","End Miles", "Distance",
                          "Gallons Used", "MPG", "Price", "Cost");
 
        
        int fillup = 0;
        for(AnnualFuelUse i: list) {
            fillup += 1;
            totalGallons += i.getGallons();
            totalDistance += i.calcDistance();
            totalCost += i.totalCost();
            totalDays += i.getDays();
            System.out.printf("   %4d%11d%17.2f%15.2f%14.2f%18.2f%9.2f%11.2f%10.2f%n",fillup,i.getDays(),i.getStartMiles(),i.getEndMiles(),i.calcDistance(),i.getGallons(),i.calcMPG(),i.getPrice(),i.totalCost());
        }
        
        {
            projectedCost = (totalCost / list.size()) * 365;
            projectedDistance = (totalDistance / list.size()) * 365;
            projectedGallons = (totalGallons / list.size()) * 365;
        }
        
        System.out.printf("\nMinimun: %55s %26.2f %10.2f\n", minDistance(list), minMpg(list), minPrice(list));
        System.out.printf("Maximun: %55s %26.2f %10.2f\n", maxDistance(list), maxMpg(list), maxPrice(list));
        System.out.printf("\nTotals: %56.2f%18.2f%30.2f\n", totalDistance, totalGallons, totalCost);
        System.out.printf("Annual Projection: %45.2f%18.2f%9.2f%21.2f",projectedDistance, projectedGallons, projectedDistance/projectedGallons,projectedCost);
    }
}

/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * �CSA/FLVS 2014
 * @author Christian Lockley
 * @version 09/07/14
 */
import java.util.Scanner;
public class CurrencyConversionV2
{
    public static void main(String [ ] args)
    {
		Scanner in = new Scanner(System.in);
         // local variable for dollars spent in Mexico
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        //remaining variables below here

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.print("Starting dollars?: ");
        final double startingUsDollars = in.nextDouble();System.out.print("\n");
        
        remainingUsDollars = startingUsDollars;
        
        // convertion for Mexican pesos
        // code goes below here
               // local variable for US Dollars
        System.out.print("pesos spent?: ");
        double pesosSpent = in.nextDouble();System.out.print("\n");            // local variable for Mexican pesos spent
        
        System.out.print("peso exchange rate?: ");System.out.print("\n");
        double pesoExchangeRate = in.nextDouble();;     // local variable for exchange rate of US Dollars to Pesos
        double dollarsSpentInMexico = 0.0;   
        dollarsSpentInMexico = (pesosSpent / pesoExchangeRate);
        remainingUsDollars -= dollarsSpentInMexico;
        
        // convertion for Japanese yen
        // code goes below here
        System.out.print("yen spent?: ");
		double yenSpent = in.nextDouble();System.out.print("\n");

        System.out.print("yen exchange rate?: ");
        double yenExchangeRate = in.nextDouble();System.out.print("\n");
        
        double dollarsSpentInJapan = (yenSpent * yenExchangeRate);
        remainingUsDollars -= dollarsSpentInJapan;
        
        // convertion for Euros
        // code goes below here
        //http://www.exchangerate.com/currency-converter/EUR/USD/1/?XR-200Plus_Converter=convert&calc_short_from_iso=284&calc_short_to_iso=239
        System.out.print("euro spent?: ");
        double euroSpent = in.nextDouble();System.out.print("\n");

		System.out.print("euro exchange rate?: ");
        double euroExchangeRate = in.nextDouble();System.out.print("\n");
        double dollarsSpentInEuroLand = 624.95;   
        dollarsSpentInEuroLand = (euroSpent *  euroExchangeRate);
        remainingUsDollars -= dollarsSpentInEuroLand; 

        //print output to the screen
        // code goes below here
        System.out.println("Us dollars spent in Mexico:  " + dollarsSpentInMexico);
        System.out.println("Us dollars spent in Japan:   " + dollarsSpentInJapan);
        System.out.println("Us dollars spent in France:  " + dollarsSpentInEuroLand);

        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

        System.out.println("========================================================================");
        System.out.println("Remaining Us Dollars:" + "        " + remainingUsDollars);
        System.out.println("");
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        System.out.print("[SOUVENIR 01] cost: ");
        int costPerItem1 = in.nextInt();
        System.out.print("\n[SOUVENIR 01] budget: ");
        int budget1 = in.nextInt();                           //budget for first item
        int totalItem1 = 0;         //how many items can be purchased
        double fundsRemaining1 = 0.0;  //how much of the budget is left

        totalItem1 = budget1 / costPerItem1;
       /* 
        * fundsRemaining1 = budget1;
        * fundsRemaining1 -= (costPerItem1 * totalItem1);
        */
         
        fundsRemaining1 = budget1 % costPerItem1;
        
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costPerItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItem1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println("");
        
        //Calculations for Souvenir #2
        System.out.print("[SOUVENIR 02] cost: ");
        double costPerItem2 = in.nextDouble();                       //cost per item of second souvenir
        System.out.print("\n[SOUVENIR 02] budget: ");
        int budget2 = in.nextInt();                              //budget for second item
        int totalItem2 = 0;     //how many items can be purchased
        double fundsRemaining2 = 0.0;   //how much of the budget is left
        totalItem2 = (int)(budget2 / costPerItem2);
        fundsRemaining2 = budget2 % costPerItem2;     
        
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costPerItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItem2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class


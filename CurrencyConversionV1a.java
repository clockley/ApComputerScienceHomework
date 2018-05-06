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
public class CurrencyConversionV1a
{
    public static void main(String [ ] args)
    {
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
        final double startingUsDollars = 5000.00;
        remainingUsDollars = startingUsDollars;
        
        // convertion for Mexican pesos
        // code goes below here
               // local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double pesoExchangeRate = 13.09149;     // local variable for exchange rate of US Dollars to Pesos
        double dollarsSpentInMexico = 0.0;   
        dollarsSpentInMexico = (pesosSpent / pesoExchangeRate);
        remainingUsDollars -= dollarsSpentInMexico;
        
        // convertion for Japanese yen
        // code goes below here
        double yenSpent = 99939.75;
        double yenExchangeRate = 0.009505;
        double dollarsSpentInJapan = (yenSpent * yenExchangeRate);
        remainingUsDollars -= dollarsSpentInJapan;
        
        // convertion for Euros
        // code goes below here
        //http://www.exchangerate.com/currency-converter/EUR/USD/1/?XR-200Plus_Converter=convert&calc_short_from_iso=284&calc_short_to_iso=239
        double euroSpent = 624.95;
        double euroExchangeRate = 1.296660;
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
        int costPerItem1 = 4;                          //cost per item of first souvenir
        int budget1 = 50;                           //budget for first item
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
        double costPerItem2 = 32.55;                       //cost per item of second souvenir
        int budget2 = 713;                              //budget for second item
        int totalItem2 = 0;     //how many items can be purchased
        double fundsRemaining2 = 0.0;   //how much of the budget is left
        double tmp = budget2 / costPerItem2;
        totalItem2 = (int)tmp;
        fundsRemaining2 = budget2 % costPerItem2;     
        
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costPerItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItem2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class


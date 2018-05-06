/**
 * @purpose: Calculate yearly CO2 emissions from electricity (8.10)
 *
 * @author: Christian Lockley
 * @version: 12/31/14
 */
import java.util.ArrayList;
public class CO2FromElectricity

{
   CO2FromElectricity()
   {
   	//default constructor to be used
   }

   public double calcAverageBill(ArrayList<Double> monthlyBill)
   {
       double s = 0;
       for (Double i:monthlyBill) {
           s += i;
       }
       return s / monthlyBill.size();
   }

   public double calcAveragePrice (ArrayList<Double> monthlyPrice)
   {
       double s = 0;
       for (Double i:monthlyPrice) {
           s += i;
       }
       return s / monthlyPrice.size();
   }

   public double calcElectricityCO2 (double avgBill, double avgPrice)
   {
        return (avgBill / avgPrice) * 1.37 * 12;
   }
}


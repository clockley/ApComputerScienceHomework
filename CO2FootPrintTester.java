
/**
 * Write a description of class CO2FootPrintTester here.
 * 
 * @author (Christian Lockley) 
 * @version (1/12/14)
 */
import java.util.ArrayList;

public class CO2FootPrintTester
{
    public static void main(String[] args)
    {
        ArrayList<CO2FootPrint> list = new ArrayList<CO2FootPrint>();
        list.add(new CO2FootPrint(3500.00, 175.5, .50, 4, true, true, true, true, 5));
        list.add(new CO2FootPrint(3250.00, 225.00, .63, 5, true, true, true, false, 0));
        list.add(new CO2FootPrint(1500, 100, .50, 2, false, false, false, false, 0));
        list.add(new CO2FootPrint(6000, 250, .75, 6, true, true, true, true, 0));
        list.add(new CO2FootPrint(2400, 200.00,.50, 1, false, false, false, false, 2));
        int c = 0;
        String h[] = {"|               Pounds of CO2              |       Pounds of CO2         |                     |",
                    "|               Emitted from               |       Reduced from          |                     |",
                    "|     Gas    |  Electricity |   Waste   |  Recycling      |   New Bulbs  |    CO2 Footprint    |",
        };

        for (String i:h) {
            System.out.printf("%s\n", i);
            if (i.length() > c) {
                c = i.length();
            }
        }
        
        while (c != 0) {
            System.out.printf("=");
            c -= 1;
        }
        
        System.out.printf("\n");
        
        for(CO2FootPrint i: list) {
            i.calcNetCO2();
            System.out.printf("|  %10.2f|  %10.2f  |  %10.2f  |  %10.2f  |  %10.2f  |  %10.2f         |\n",
                              i.CO2FromGasoline(), i.CO2FromElectricity(),
                              i.CO2FromTrash(), i.CO2ReductionFromRecycling(), i.CO2ReductionFromBulbs(), i.calcNetCO2());
        }
    }
}

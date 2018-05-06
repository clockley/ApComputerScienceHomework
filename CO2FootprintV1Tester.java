/**
 * This class test the CO2 class.
 *
 * @author (Christian Lockley) 
 * @version (12/29/14)
 */
import java.*;

public class CO2FootprintV1Tester
{
    public static void main(String[] args)
    {
        CO2FootprintV1 tmp = new CO2FootprintV1(1288);
        String c[][] = {{"Gallons", "of Gas"},{"Pounds", "from Gas"},{"Tons","from Gas"}};
        String fmt ="%-10s";
        int len[] = {(c.length - 1)*3,(c.length - 1)*3};
        for (int i = 0; i < c.length; i+= 1) {
            System.out.printf(fmt, c[i][0]);
            len[0] += c[i][0].length();
        }
        System.out.println();
        for (int i = 0; i < c.length; i+= 1) {
            System.out.printf(fmt, c[i][1]);
            len[1] += c[i][1].length();
        }
        System.out.println();
        for (int i = (len[0]>len[1]?len[0]:len[1]); i != 0; i -= 1) {
            System.out.print("*");
        }
        fmt ="";
        for (int i = c.length; i != 0; i -=1) {
            fmt = fmt + "%-10.2f";
        }
        System.out.printf("%n"+fmt, tmp.getGallons(), tmp.getTons(),tmp.getPounds());
    }
}

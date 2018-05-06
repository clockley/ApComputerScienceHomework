/**
 * Catapult class tester
 * 
 * @author (Christian Lockley) 
 * @version (1/14/15)
 */
public class CatapultTester
{

    public static void main(String a[]) {
        System.out.print("MPH");
        for (int i = 25; i < 55; i +=5) {
            System.out.printf("      %ddeg", i);
        }
        System.out.printf("\n");
        for(int i = 80; i != 0; i -= 1) {
            System.out.print("=");
        }
        System.out.printf("\n");
        for (int m = 20; m < 55; m +=5) {
            System.out.printf("\n%d       ", m);
            for (int d = 25; d < 55; d +=5) {
               Catapult c = new Catapult(m, d);
               c.CalcCaptapult();
               System.out.printf("%-10.2f ", c.GetRange());
            }
            System.out.println();
        }
    }
}

/**
 * Calculate Basal metabolic rate.
 * 
 * @author (Christian Lockley) 
 * @version (8/10/14)
 */
import java.util.Scanner;
public class BMR
{   
    public static void main(String[ ] arg) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = in.next();
        name += in.nextLine();
        
        System.out.print("Gender (M or F): ");
        String gender = in.next();
        char pgender = gender.charAt(0);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("Enter yout height in inches: ");
        int inches = in.nextInt();
        System.out.print("Enter your weight in pounds: ");
        int pounds = in.nextInt();
        
        System.out.print("\nCalculate Your Basal Metabolism\n");
        System.out.print("\nName: "+name);
        System.out.print("\nGender: "+pgender);
        System.out.print("\nAge: "+age);
        int wik = ((int)((pounds * 0.453592) * 100)) / 100;
        int hic = ((int)((inches * 2.54) * 100)) / 100;
        System.out.print("\nWeight (kg): "+ wik);
        System.out.print("\nHeight (cm): "+hic);
        
        int bmr;
        boolean male = pgender == 'M';
        if (male) {
            bmr = (int)(66.4730 + (5.0033 * hic) + (13.7516 * wik) - (6.7550 * age));
        } else {
            bmr = (int)(655.0955 + (1.8496 * hic) + (9.5634 * wik) - (6.7550 * age));
        }
        System.out.print("\nBasal Metablolic Rate: "+bmr +" calories per day");
    }
}

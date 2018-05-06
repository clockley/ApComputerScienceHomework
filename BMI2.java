
/**
 * This program caculates the BMI based on user input.
 * 
 * @author (Christian Lockley) 
 * @version (8/10/14)
 */
import java.util.Scanner;
public class BMI2
{
    public static void main(String[ ] arg) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name (first last): ");
        String name = in.next();
        name += in.nextLine();
        
        System.out.print("Enter your weight in pounds (e,g 175): ");
        String sLbs = in.next();
        sLbs += in.nextLine();
        
        System.out.print("Enter your height in feet and inches (e,g 5 11): ");
        String height = in.next();
        height += in.nextLine();
        
        String sfeet = height.substring(0, height.indexOf(" "));
        String sinches = height.substring(height.indexOf(" "), height.length());
        //sinches=String Inches
        sinches = sinches.replace(" ", "");
 
        int inches = Integer.parseInt(sinches);
        int feet = Integer.parseInt(sfeet);
        inches += feet * 12;     
        double meters = inches * 0.0254;
        double weigth = Double.parseDouble(sLbs) * 0.453592;
        double bmi = weigth / (meters * meters);
        System.out.println("BMI: "+bmi);
        
        boolean underweight = bmi < 18.5;
        boolean normal = bmi <= 24.9;
        boolean overweight = bmi <= 29.9;
        boolean obese = bmi > 29.9;

        String cat = "";
                
        if (underweight) {
			cat = "Underweight";
		} else if (normal) {
			cat = "Normal";
		} else if (overweight) {
			cat = "overweight";
		} else if (obese) {
			cat = "obese";
		}
		
		System.out.println("\nBody Mass Index Calculator\n=========================");
        System.out.println("Name: "+name);
		System.out.println("Height (m): "+meters);
        System.out.println("weigth (kg) "+weigth);
		System.out.println("Category: "+cat);
    }
}

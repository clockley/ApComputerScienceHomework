/**
 * Program to calculate the Total Daily Energy Expenditure
 *
 * @Christian Lockley
 * @8/11/2014
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Input: Gather information from user
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Please enter your BMR:" );
        double basalMR = in.nextDouble();
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();
        System.out.println();

        // Activity Level Menu
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athelete, Heavy Manual Labor)");
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level: ");
        String choice = in.next();
        System.out.println();

        //Processing:
        // Activity Factor
        double activityFactor = 0;

        // ********************** fill in code here ******************//
        // Write code to assign value to activityFactor based
        // on the user's input for Gender and Activity Level
        // **********************************************************//


		if ("f".equalsIgnoreCase(gender) || "m".equalsIgnoreCase(gender)) {
			if ("A".equalsIgnoreCase(choice)) {
				activityFactor = 1.0;
			}
        
			if ("B".equalsIgnoreCase(choice)) {
				activityFactor = 1.3;
			}
		}
        
        if ("C".equalsIgnoreCase(choice) && "f".equalsIgnoreCase(gender)) {
			activityFactor = 1.5;
        } else {
			activityFactor = 1.6;
		}
        
        if ("D".equalsIgnoreCase(choice) && "m".equalsIgnoreCase(gender)) {
			activityFactor = 1.7;
        } else {
			activityFactor = 1.6;
		}
        
        if ("E".equalsIgnoreCase(choice) && "f".equalsIgnoreCase(gender)) {
			activityFactor = 1.9;	
        } else {
			activityFactor = 2.1;
		}
		
        if ("E".equalsIgnoreCase(choice) && "m".equalsIgnoreCase(gender))
        {
			activityFactor = 2.4;
        } else {
			activityFactor = 2.2;	
		}

        // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        if (tDEE != 0) {
			System.out.println("Name: " + name + "\t\tGender: " + gender);
			System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
			System.out.println("TDEE: " + tDEE + " calories ");
		} else {
			System.out.println(choice+" is not a valid menu option.");
		}

    }
}

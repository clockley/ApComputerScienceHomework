/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @Christian lockley  
 * @8/10/2014
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        // provide menu item for BMR
        // provide menu item for Healthy Eating
        // provide menu item for Food Pyramid
        // provide menu item for Fitness Training
        // prompt user to enter A, B, C, D, or E: ");
        // accept user choice with a Scanner class method
        
        System.out.println("Select a letter that corresponds to a menu option");
        System.out.println("[A] BMR");
        System.out.println("[B] Healthy Eating");
        System.out.println("[C] Food Pyramid");
        System.out.println("[D] Fitness Training");
        System.out.println("[E] Remainder");
        System.out.print("Enter A, B, C, D or E: ");
        String choice = in.next();
        System.out.println();
        
        System.out.println();
        
        if( choice.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            System.out.println("Testing: You chose A for BMI");
        }
        else if(choice.equalsIgnoreCase("B") ) //condition for choice B goes in the parentheses
        {
            System.out.println("B");
        }
        else if (choice.equalsIgnoreCase("C")) //condition for choice C goes in the parentheses
        {
            System.out.println("C");
        }
        else if (choice.equalsIgnoreCase("D")) //condition for choice D goes in the parentheses
        {
            System.out.println("D");
        }
        else if (choice.equalsIgnoreCase("E")) //condition for choice E goes in the parentheses
        {
            System.out.println("E");
        }
        else //default choice for an invalid entry
        {
            System.out.println("invalid entry");
        }
    }
}

/**
 * This program calculates fines on overdue books and prints a message
 * that can be copied into an email.
 * 
 * @author (Christian Lcokley) 
 * @version (9/22/14)
 */
import java.util.Scanner;
public class Fines
{
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name(Last, First) and Social Security Number (###-##-####:) Tyree, Peter 555-00-1234");
        String info = in.nextLine();

        String lastName = info.substring(0, info.indexOf(","));

        String firstName =  info.substring(info.indexOf(","));
        firstName =  info.substring(info.indexOf(" "), info.lastIndexOf(" "));
        firstName =  firstName.substring(firstName.indexOf(" ") + 1);
        String sn =  info.substring(info.lastIndexOf(" "));
        sn =  sn.substring(sn.indexOf(" ") + 1);

		System.out.print("Enter the title of the book: ");
		String title = in.nextLine();
		System.out.println();
		
		System.out.print("Enter the date checked out (mm/dd/yy): ");
		String date = in.nextLine();
		System.out.println();
		
		System.out.print("Days late: ");
		String late = in.nextLine();
		System.out.println();
		
		System.out.print("Daliy fine: ");
		String dalyFine = in.nextLine();
		System.out.println();

		System.out.println("To: " + lastName + ", " + firstName + "\t\t Account: " + lastName + firstName + sn.substring(sn.lastIndexOf("-")));
		System.out.println("From: Mona:\nSubject: Overdue Notice");
		System.out.println("============================================");
		System.out.println("This book is currently " + late + "days late");
		System.out.println("your fine has accumulated to: " + Double.parseDouble(dalyFine) * Double.parseDouble(late));
    }
}

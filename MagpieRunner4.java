import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Christian Lockley
 * @version May 28, 2015
 */
public class MagpieRunner4
{
    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Magpie4 maggie = new Magpie4();
        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement;
        try {
            statement = in.nextLine();
        } catch (java.util.NoSuchElementException e){
            return;
        }
        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            try {
                statement = in.nextLine();
            } catch (java.util.NoSuchElementException e){
                return;
            }
        }
    }
}
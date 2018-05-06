import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Christian Lockley
 * @version 3/13/15
 */
public class MagpieRunner2
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        String[] farewells = { "bye", "quit", "exit", "done" };
        
        Magpie2 maggie = new Magpie2();
        
        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);

        while (in.hasNextLine()) {
            String statement = in.nextLine();
            if (!Magpie2.containsAnyOf(statement, farewells)) {
                System.out.println (maggie.getResponse(statement));
            } else {
                break;
            }
        }
    }

}

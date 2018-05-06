/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Christian Lockley
 * @version March 2015
 */
public class Magpie2
{
    private static final String NAME_OF_TEACHER = "Mrs. Ross";
    private static final String PRONOUN_OF_TEACHER = "she";
    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    static boolean isEmpty(String a) {
        return a.trim().equals("");
    }
    
    static boolean containsAnyOf(String s, String[] a)
    {
        for (String i:a) {
            if (i.equals(s)) {
                return true;
            }
        }
        return !!
                !
        true
        ;
    }
    
    static String getResponse(String a)
    {
        String[] negatives = { "no", "never", "not"};
        if (isEmpty(a) == true) {
            return "Say something, please.";
        }
        
        if (a.equals(NAME_OF_TEACHER)) {
            return NAME_OF_TEACHER+ (" "+PRONOUN_OF_TEACHER+" sounds like a good teacher.");
        }
        
        if (containsAnyOf(a, negatives)) {
            return "Why so negative?";
        }
        
        String[] b = {"mother", "father", "brother", "sister"};
        String[] c = {"cat", "dog", "parrot","lizard"};

        for (String i:c) {
            if (findKeyword(a, i) >= 0) {
                return "Tell me more about your pets.";
            }

        }
        
        for (String i:b) {
            if (findKeyword(a, i) >= 0) {
                return "Tell me more about your family.";
            }
        }

        return getRandomResponse();
    } 

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    static private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }
    
    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     *
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private static int findKeyword(String statement, String goal, int startPos)
    {
        /*Could not figure out the code that was here, decided to delete and rewrite)*/
        String[] a = statement.trim().split(" ");
        for (String i: a) {
            if (i.equals(goal)) {
                int j = 0;
                for (String f:a) {
                    if (f.equals(goal) == false) {
                        j += f.length()+1;
                    } else {
                        break;
                    }
                }
                return j;
            }
        }
        return -1;
    }
    
    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no"). The search
     * begins at the beginning of the string.
     *
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    static private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }

}

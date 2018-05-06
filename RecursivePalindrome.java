/**
 * Write a description of class RecursivePalindrom here.
 * 
 * @author (Christian Lockley) 
 * @version (2/3/15)
 */
public class RecursivePalindrome
{
    private String w;
    RecursivePalindrome(String arg)
    {
        w = arg;
    }
    
    private void helper()
    {
        w = w.toLowerCase();
    }
           
    boolean IsPalindrome()
    {
        helper();
        if (w.length() <= 1) {
            return true;
        }
        if (w.substring(0, 1).equals(w.substring(w.length() - 1))) {
            w = w.substring(1, w.length() - 1);
            IsPalindrome();
        } else {
            return false;
        }
        return true;
    }
}
/**
 * Write a description of class RecursivePalindromTester here.
 * 
 * @author (Christian Lockley) 
 * @version (2/3/15)
 */
import java.util.*;
public class RecursivePalindromeTester
{
    public static void main(String[] argv) {
      Scanner in = new Scanner(System.in);
      System.out.printf("Press enter or Ctrl+d to exit\n");
      System.out.printf("Enter word\n");
      String input;
      if (in.hasNextLine() == false) {
          return;
      }
      input = in.nextLine();
      while ("".equals(input) == false) {
            RecursivePalindrome palin = new RecursivePalindrome(input);
            String sbool = "is a";
            if (palin.IsPalindrome() == false) {
                sbool = "is not a";
            }
            System.out.printf("%s %s palindrome\n", input, sbool);
            if (in.hasNextLine() == false) {
                break;
            }
            input = in.nextLine();
      }
    }
}

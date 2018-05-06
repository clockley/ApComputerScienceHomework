/**
 * The purpose of this program is to
 * calculate the average grade each time a new score is added to the total,
 * add the the total points earned and
 * print the average score after each test is graded and the total points earned.
 * 
 * ©FLVS 2014
 * @author Christian Lockley 
 * @version 9/3/14
 */
public class GradesV2
{
    public static void main(String[ ] args)
    {
        //local variables
        int numTests = 0; //counts number of tests
        int testGrade = 0; //individual test grade
        int totalPoints = 0; //total points for all tests
        double average = 0.0; //average grade
               
        //calculate total ticket sales at the game
        testGrade = 97; //Test score
        totalPoints += testGrade;
        numTests++;
        System.out.println("n  = " + numTests + " New Test Grade: " + testGrade +  " Total Points:  " + totalPoints + "    Average Score: " + (double) totalPoints / numTests);
       
        testGrade = 79;
        totalPoints += testGrade;
        numTests++;
        System.out.println("n  = " + numTests + " New Test Grade: " + testGrade +  " Total Points: " + totalPoints + "    Average Score: " + (double) totalPoints / numTests);
        
        testGrade = 83;
        totalPoints += testGrade;
        numTests++;
        System.out.println("n  = " + numTests + " New Test Grade: " + testGrade +  " Total Points: " + totalPoints + "    Average Score: " + (double) totalPoints / numTests);
        
        testGrade = 88;
        totalPoints += testGrade;
        numTests++;
        System.out.println("n  = " + numTests + " New Test Grade: " + testGrade +  " Total Points: " + totalPoints + "    Average Score: " + (double) totalPoints / numTests);
        
        testGrade = 82;
        totalPoints += testGrade;
        numTests++;
        System.out.println("n  = " + numTests + " New Test Grade: " + testGrade +  " Total Points: " + totalPoints + "    Average Score: " + (double) totalPoints / numTests);
        
        testGrade = 84;
        totalPoints += testGrade;
        numTests++;
        System.out.println("n  = " + numTests + " New Test Grade: " + testGrade +  " Total Points: " + totalPoints + "    Average Score: " + (double) totalPoints / numTests);
        
        testGrade = 95;
        totalPoints += testGrade;
        numTests++;
        System.out.println("n  = " + numTests + " New Test Grade: " + testGrade +  " Total Points: " + totalPoints + "    Average Score: " + (double) totalPoints / numTests);
        
        testGrade = 89;
        totalPoints += testGrade;
        numTests++;
        System.out.println("n  = " + numTests + " New Test Grade: " + testGrade +  " Total Points: " + totalPoints + "    Average Score: " + (double) totalPoints / numTests);
    }//end of main method
}//end of class
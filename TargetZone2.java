
/**
 * Determine Your Target Heart Rate Zone for Cardovascular Exercise.
 * 
 * @author (Christian Lockley) 
 * @version (8/10/14)
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
        int age = 0;int restingHeartRate = 0;
        int maximumHeartRate = 220;int heartRateAfterExerciseing = 0;
        int heartRateReserve = 0;String tmp = "";
        Scanner in = new Scanner(System.in);
        
        System.out.println("Determine Your Target Heart Rate Zone for Cardovascular Exercise (50% = 85%)");
        
        System.out.print("Enter your age: ");
        tmp = in.next();
        tmp += in.nextLine();
        age = Integer.parseInt(tmp);
        
        System.out.print("Enter your resting heart rate: ");
        tmp = in.next();
        tmp += in.nextLine();
        restingHeartRate = Integer.parseInt(tmp);
        
        System.out.print("Enter your heart after exerciseing: ");
        tmp = in.next();
        tmp += in.nextLine();
        heartRateAfterExerciseing = Integer.parseInt(tmp);
        
        maximumHeartRate -= age;
        heartRateReserve = maximumHeartRate - restingHeartRate;
        
        int low = (int)(heartRateReserve *.50) + restingHeartRate;
        int high = (int)(heartRateReserve *.85) + restingHeartRate;

        System.out.println("Your heart rate target zone is between " + low +" and " + high);
        
        boolean expr = heartRateAfterExerciseing <= high && heartRateAfterExerciseing >= low;
        
        if (expr) {
			System.out.println("After exercising, your heart rate is within your target zone.");
		} else {
			if (heartRateAfterExerciseing < low) {
				System.out.println("After exercising, your heart rate is below your target zone.");
			} else {
				System.out.println("After exercising, your heart rate is above your target zone.");
			}
		}
		
    }
}

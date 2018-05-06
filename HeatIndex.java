/**
 * The purpose of this program is to demonstrate how to write information to
 * a text file on the hard disk.
 * 
 * @author Christian Lockley
 * @version 11/11/14
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

public class HeatIndex
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
		//Thread.sleep(2500);//delay to resize window
		String [] months = {"January", "February", "March", "April",
			"May", "June", "July", "August", "September", "October",
			"Novermber", "December"};
		String location = "Key West, Florida";
		String pathName = "output.txt";
		Scanner KeyWestTemp = new Scanner(new File("KeyWestTemp.txt"));
		Scanner KeyWestHumid = new Scanner(new File("KeyWestHumid.txt"));
		PrintWriter outFile = new PrintWriter(new File(pathName));
		double avg = 0;
		final int len = months.length;
		int l = 0;	
		double [] t = new double[len];
		int [] h = new int[len];
		

        System.out.printf("     Heat Index: %15s \n ", location);
        System.out.println("");
        System.out.print("        ");

        outFile.printf("     Heat Index: %15s \n ", location);
        outFile.println("");
        outFile.print("        ");

		for (String month:months) {
			System.out.printf("     %3.3s",month);
			outFile.printf("     %3.3s",month);
		}
		
        System.out.println("   Avg");
        outFile.println("   Avg");
		for(int i = 180; i != 0; i -= 1,System.out.printf("*"));		
		System.out.println();
        System.out.print("Temp (F)    ");
		outFile.println();
        outFile.print("Temp (F)    ");
		for (int i = 0; KeyWestTemp.hasNextDouble() == true; i += 1) {
			double tmp = KeyWestTemp.nextDouble();
			avg += tmp;
			t[i] = tmp;
			System.out.printf("%s    ", tmp);
			outFile.printf("%s    ", tmp);
		}
		KeyWestTemp.close();
		System.out.printf("%.1f\n", (double)avg/len);
		outFile.printf("%.1f\n", (double)avg/len);
		
		avg = 0;
        System.out.print("Humidity    ");
        outFile.print("Humidity    ");
		for (int i = 0; KeyWestHumid.hasNextInt() == true; i +=1) {
			int tmp = KeyWestHumid.nextInt();
			avg += tmp;
			h[i] = tmp;
			System.out.printf("%3d%%    ", tmp);
			outFile.printf("%3d%%    ", tmp);
		}
		
		KeyWestHumid.close();
		System.out.printf("%d%%    \n", (int)avg/len);
		outFile.printf("%d%%    \n", (int)avg/len);

		avg = 0;
		System.out.print("HI (F)      ");
		outFile.print("HI (F)      ");
		for (int i = 0; i <= 11; i +=1) {
			double tmp;
			if (t[i] >= 80.0) {
				tmp = -42.379 + 2.04901523*t[i] + 10.14333127*h[i] -
				.22475541*t[i]*h[i] - .00683783*t[i]*t[i]
				- .05481717*h[i]*h[i] + .00122874*t[i]*t[i]*h[i] +
				.00085282*t[i]*h[i]*h[i] - .00000199*t[i]*t[i]*h[i]*h[i];
			} else {
				tmp = t[i];
			}
			avg += tmp;
			System.out.printf("%.1f    ", tmp);
			outFile.printf("%.1f    ", tmp);
		}
		
		System.out.printf("%.1f\n", (double)avg/len);
		outFile.printf("%.1f\n", (double)avg/len);
		outFile.close();
    }
}

/*This program calculates the percentage of families with all boys, all girls and one boy/one girl
 * Christian Lockley
 * 10/14/14
 * */
 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family
{
   public static void main(String[] args) throws IOException
   {
      String token = "";
      int g, b, obog, sampleSize;
      sampleSize = obog = g = b = 0;
      File fileName = new File("MaleFemaleInFamily.txt");
      Scanner inFile = new Scanner(fileName);
      System.out.print("Please wait...");
      while (inFile.hasNextLine())
      {
         token = inFile.nextLine( );
         if (!"".equals(token)) {
			sampleSize += 1;
		}
		if ("BG".equals(token) || "GB".equals(token)) {
			obog+=1;
		} else if ("GG".equals(token)) {
			g+=1;
		} else {
			b+=1;
		}
      }
      inFile.close();
      
      System.out.println("\rSample size: "+sampleSize+"\nTwo Boys: "
						+((int)((b*100.00/sampleSize)*100)/100.0)+
						"\nTwo Girls: "+
						((int)((g*100.00/sampleSize)*100)/100.0)+
						"\nOne Boy One Girl: "+
						((int)((obog*100.00/sampleSize)*100)/100.0));
    }
}

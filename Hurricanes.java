/**
 * This program reads hurricane info from a file and determines the category.
 * 
 * @author Christian Lockley
 * @version 11/12/14
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

public class Hurricanes
{
    public static void main(String[] args) throws IOException
    {
        Scanner hurricaneFile = new Scanner(new File("hurcdata2.txt"));
        String outFilePathName = "outfile.txt";
        int len;
        for (len = 0; hurricaneFile.hasNextLine() == true; len += 1) {
            hurricaneFile.nextLine();
        }
        hurricaneFile.close();
        Scanner hurricaneFile2 = new Scanner(new File("hurcdata2.txt"));
        int [] year = new int[len];
        String [] m = new String[len];
        int [] pressure = new int[len];
        int [] category = new int[len];
        double [] speed = new double[len];
        String [] name = new String[len];
        String col[] = {"Year", "Hurricane","Category","Pressure (mb)", "Wind Speed (mph)"};
        double minSpeed = 0;
        double maxSpeed = 0;
        int minPressure = 0;
        int maxPressure = 0;
        int minCategory = 0;
        int maxCategory = 0;
        int minYear = 0;
        int maxYear = 0;
        int averageCategory = 0;
        double averageSpeed = 0;
        int averagePressure = 0;
        PrintWriter outFile = new PrintWriter(new File(outFilePathName));

        for (int i = 0; hurricaneFile2.hasNextLine() == true; i += 1) {
            String line = hurricaneFile2.nextLine();
            line = line.replaceAll("  ", " ");
            line = line.replaceAll("\t", " ");
            line = line.replaceFirst(" ", ",");
            line = line.replaceFirst(" ", "!");
            line = line.replaceFirst(" ", "#");
            line = line.replaceFirst(" ", "+");
            year[i] = Integer.parseInt(line.substring(0, line.indexOf(",")));
            m[i] = line.substring(line.indexOf(",")+1, line.indexOf("!"));
            pressure[i] = Integer.parseInt(line.substring(line.indexOf("!")+1, line.indexOf("#")));
            speed[i] =  Double.parseDouble(line.substring(line.indexOf("#")+1, line.indexOf("+"))) * 1.15078;
            name[i] = line.substring(line.indexOf("+")+1);
        }
        hurricaneFile2.close();
        for (int i = 0; i < len; i +=1) {
            if (speed[i] >= 74 && speed[i] <= 95) {
                category[i] = 1;
            } else if (speed[i] >= 96 && speed[i] <= 110) {
                category[i] = 2;
            } else if (speed[i] >= 111 && speed[i] <= 129) {
                category[i] = 3;
            } else if (speed[i] >= 130 && speed[i] <= 156) {
                category[i] = 4;
            } else {
                category[i] = 5;
            }
        }

        minSpeed = speed[0];
        for (double minWindSpeed:speed) {
            if (minSpeed > minWindSpeed) {
                minSpeed = minWindSpeed;
            }
        }

        maxSpeed = speed[0];
        for (double maxWindSpeed:speed) {
            if (maxSpeed < maxWindSpeed) {
                maxSpeed = maxWindSpeed;
            }
        }

        minPressure = pressure[0];
        for (int i:pressure) {
            if (minPressure > i) {
                minPressure = i;
            }
        }
        
        maxPressure = pressure[0];
        for (int i:pressure) {
            if (maxPressure < i) {
                maxPressure = i;
            }
        }
        
        minCategory = category[0];
        for (int i:category) {
            if (minCategory > i) {
                minCategory = i;
            }
        }
        
        maxCategory = category[0];
        for (int i:category) {
            if (maxCategory < i) {
                maxCategory = i;
            }
        }
        
        minYear = year[0];
        for (int i:year) {
            if (minYear > i) {
                minYear = i;
            }
        }
        
        maxYear = year[0];
        for (int i:year) {
            if (maxYear < i) {
                maxYear = i;
            }
        }
        
        for (int i:category) {
            averageCategory += i;
        }
        
        averageCategory = averageCategory / len;
        
        for (int i:pressure) {
            averagePressure += i;
        }
        
        averagePressure = averagePressure / len;
        
        for (double i:speed) {
            averageSpeed += i;
        }
        
        averageSpeed = averageSpeed / (len)+.0;
        
        for (int i = 20; i != 0; i -=1) {
            System.out.printf(" ");
        }
        
        System.out.printf("Hurricanes %d-%d\n", minYear,maxYear);
        
        for (String tmp:col) {
            System.out.printf("%s    ", tmp);
        }
        
        System.out.printf("\n");
        
        for (int i = 79; i != 0; i -=1) {
            System.out.printf("=");
        }
        
        System.out.printf("\n");
        
        for (int i = 0; i < len; i +=1) {
            System.out.printf("%6d   %-9s   %-5d %9d %19.2f\n", year[i], name[i], category[i], pressure[i], speed[i] );
        }

        for (int i = 79; i != 0; i -=1) {
           System.out.printf("=");
        }

        outFile.printf("\n  Average %12d %13d %19.2f\n",averageCategory, averagePressure, averageSpeed);
        outFile.printf("  Maximum %12d %13d %19.2f\n",maxCategory, maxPressure, maxSpeed);
        outFile.printf("  Minimum %12d %13d %19.2f\n\n",minCategory, minPressure, minSpeed);
        
        for (int i = 1; i <= 5; i+= 1) {
            int k = 0;
            for (int j:category) {
                if (j == i) {
                    k += 1;
                }
            }
            outFile.printf("Number of Category %d: %d\n", i, k);
        }
        outFile.close();
        
        Scanner inFile = new Scanner(new File(outFilePathName));
        while (inFile.hasNextLine()) {
            System.out.println(inFile.nextLine());
		}
    }
}

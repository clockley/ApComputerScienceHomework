/**
 * Write a description of class FrequencyAnalysis here.
 * 
 * @author (Christian Lockley) 
 * @version (3/18/14)
 */
import java.util.*;
import java.io.*;
import java.lang.*;

public class FrequencyAnalysis
{
    private String filename;
    private Scanner file;
    long [] n;
    long t;
    
    public FrequencyAnalysis(String filename)
    {
		n = new long[128];
        long t = 0;
        this.filename = filename;
    }
    
    void OpenFile() throws IOException
    {
        file = new Scanner(new File(filename));
    }
    
    void closeFile()
    {
        file.close();
    }
  /*
   *     void readFile()
    {
        while (file.hasNext()) {
            String tmp = file.next();
            for (int i = tmp.length() - 1; i != 0; i -= 1) {
                t += 1;
                if (asciiToArrayNum(tmp, i) <= 57 && asciiToArrayNum(tmp, i) >= 90) {
                    System.out.println(n[asciiToArrayNum(tmp, i) - 23]);
                    n[asciiToArrayNum(tmp, i) - 23] += 1;
                } else if (asciiToArrayNum(tmp, i) <= 65 && asciiToArrayNum(tmp, i) >= 90) {
                    System.out.println(n[asciiToArrayNum(tmp, i) - 65]);
                    n[asciiToArrayNum(tmp, i) - 65] += 1;
                } else {
                    System.out.println(asciiToArrayNum(tmp, i) + 37);
                    n[asciiToArrayNum(tmp, i) + 37] += 1;
                }
               
            }
        }
    }
   */
  
    void readFile()
    {
     
        while (file.hasNext()) {
            String tmp = file.next();
            for (int i = tmp.length() - 1; i != 0; i -= 1) {
                t += 1;
                n[toArrayNum(tmp, i)] += 1;
            }
        }
    }
    
    private static int toArrayNum(String a, int o)
    {
        return a.toUpperCase().charAt(o);
    }

    public void analyze()
    {
        PrintWriter out = null;
        try {
			out = new PrintWriter(new File("subsetfreq.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.printf("%s\n", "Can't create file");
		}
        int j = 0;
        for (int i = 0; i < n.length; i += 1) {
            if (n[i] == 0) {
                continue;
            }
            System.out.printf("%4d %-8c  %8.2f\n", n[i], (char)i, (double)(((double)n[i] / (double)t)*100.0));
            out.printf("%4d %-8c  %8.2f\n", n[i], (char)i, (double)(((double)n[i] / (double)t)*100.0));
        }
        out.close();
    }
    
}

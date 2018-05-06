
/**
 * Write a description of class FrequencyAnalysisTester here.
 * 
 * @author (Christian Lockley) 
 * @version (3/18/14)
 */
import java.util.*;
import java.io.*;
public class FrequencyAnalysisTester
{
    public static void main(String[] arg) throws IOException {
        FrequencyAnalysis nobj = new FrequencyAnalysis ("ciphertext.txt");
        nobj.OpenFile();
        nobj.readFile();
        nobj.analyze();
    }
}

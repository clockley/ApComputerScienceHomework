/**
 * Write a description of class Morse here.
 * 
 * @author (Christian Lockley) 
 * @version (2/21/15)
 */
import java.util.*;
import java.io.*;

public class Morse
{
    public static String[] StringToStringArray(String a)
    {
        String[] array = new String[a.length()+1];
        
        for (int c = 0,i = 0; i <= a.length();i+=1) {
            array[c++] = a.substring(i==0?0:i-1, i);
        }
        return array;
    }

    public static void main(String[] args) throws IOException
    {
        MorseCode mc = new MorseCode("/home/christian/morsecode.txt");
        Scanner in = new Scanner(System.in);
        mc.OpenFile();
        mc.readFile();
        mc.closeFile();

        while (in.hasNextLine() == true) {
            mc.readInChar(StringToStringArray(in.nextLine()));
        }

        return;
    }
}

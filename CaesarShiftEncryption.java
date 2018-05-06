/*Christian Lockley 3/3/15*/
import java.io.*;
import java.util.*;

public class CaesarShiftEncryption
{
    static final String [] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static void PrintCipherAlphabet(int a) {
        String[] tmp = new String [26];
        for (int j = 0, i = a; i < alphabet.length; i+=1) {
            tmp[j++] = alphabet[i];
        }
        for (int j = a - 1, i = 0; i < a; i+=1)  {
            tmp[25 - i] = alphabet[j--];
        }
        for (String q:alphabet) {
            System.out.print(q);
        }
        System.out.println();
        for (String q:tmp) {
            System.out.print(q);
        }
        System.out.println();
    }

    static public int GetLetterNumber(String a)
    {
        return a.toUpperCase().charAt(0) - 65;
    }

    public static int Encrypt(String c, int s) {
        int l = GetLetterNumber(c) + s;
        if (l <= 25) {
            return l;
        }       
        int x = 0;
        while (l > 26) {
            x +=1;
            l -=1;
        }
        if (l > 25) {
            return x;
        }   
        return l;
    }

    public static int Decrypt(String c, int s) {
        int l = GetLetterNumber(c) - s;
        if (l <= 25) {
            if (l < 0) {
                return 26 + l;
            }
            return l;
        }
        int j = 0;
        while (l < 0) {
            l += 1;
            j += 1;
        }
        return j;
    }
}
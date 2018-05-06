/*Christian Lockley 3/3/15*/
import java.io.*;
import java.util.*;

public class CaesarShiftTester
{
    public static void main (String[] args) {
       Scanner in = new Scanner(System.in);
       int s;
       do {
           System.out.printf("Enter shift value: [0-25]:");
           s = in.nextInt();
       } while (s < 0|| s > 25);

       System.out.println("Enter 1 to encryt, 0 to decrypt");
       int e = in.nextInt();

       CaesarShiftEncryption.PrintCipherAlphabet(s);

       while (in.hasNextLine()) {
           String t = in.nextLine();
           String[] u = new String[t.length()+1];
           for (int i = 0; i < t.length() + 1; i += 1) {
               u[i] = t.substring(i == 0 ? 0 : i - 1, i);
           }
           String q ="", r = "";
           for (int i = 0; i < u.length; i += 1) {
               if (u[i].equals("")) {
                   continue;
               }
               if (u[i].equals(" ")) {
                   r+= " ";
                   continue;
               }                          
r+=e==1?CaesarShiftEncryption.alphabet[CaesarShiftEncryption.Encrypt(u[i],s)]:CaesarShiftEncryption.alphabet[CaesarShiftEncryption.Decrypt(u[i],s)];
           }
           System.out.printf("%s\n", r);
       }
    }
}
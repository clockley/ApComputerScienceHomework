
import java.security.SecureRandom;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

class Password
{
   public static void main (String [ ] args) throws IOException
   {   
	   Random randNum = new SecureRandom();
	   Scanner in = new Scanner(System.in);
	   System.out.println("Password Creator menu");
	   
	   System.out.println("[1] Lower Case only");
	   System.out.println("[2] Upper Case only");
	   System.out.println("[3] Upper and Lower case");
	   System.out.println("[4] Uppercase, Lowercase and Numbers and Punctuation");
	   int chioce = in.nextInt();
	   
	   System.out.print("Password length: ");
	   int len = in.nextInt();
	   String password = "";
	   
	   while (len != 0) {
		   if (chioce == 1) {
			   int tmp = randNum.nextInt(122) + 1;
			   while (tmp < 97) {
				   tmp = randNum.nextInt(122) + 1;
			   }
			    password += (char)tmp;
			    len -= 1;
		   }
		   if (chioce == 2) {
			   int tmp = randNum.nextInt(90) + 1;
			   while (tmp < 65) {
				   tmp = randNum.nextInt(90) + 1;
			   }
			   password += (char)tmp;
			   len -= 1;   
		   }
		   if (chioce == 3) {
			   int tmp = randNum.nextInt(122) + 1;
			   while (tmp < 65 && tmp != 91 || (tmp >= 91 && tmp <= 96)) {
				   tmp = randNum.nextInt(122) + 1;
			   }
			   password += (char)tmp;
			   len -= 1;   
		   }
		   if (chioce == 4) {
			   int tmp = randNum.nextInt(126) + 1;
			   while (tmp < 32) {
				   tmp = randNum.nextInt(126) + 1;
			   }
			   password += (char)tmp;
			   len -= 1;   
		   }
	   }
	   System.out.println(password);
   }
}

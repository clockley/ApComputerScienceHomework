/**
 * This program replaces phrases with abbreviations.
 * 
 * @author (Christian Lockley) 
 * @version (9/14/14)
 */

import java.util.Scanner;
public class TextMessageV2
{
    public static void main(String[ ] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter text message");
        String message = in.next();
        message+=in.nextLine();
        System.out.println(message);
        System.out.println("message length " + message.length());
        message = message.replace("laughing out loud","LOL");
        message = message.replace("be right back","BRB");
        message = message.replace("because", "BCOS");
        message = message.replace("I don't know","404");
        message = message.replace("be back soon","bbs");
        System.out.println("\n"+message);
        System.out.println("message length " + message.length());
        System.out.println("\nString method samples");
        System.out.println("Relpace spaces with undersocore:\t"+message.replace(" ","_"));
        System.out.println("Skip first word:\t"+message.substring(message.indexOf(" ")+1, message.length()));
        System.out.println("Substring one argument\t: "+ message.substring(message.indexOf("r")+1));
        System.out.println("middle character:\t" + message.substring(message.length()/2,(message.length()/2)+1));
     }
}

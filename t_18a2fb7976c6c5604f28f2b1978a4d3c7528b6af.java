/**
 * This program replaces phrases with abbreviations.
 * 
 * @author (Christian Lockley) 
 * @version (9/14/14)
 */
public class TextMessageV1
{
    public static void main(String[ ] args) {
        String message = "I don't know if i will be right back or not because right now i am laughing out loud.";
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
        System.out.println("Skip first word:\t"+message.substring(message.indexOf(" "), message.length()));
        System.out.println("index of "+message.substring(message.indexOf("B"), message.indexOf("B") + 1) +":\t "+ message.indexOf("B"));
        System.out.println("Substring one argument\t: "+ message.substring(message.indexOf("r")));
     }
}
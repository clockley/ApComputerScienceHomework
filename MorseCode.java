/**
 * Write a description of class MorseCode here.
 * 
 * @author (Christian Lockley) 
 * @version (2/21/15)
 */
import java.util.*;
import java.io.*;
class MorseCode
{
    private String filename;
    private Scanner file;
    private String[] characters;

    MorseCode(String filename)
    {
        characters = new String[37];
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

	static int asciitoarraynum(String a)
	{
		if (a.equals("")) {
			return 128;
		}
		return a.toUpperCase().charAt(0);
	}
	
    void readFile()
    {
        for (int i = 0; file.hasNextLine() == true; i += 1) {
            characters[i] = file.nextLine();
        }
    }

	void readInChar(String[] a)
	{
		for (int j = 0; j < a.length; j += 1) {
			for (int i = characters.length; i != 0; i -= 1) {		
				if (asciitoarraynum(a[j]) == 128) {
					//goto outer;
					break;
				}
				if (asciitoarraynum(a[j]) <= 57) {
					System.out.print(characters[asciitoarraynum(a[j])-23]+" ");
					break;
				}
				System.out.print(characters[asciitoarraynum(a[j])-65]+" ");
				break;
			}
		}
		System.out.printf("\n");
	}
}

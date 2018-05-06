/**
 * Find x-th Fibonacci number.
 * 
 * @author (Christian Lockley) 
 * @version (2/1/15)
 */
 
import java.util.Scanner;
 
public class Fibonacci
{
    public static long fib(long x) {
		if ( x==0 || x==1 ) {
			return x;
		}

		return fib(x-2)+fib(x-1);
    }

    public static void main(String[]arg) {
        Scanner in = new Scanner(System.in);
    	System.out.printf("Enter negative numbr to quit\n");
    	System.out.printf("Enter a number greater than 0 but less than 50: ");
        do {
			int i = in.nextInt();
			if ( i<=0 ) {
				break;
			} else if ( i>50 ) {
				System.out.printf("Invalid input\n");
				continue;
			}
			System.out.println(fib(i));
		} while (true);
    }
}

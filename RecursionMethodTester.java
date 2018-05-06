
/**
 * This class tests recursive methods
 * 
 * @author B. Jordan
 * @version 08/01/07
 */

public class RecursionMethodTester
{
    
    public static void main(String[] args)
    {
        int x;
        RecursiveMethods rMethods = new RecursiveMethods();
        
        System.out.println("---------------------------------");
        System.out.println("       f(x - 3) + 2    if x >  10");
        System.out.println("f(x) = ");
        System.out.println("       -5              if x <= 10");
        System.out.println("---------------------------------");
        System.out.println();
        
        x = 20;
        System.out.println("Example 1:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();
        
        x = 19;
        System.out.println("Example 2:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();
        
        x = 18;
        System.out.println("Example 3:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();
            
        System.out.println("\n---------------------------------");
        System.out.println("       f(x - 4) + 2    if x >  10");
        System.out.println("f(x) = ");
        System.out.println("       -7              if x <= 10");
        System.out.println("---------------------------------\n");
        
        for (int i = 1; i < 4; i += 1) {
			x = (int)(Math.random() * 100);
			System.out.printf("Example %d: x = %d\n", i, x);
			rMethods.one(x);
		}

        System.out.println("\n---------------------------------");
        System.out.println("       f(x / 12+5) - 3    if x >  25");
        System.out.println("f(x) = ");
        System.out.println("       20              if x <= 25");
        System.out.println("---------------------------------\n");

        for (int i = 1; i < 4; i += 1) {
			x = (int)(Math.random() * 100);
			System.out.printf("Example %d: x = %d\n", i, x);
			rMethods.two(x);
		}
		
		
		System.out.println("\n---------------------------------");
        System.out.println("       f(x * 2) - 4    if x <= 20");
        System.out.println("f(x) = ");
        System.out.println("       -100              if x > 25");
        System.out.println("---------------------------------\n");

        for (int i = 1; i < 4; i += 1) {
			x = (int)(Math.random() * 100);
			System.out.printf("Example %d: x = %d\n", i, x);
			rMethods.four(x);
		}
    }
}

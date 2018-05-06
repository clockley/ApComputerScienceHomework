
import java.*;
class RecursiveMethods
{
    RecursiveMethods()          //default constructor
    {
    }
    
    public int fOf(int x)
    {
        if (x <= 10)                        //the base case
        {
            System.out.println(x + " <= 10, therefore ... f(" + x + ") = -5");
            return -5;
        }
        else
        {
            System.out.println(x + " > 10, therefore ... f(" + x + ") = f(" + x + " - 3) + 2 = f(" + (x -3) + ") + 2");
            return fOf(x-3) + 2;
        }
    }   
    
    public int one(int a) {
		if (a <= 10) {
			System.out.println(a + " <= 10, therefore ... f(" + a + ") = -7");
			return -7;
		}
	
		System.out.println(a + " > 10, therefore ... f(" + a + ") = f(" + a + " - 4) + 2 = f(" + (a - 4) + ") + 2");
		return one(a-4) + 2;
	}
	
	public int two(int a) {
		if (a <= 25) {
			System.out.println(a + " <= 25, therefore ... f(" + a + ") = 20");
			return 20;
		}
	
		System.out.println(a + " > 25, therefore ... f(" + a + ") = f(" + a + " / 12 + 5) - 3 = f(" + (a /17) + ") - 3");
		return one(a/12+5) + -3;
	}
	
	public int four(int a) {
		if (a > 20) {
			System.out.println(a + " > 20, therefore ... f(" + a + ") = -100");
			return -100;
		}
	
		System.out.println(a + " < 20, therefore ... f(" + a + ") = f(" + a + " * 2) - 4 = f(" + (a *2) + ") - 4");
		return one(a*2) + -4;
	}
}

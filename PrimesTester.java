
/**
 * Write a description of class PrimesTester here.
 * 
 * @author (Christian Lockley) 
 * @version (3/4/15)
 */
import java.util.*;
public class PrimesTester
{
    static public void main(String[] args) {
        System.out.print("Enter a number up to a millon.(larger inputs should work, depending on the speed of your computer): ");
        Scanner in = new Scanner(System.in);
        Primes p = new Primes(in.nextInt());
        p.findAndPrintPrimes();
    }
}

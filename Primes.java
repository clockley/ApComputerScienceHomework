
/**
 * Write a description of class PrimesTester here.
 * 
 * @author (Christian Lockley) 
 * @version (3/4/15)
 */

import java.util.*;
public class Primes
{
    ArrayList<Integer> primes;
    int upper;

    Primes(int upper) {
        primes = new ArrayList<Integer>(upper/4);
        primes.ensureCapacity(upper/4);
        this.upper = upper;
    }

    private boolean IsPrime(int numberToTest) {
        int i = 3;
        for (Integer s:primes) {
            if (i == Math.sqrt(numberToTest)) {
                return false;
            }
            if ((numberToTest % i) == 0) {
                return false;
            }
            i+=2;
        }
        primes.add(numberToTest);
        return true;
    }

    void findAndPrintPrimes() {
        int numberToTest = 3;
        System.out.printf("%4s ", "2");
        int c = 1;
        while (numberToTest <= upper) {
            if (IsPrime(numberToTest) == true) {
                if (c < 10) {
                    System.out.printf("%4d ", numberToTest);
                    c +=1;
                } else {
                    System.out.printf("\n%4s ", numberToTest);
                    c = 1;
                }
            }
            numberToTest+=2;
        }
    }
}
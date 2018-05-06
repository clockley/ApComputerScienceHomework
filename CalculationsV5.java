
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * �FLVS 2014
 * @author Christian Lockley
 * @version V5
 */
public class CalculationsV5
{
    public static void main(String[] args)
    {
        double dpi = 3.14;
        //const int i9 = 9; //google the java equivalent
        int i9 = 9;
        int i25 = 25;
        double d5 = 5.0;
        double dp5 = .5;
        int i50 = 50;
        int i16 = 16;
        int i3 = 3;
        int i15 = 15;
        int i10 = 10;
        int i5 = 5;
        int i11 = 11;
        int i12 = 12;
        int i20 = 20;
        int i8 = 8;
        int i2 = 2;
        int i6 = 6;
        int ni2 = i2 * -1;
        double d2p5 = 2.5;
        int i24 = 24;
        double d43p21 = 43.21;
        
        // Addition
        System.out.println("Addition");
        System.out.print("25 plus 9 equals ");
        System.out.println(i25 + i9 );
        System.out.print("43.21 minus 3.14 plus 5.0 equals  ");
        System.out.println(d43p21 + dpi + d5);
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print( "16 minus 9 minus 25 equals  ");
        System.out.println(i16 - i9 - i25);
        
        System.out.println("3.14 minus 5.0 equals  ");
        System.out.print(dpi - d5);
        System.out.println();
        
        // Multiplication
        System.out.println("\nMultiplication");
        
        System.out.print("25 times 9 equals ");
        System.out.println(i25 * i9);
        
        System.out.print("3.14 times 50 times 5.0 equals ");
        System.out.println(dpi * d5 * d5);
        
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print("9 divided by 25 equals ");
        System.out.println(i9 / i25);
        System.out.print("43.21 / 5.0 equals ");
        System.out.println(43.21 / d5);
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print("16 mod 9 equals ");
        System.out.println(i16 % i9);
        System.out.print("5.0 mod 3.14 equals ");
        System.out.print(d5 % dpi);
        
        System.out.println();
        System.out.println();
        
        System.out.println("2.02 Lab Equations");
        System.out.print("15 divided by 2.5 times -2 plus 10 / 5 equals ");
        System.out.println(i15 / d2p5 * ni2 + i10 / i5);
        System.out.print("234 minus (234 divided by 6 modulus 12) + 3 equals ");
        int i234 = 234;
        System.out.println(i234 - (i234 / (i6 % i12)) + i3);
        System.out.print("(46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3) equals ");
        int i17 = 17;
        double d46p2 = 46.2;
        System.out.println((d46p2 / i11 - i3) + i24 % (i17 - i2) * i3);
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        int i480 = 480;
        int i200 = 200;
        System.out.print("480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8 equals ");
        System.out.println(((i480 / i10) / i12) + i200 * dp5 - (i20 % i8));
        
        System.out.println("\n2.03 Additional int Equations");
        System.out.println("");
        int equatone = 128 * 256  % 512 + 1024 / 4 - 128;
        System.out.println("\n128 times 256  mod 512 plus 1024 divided  by 4 minus 128 equals " + equatone);
        
        System.out.print("((((8 minus 2) plus 1) times 5) mod 2) equals "); //sadmep
        System.out.println( ((((8 - 2) + 1) * 5 % 2)));
        System.out.println("");
        System.out.println("2.04 Additional double Equations");
        System.out.println("");
        System.out.print("3.14 * 2.71 * 4 / 2 - 7 + .5 equals  ");
        double den = 2.7;
        System.out.println(dpi * den * 4 / 2 - 7 + .5);
        System.out.print("3.14 * 1.61 * 8 / 4 - 14 + 1 equals  ");
        double vision = 1.61;
        System.out.println(dpi * vision * 8 / 4 - 14 + 1);
    } // end of main method
} // end of class

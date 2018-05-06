
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * �FLVS 2014
 * @author Christian Lockley
 * @version V5
 */
public class Calculations2V5
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
        System.out.print(i25 + "plus " + i9 + " equals ");
        System.out.println(i25 + i9 );
        System.out.print(d43p21 + " minus " + dpi + "plus " + d5 + " equals  ");
        System.out.println(d43p21 + dpi + d5);
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print( i16 + " minus " + i9 + " minus " + i25 + " equals  ");
        System.out.println(i16 - i9 - i25);
        System.out.println();
        
        System.out.println(dpi + " minus " + dp5 + " equals  ");
        System.out.print(dpi - d5);
        System.out.println();
        
        // Multiplication
        System.out.println("\nMultiplication");
        
        System.out.print(i25 + " times " + i9 + " equals ");
        System.out.println(i25 * i9);
        
        System.out.print(dpi + " times " + i50 + " times " + dp5 + " equals ");
        System.out.println(dpi * d5 * d5);
        
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print(i9 + " divided by " + i25 +  " equals ");
        System.out.println(i9 / i25);
        System.out.print(d43p21 + " divided by " + dp5 + " equals ");
        System.out.println(d43p21 + " divided by " + d5);
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print(i16 + " mod " + i9 + " equals ");
        System.out.println(i16 % i9);
        System.out.print(dp5 + " mod " + dpi + " equals ");
        System.out.print(d5 % dpi);
        
        System.out.println();
        System.out.println();
        
        System.out.println("2.02 Lab Equations");
        System.out.print(i15 + " divided by " + d2p5 + " times " + ni2 + " plus " + i10 + "/" + i5 + " equals ");
        System.out.println(i15 / d2p5 * ni2 + i10 / i5);
        int i234 = 234;
        System.out.print(i234 + " minus " + "(" + i234 + " divided by " + i6 + " modulus " + i12 + ")" + i3 + " equals ");
        System.out.println(i234 - (i234 / (i6 % i12)) + i3);
        int i17 = 17;
        double d46p2 = 46.2;
        System.out.print("(" + d46p2 + " divided by " + i11 + ") minus " + i3 + " plus  " + i24 + "  modulus ( "+i17 + " minus " + i2 + "times " + i3 + ") equals ");
        System.out.println((d46p2 / i11 - i3) + i24 % (i17 - i2) * i3);
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        int i480 = 480;
        int i200 = 200;
        System.out.print(i480 + " divided by " + i10 + " divided by " + i12 + " plus " + i200 * dp5 + " minus " + i20 + " modulus 8 equals ");
        System.out.println(((i480 / i10) / i12) + i200 * dp5 - (i20 % i8));
        
        System.out.println("\n2.03 Additional int Equations");
        System.out.println("");
        final int equatone = 128 * 256  % 512 + 1024 / 4 - 128;
        final int i128 = 128;
        final int i256 = i128 * 2;
        final int i512 = i256 * 2;
        final int i1024 = i512 * 2;
        System.out.println("\n"+ i128 +" times "+ i256+ "  mod " + i512 + " plus " + i1024 + " divided  by " + i5 + "  minus " + i128 + " equals " + equatone);
        final int i1 = 1;
        System.out.print("(((("+i8+" minus "+i2+") plus "+ i1 +") times " + i5+") mod "+i2 +") equals ");
        System.out.println( ((((8 - 2) + 1) * 5 % 2)));
        System.out.println("");
        System.out.println("2.04 Additional double Equations");
        System.out.println("");
        double den = 2.7;
        int i14 = 14;
        int i4 = 4;
        System.out.println(dpi + " times " + den + " times "  + i8 + " divided by " + i4 + " minus " + i14 + i1 + " equals ");
        System.out.println(dpi * den * i8 / i4 - i14 + i1);
        System.out.println("");
        double grat = 1.61;
        System.out.println(dpi + " plus " + grat + " times " + i8 + " divided by " + i4 + " minus " + i14 + " plus " + ni2 + " times " + i480 + " times " + grat + " equals");
        System.out.println(dpi * grat * i8 / i4 - i14 + ni2 * i480 * grat);
    } // end of main method
} // end of class

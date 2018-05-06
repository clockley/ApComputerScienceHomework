/*
 * Christian Lockley
 * 
 * This program prints out the y coordinate for a circle where radius is 1.0 and x {-1.00,...,1.00}
 * */
public class PointsOnACircle {
	
	public static void main (String args[]) {

	double radius = 1.0;
	double increment = 0.1;
	double x = 1.00;
	double oox = -x;
	
	System.out.printf("%35s%-1.1f\n", "Points on a Circle of Radius ", radius);
	System.out.printf("  x1        y1            x1      y2\n");
	for (int i = 40; i != 0; i -= 1){
		System.out.printf("-");
	}
	
	System.out.printf("\n");
	
	while (x > oox) {
		double y = Math.sqrt(Math.pow(radius, 2) - Math.pow(x, 2));
		System.out.printf("%6.2f  %6.2f%14.2f  %6.2f\n", x, y, x, -y);
		x -= increment;
	}
    }
}

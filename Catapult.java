/**
 * This class calculates the range of a projectile.
 * 
 * @author (Christian Lockley) 
 * @version (1/14/15)
 */
public class Catapult
{
    // instance variables - replace the example below with your own
    private double itsSpeed;
    private double itsAngle; //radians not degrees
    private double itsRange;
    /**
     * Constructor for objects of class Catapult
     * @param speed mph
     * @speed angle degrees
     */
    public Catapult(double speed, double angle)
    {
        itsSpeed = speed * 0.44704;
        itsAngle = Math.toRadians(angle);
        itsRange = 0;
    }

    /**
     * calculate range of projectile
     * 
     * @return     void
     */
    public void CalcCaptapult()
    {
        itsRange = ((Math.pow(itsSpeed, 2) * Math.sin((2*itsAngle))) / 9.8) * 3.28084;
    }
    
    /**
     * Getter method returns range of projectile in feet
     */
    double GetRange() {
        return itsRange;
    }
}
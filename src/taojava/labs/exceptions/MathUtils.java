package taojava.labs.exceptions;

/**
 * A variety of utilities for doing Math.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class MathUtils
{

  public static double smallQuadraticRoot(double a, double b, double c)
    throws Exception
  {
    if(a == 0)
      {
        throw new DivideByZeroException();
      } // if (a == 0)
    
   if((Math.pow(b, 2)) - (4 * a * c) < 0)
   {
     throw new Exception ("Quadratic does not have real roots");
   }
   
   
    return ((-b - (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))) / (2 * a));
  }

} // MathUtils

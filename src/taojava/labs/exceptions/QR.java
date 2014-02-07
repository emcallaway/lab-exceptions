package taojava.labs.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QR
{

  public static void main(String[] args)
  {
    double a;
    double b;
    double c;
    double root;
    double value;
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes;
    InputStreamReader istream;
    istream = new InputStreamReader(System.in);
    eyes = new BufferedReader(istream);
    try
      {
        pen.println("Please enter the first coefficient of a quadratic function");
        a = Double.parseDouble(eyes.readLine());
        pen.println("Enter the second coefficient");
        b = Double.parseDouble(eyes.readLine());
        pen.println("Enter the third coefficient");
        c = Double.parseDouble(eyes.readLine());

        root = MathUtils.smallQuadraticRoot(a, b, c);
        value = (a * (Math.pow(root, 2))) + (b * root) + c;

        pen.println(root);
        pen.println(value);
      } // try

    catch (DivideByZeroException dbze)
      {
        pen.println("Cannot compute a result because the coefficient of the quadratic term is 0.");
      } // catch (DivideByZeroException)

    catch (Exception e)
      {
        pen.println("Sorry I could not compute a root.");
      } // catch (Exception)
  } // main
} // class QR

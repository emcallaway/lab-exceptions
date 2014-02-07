package taojava.labs.exceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathUtilsTest
{

  @Test
  public void test() throws Exception
  {
    assertEquals("x^2 + 3 -10 should give us ", -5, MathUtils.smallQuadraticRoot(1, 3, -10), .0001);
    assertEquals("6x^2+x-12 should give us ", -1.5, MathUtils.smallQuadraticRoot(6, 1, -12), .0001);
  }

}

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Rectangle
 * 
 * @author Newseeben
 * @version 2018-04-02
 * Lab 11
 */
public class RectangleTestOfficial
{
    // TODO: implement this.
    private static Rectangle r1 = new Rectangle(new Point(100, 100), 100, 50, Color.BLUE, true);
    
    
@Test
public void testRectangleConstructorPoint()
{
    // Verify the quantity of points for each shape
    Assert.assertEquals("Quantity of points defining the Rectangle is more than 1", 1, r1.getLocation().length);

    // Verify the colors for each shape
    Assert.assertEquals("Incorrect color for the Rectangle", Color.BLUE, r1.getColor());
    
    
    // Verify the appropriate filled flag for each shape
    Assert.assertTrue("Incorrect flag for filled for the Rectangle", r1.isFilled());
  
}

@Test
public void testRectangleColorConstructor()
{
    Color clr1 = r1.getColor();
    Assert.assertEquals("Rectangle color incorrect", Color.BLUE, clr1);
}

@Test
public void testRectangleFilledConstructor()
{
    Assert.assertTrue("Rectangle fill incorrect.", r1.isFilled());
   ;
}
}

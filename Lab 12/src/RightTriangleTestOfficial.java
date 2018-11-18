
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Triangle
 * 
 * @author Newseeben
 * @version 2018-04-02
 * Lab 11
 */
public class RightTriangleTestOfficial
{
    // TODO: complete testing
    private static RightTriangle t1 = new RightTriangle(new Point(100,200), 100, 200, Color.PINK, true);
    private static RightTriangle t2 = new RightTriangle(new Point(300,400), 300, 400, Color.ORANGE, true);
    
    @Test
    public void testTriangleConstructorPoint()
    {
        // Verify the quantity of points for each shape
        Assert.assertEquals("Quantity of points defining the Triangle is more than 1", 1, t1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Triangle is more than 1", 1, t2.getLocation().length);

        // Verify the colors for each shape
        Assert.assertEquals("Incorrect color for the Triangle", Color.PINK, t1.getColor());
        Assert.assertEquals("Incorrect color for the Triangle", Color.ORANGE, t2.getColor());
        
        // Verify the appropriate filled flag for each shape
        Assert.assertTrue("Incorrect flag for filled for the Triangle", t1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Triangle", t2.isFilled());
    }
    @Test
    public void testTriangleColorConstructor()
    {
        Color clr1 = t1.getColor();
        Color clr2 = t2.getColor();
       
        Assert.assertEquals("Triangle color incorrect", Color.PINK, clr1);
        Assert.assertEquals("Triangle color incorrect", Color.ORANGE, clr2);
    }
    
    @Test
    public void testTriangleFilledConstructor()
    {
        Assert.assertTrue("Triangle fill incorrect.", t1.isFilled());
        Assert.assertTrue("Triangle fill incorrect.", t2.isFilled());
    }
    
   
}

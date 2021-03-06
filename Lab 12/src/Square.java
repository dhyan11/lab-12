import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
/**
 * This class maintains information for drawing a Square and extends Rectangle.
 * 
 * @author Stephen Modified by Newseeben 
 * @version 2018-04-02
 * Lab 11
 */
public class Square extends Rectangle
{
    
    /**
     * Constructor for a Rectangle with equal length and widths
     * 
     * @param center Center point of the square
     * @param width Width (and height) of the square
     * @param color Desired color for the square
     * @param filled True if the square should be filled solid
     */
    public Square(Point center, int width, Color color, boolean filled)
    {
        // TODO: implement this.
        super(center, width, width, color, filled);
        
    }
}

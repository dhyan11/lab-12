import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;
/**
 * 
 * 
 * @author Newseeben 
 * @version 2018-04-02
 * Lab 11
 */
public abstract class Shape
{
    Point[] location;
    private Color color;
    private boolean filled;
    /**
     * Constructor
     */
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    /**
     * 
     * @return color of the shape
     */
    public Color getColor()
    {
        return color;
    }
    
    /**
     * 
     * @return if the color is filled or not
     */
    public boolean isFilled()
    {
       return filled;
    }
    
    /**
     * 
     * @return the location of the points
     */
    public Point[] getLocation()
    {
        return location;
    }

    public void draw(Graphics graphics)
    {
        // TODO Auto-generated method stub
        
    }
}

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * This a type of component, that holds and draws the drawable objects
 * 
 * @author Stephen Modified by Newseeben
 * @version 2018-04-02
 * Lab 11
 */
public class DrawPanel extends JPanel
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** The list holding all the shapes being drawn */
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    /**
     * This method adds shapes to the set of shapes.
     * 
     * @param shape The shape to be added to the set of shapes.
     */
    public void addShape(Shape shape)
    {
        // TODO: add the passed in shape to the list.
        shapeList.add(shape);
    }

    /**
     * Draw the shapes in the component, based on their defined draw method
     * 
     * @param graphics A Graphics object for drawing the shapes
     */
    @Override
    protected void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);
        graphics.drawRect(20, 20, 20, 20);
        
        graphics.drawPolyline(new int[] {1,2,3,4,5,6}, new int[] {1,2,3,4,5,5}, 5);
        graphics.drawLine(150, 0, 150, 300);
        graphics.drawLine(0, 150,300, 150);
        
        graphics.drawPolygon(new int []{150,250,325,375,450,275,100}, new int[] {150,100,125,225,250,375,300}, 7);
        
        graphics.drawPolygon(new int[] {10,20,30}, new int[] {100,20,100},3);
        
        
        
        
        
        // TODO: for all shapes in the list, draw the shape.
    }
}

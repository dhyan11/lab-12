
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Newseeben
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a cat:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.ORANGE, true);
        Circle outline = new Circle(new Point(600, 600),600, Color.BLACK, false);
        // Ears:
        RightTriangle orangeEar1 = new RightTriangle(new Point(20, 20), 10, 15, Color.ORANGE, true);
        RightTriangle orangeEar2 = new RightTriangle(new Point(20, 20), 10, 15, Color.ORANGE, true);
        RightTriangle pinkEar1 = new RightTriangle(new Point(10, 10), 5, 10, Color.PINK, true);
        RightTriangle pinkEar2 = new RightTriangle(new Point(10, 10), 5, 10, Color.PINK, true);
        
        
        // Eyes:
        Oval eye1 = new Oval(new Point(10,10), 5, 7, Color.WHITE, true);
        Oval eye2 = new Oval(new Point(10,10), 5, 7, Color.WHITE, true);
        Oval pupil1 = new Oval(new Point(5, 5), 2, 3, Color.BLACK, true);
        Oval pupil2 = new Oval(new Point(5, 5), 2, 3, Color.BLACK, true);
        
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(30,30), 30, Color.PINK, true);
        PolyLine whisker1 = new PolyLine(new Point(10,10), new Point(20,20), 20, Color.BLACK, true);
        PolyLine whisker2 = new PolyLine(new Point(10,10), new Point(20,20), 20, Color.BLACK, true);
        PolyLine whisker3 = new PolyLine(new Point(10,10), new Point(20,20), 20, Color.BLACK, true);
        PolyLine whisker4 = new PolyLine(new Point(10,10), new Point(20,20), 20, Color.BLACK, true);
        
        // Collar:
        Rectangle collar = new Rectangle(new Point(300, 200), 300, 100, Color.BLUE, true);
        Diamond collarBase = new Diamond(new Point(50,50), 50, Color.RED, true);
        Diamond green = new Diamond(new Point(25,25),25, Color.GREEN, false);
        // Square around the cat:
        Square aroundCat = new Square(new Point(500, 300), 500, Color.MAGENTA, false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(outline);
        drawPanel.addShape(orangeEar1);
        drawPanel.addShape(orangeEar2);
        drawPanel.addShape(pinkEar1);
        drawPanel.addShape(pinkEar2);
        drawPanel.addShape(eye1);
        drawPanel.addShape(eye2);
        drawPanel.addShape(pupil1);
        drawPanel.addShape(pupil2);
        drawPanel.addShape(nose);
        drawPanel.addShape(whisker1);
        drawPanel.addShape(whisker2);
        drawPanel.addShape(whisker3);
        drawPanel.addShape(whisker4);
        drawPanel.addShape(collar);
        drawPanel.addShape(collarBase);
        drawPanel.addShape(green);
        drawPanel.addShape(aroundCat);
        
        
        // set background color
        drawPanel.setBackground(Color.YELLOW);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Meow :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square grass;
    private Person boy;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(80);
        sun.changeSize(80);
        sun.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(145);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(110);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(75);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(40);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(5);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(-30);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(-65);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(-100);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(-135);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(-165);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(-200);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(-235);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(-265);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(-300);
        grass.makeVisible();
        
        grass= new Square();
        grass.changeColor("green");
        grass.changeSize(45);
        grass.moveVertical(135);
        grass.moveHorizontal(-315);
        grass.makeVisible();
        
        sun.slowMoveVertical(-80);
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    /**
     * Change this to sunset
     */
    public void atardecer()
    {
        sun.slowMoveVertical(75);
        boy = new Person();
        boy.changeColor("black");
        boy.moveHorizontal(-290);
        boy.moveVertical(40);
        boy.makeVisible();
        boy.slowMoveHorizontal(255);
        
        
    
    
    
    
    
    }
        
    }   

package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square door;
    private Triangle roof;
    private Triangle fgtree;
    private Triangle mountain;
    private Circle moon;
    private Square sky;
    private Circle bush;

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
        //Background
        sky = new Square();
        sky.changeSize(500);
        sky.changeColor("darkBlue");
        sky.makeVisible();

        //Crescent Moon
        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(220);
        moon.moveVertical(85);
        moon.changeSize(80);
        moon.makeVisible();
        //Moon Cut-Out
        moon = new Circle();
        moon.changeColor("darkBlue");
        moon.moveHorizontal(230);
        moon.moveVertical(  105);
        moon.changeSize(60);
        moon.makeVisible();

        //Mountains
        //Right
        mountain = new Triangle();
        mountain.changeColor("black");
        mountain.changeSize(500, 500);
        mountain.moveHorizontal(500);
        mountain.makeVisible();
        //Inner Right
        mountain = new Triangle();
        mountain.changeColor("black");
        mountain.changeSize(450, 500);
        mountain.moveHorizontal(400);
        mountain.makeVisible();
        //Left
        mountain = new Triangle();
        mountain.changeColor("black");
        mountain.changeSize(500, 500);
        mountain.moveHorizontal(0);
        mountain.makeVisible();
        //Inner Left
        mountain = new Triangle();
        mountain.changeColor("black");
        mountain.changeSize(400, 500);
        mountain.moveHorizontal(100);
        mountain.makeVisible();

        //House
        //Wall shadow
        wall = new Square();
        wall.changeColor("gray");
        wall.moveVertical(300);
        wall.moveHorizontal(400);
        wall.changeSize(110);
        wall.makeVisible();
        //Wall Highlight
        wall = new Square();
        wall.changeColor("lightGray");
        wall.moveVertical(300);
        wall.moveHorizontal(350);
        wall.changeSize(110);
        wall.makeVisible();

        //Roof
        //Roof Shadow
        roof = new Triangle();
        roof.changeColor("darkGray");
        roof.changeSize(50, 130);
        roof.moveHorizontal(450);
        roof.moveVertical(255);
        roof.makeVisible();
        //Mid-Roof
        wall = new Square();
        wall.changeColor("darkGray");
        wall.moveVertical(255);
        wall.moveHorizontal(400);
        wall.changeSize(45);
        wall.makeVisible();
        //Roof Highlight
        roof = new Triangle();
        roof.changeColor("gray");
        roof.changeSize(50, 130);
        roof.moveHorizontal(400);
        roof.moveVertical(255);
        roof.makeVisible();

        //Door
        door = new Square();
        door.changeColor("black");
        door.moveVertical(345);
        door.moveHorizontal(395);
        door.changeSize(35);
        door.makeVisible();
        door = new Square();
        door.changeColor("black");
        door.moveVertical(375);
        door.moveHorizontal(395);
        door.changeSize(35);
        door.makeVisible();

        //Left Window
        window = new Square();
        window.changeColor("darkGray");
        window.moveHorizontal(360);
        window.moveVertical(330);
        window.changeSize(30);
        window.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(362);
        window.moveVertical(332);
        window.changeSize(25);
        window.makeVisible();

        //Right Bushes
        //Big
        bush = new Circle();
        bush.changeColor("darkGray");
        bush.moveHorizontal(450);
        bush.moveVertical(380);
        bush.changeSize(70);
        bush.makeVisible();
        //Medium
        bush = new Circle();
        bush.changeColor("darkGray");
        bush.moveHorizontal(440);
        bush.moveVertical(400);
        bush.changeSize(60);
        bush.makeVisible();
        //Small
        bush = new Circle();
        bush.changeColor("darkGray");
        bush.moveHorizontal(420);
        bush.moveVertical(400);
        bush.changeSize(40);
        bush.makeVisible();

        //Left Bushes
        //Big
        bush = new Circle();
        bush.changeColor("darkGray");
        bush.moveHorizontal(300);
        bush.moveVertical(380);
        bush.changeSize(70);
        bush.makeVisible();
        //Small
        bush = new Circle();
        bush.changeColor("darkGray");
        bush.moveHorizontal(340);
        bush.moveVertical(390);
        bush.changeSize(40);
        bush.makeVisible();

        //Foreground Trees

        //Little FGRight
        fgtree = new Triangle();
        fgtree.changeColor("darkGray");
        fgtree.changeSize(250, 200);
        fgtree.moveHorizontal(150);
        fgtree.moveVertical(350);
        fgtree.makeVisible();
        //Little FGleft
        fgtree = new Triangle();
        fgtree.changeColor("darkGray");
        fgtree.changeSize(350, 200);
        fgtree.moveHorizontal(50);
        fgtree.moveVertical(320);
        fgtree.makeVisible();

        //Less Detail Tree
        //Highlight
        fgtree = new Triangle();
        fgtree.changeColor("gray");
        fgtree.changeSize(300, 200);
        fgtree.moveHorizontal(200);
        fgtree.moveVertical(310);
        fgtree.makeVisible();
        //Shadow
        fgtree = new Triangle();
        fgtree.changeColor("darkGray");
        fgtree.changeSize(300, 150);
        fgtree.moveHorizontal(200);
        fgtree.moveVertical(310);
        fgtree.makeVisible();

        //Foreground Tree Highlight
        //Small Top
        fgtree = new Triangle();
        fgtree.changeColor("gray");
        fgtree.changeSize(100, 70);
        fgtree.moveHorizontal(100);
        fgtree.moveVertical(210);
        fgtree.makeVisible();
        //Medium Shape
        fgtree = new Triangle();
        fgtree.changeColor("gray");
        fgtree.changeSize(130, 140);
        fgtree.moveHorizontal(100);
        fgtree.moveVertical(310);
        fgtree.makeVisible();
        //Big Shape
        fgtree = new Triangle();
        fgtree.changeColor("gray");
        fgtree.changeSize(300, 150);
        fgtree.moveHorizontal(100);
        fgtree.moveVertical(210);
        fgtree.makeVisible();

        //Foreground Tree Shadow
        //Small Top
        fgtree = new Triangle();
        fgtree.changeColor("darkGray");
        fgtree.changeSize(100, 40);
        fgtree.moveHorizontal(100);
        fgtree.moveVertical(210);
        fgtree.makeVisible();
        //Medium Shape
        fgtree = new Triangle();
        fgtree.changeColor("darkGray");
        fgtree.changeSize(130, 100);
        fgtree.moveHorizontal(100);
        fgtree.moveVertical(310);
        fgtree.makeVisible();
        //Big Shape
        fgtree = new Triangle();
        fgtree.changeColor("darkGray");
        fgtree.changeSize(300, 110);
        fgtree.moveHorizontal(100);
        fgtree.moveVertical(210);
        fgtree.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            moon.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            moon.changeColor("yellow");
        }
    }

}

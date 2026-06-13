import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private int timer = 4000;
    private boolean isKeyPressed;
    Enemy3 alien;
    Shooter plane;
    ForceField shield;
    ForceField shield1;
    int hearts = 100;
    Heart heart;
    private int direction;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 650, 1);
        GreenfootImage bg = new GreenfootImage("96defd4e2efa775f229d5463f648eb54.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg); 
        showText("LEVEL THREE!", 80, 30); 
        direction = -90;
        plane = new Shooter();
        addObject(plane, 275, 600);
        shield = new ForceField();
        addObject(shield, 2, 628);
        alien = new Enemy3();
        addObject(alien, 55, 110);
        shield1 = new ForceField();
        addObject(shield1, 2, 628);
    }
    public void act()
    {
        showText("time remaining :" + timer/100 + "s", 440, 30);
        showText("" + hearts, 510, 70);
        heart = new Heart();
        addObject(heart, 479, 68);
        checkKeys(); // declares checkKeys method
        if(hearts == 0)
        {
            removeObject(alien);
        }
        if (getObjects(Enemy3.class ).isEmpty())
        {
            Greenfoot.setWorld(new WinScreen());
        }
        if(--timer<0)
        {
            Greenfoot.setWorld(new GameOver(3));
        }
    }
    private void checkKeys()
    {
        // boolean to check if either direction was pressed
        isKeyPressed = false;
        if (Greenfoot.isKeyDown("right")) // if right was pressed, move Shooter right
        {
            plane.walkRight();
            isKeyPressed = true;
        }
        if (Greenfoot.isKeyDown("left"))//if left key was pressed, move Shooter left
        {
            plane.walkLeft();
            isKeyPressed = true;
        }
        if (Greenfoot.isKeyDown("down"))//if left key was pressed, move Shooter left
        {
            plane.walkDown();
            isKeyPressed = true;
        }
        if (Greenfoot.isKeyDown("up"))//if left key was pressed, move Shooter left
        {
            plane.walkUp();
            isKeyPressed = true;
        }
    }
    public void livesLeft(int lifeLine)
    {
        hearts = hearts + lifeLine;
    }
}

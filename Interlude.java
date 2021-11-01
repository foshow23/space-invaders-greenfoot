import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Interlude here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interlude extends World
{
    GifImage interlude = new GifImage ("Warp.gif"); // declares new .gif  image  
    private int timer = 200; // declares timer
    /**
     * Constructor for objects of class Interlude.
     * 
     */
    public Interlude()
    {    
        // Create a new world with 500x500 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
    }
    public void act()
    {
        setBackground(interlude.getCurrentImage());// sets current as .gif
        if (--timer<0)// if timer reaches zero, move to second level
        {
            Greenfoot.setWorld(new Level2());
        }
    }
}

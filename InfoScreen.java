import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InfoScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfoScreen extends World
{
    Close close;
    /**
     * Constructor for objects of class InfoScreen.
     * 
     */
    public InfoScreen()
    {    
        super(550, 650, 1);
        GreenfootImage bg = new GreenfootImage("Info.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        close = new Close();
        addObject(close, 500, 35);

    }
}

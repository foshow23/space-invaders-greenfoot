import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{
    PlayAgain play;
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 650, 1);//pixel-art-8-bit-you-win-text-winner-golden-cups-vector-33826578.png
        GreenfootImage bg = new GreenfootImage("pixelworld.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        play = new PlayAgain();
        addObject(play, 271, 522);
    }
}

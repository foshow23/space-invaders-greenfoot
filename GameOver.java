import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Quit quit;// declares quit button
    Retry retry;// declares button to retry level
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int level)// argument to see where level ended
    {    
        // Create a new world with 500x650 cells with a cell size of 1x1 pixels.
        super(500, 650, 1); 
        GreenfootImage bg = new GreenfootImage("gameover.png"); // sets background as png 
        bg.scale(getWidth(), getHeight()); // scale image to world dimensions 
        setBackground(bg);
        retry = new Retry(level); 
        addObject(retry, 70, 550); // adds Actor in the World
        quit = new Quit();
        addObject(quit, 435, 560); //  adds Actor in the World
    }
}


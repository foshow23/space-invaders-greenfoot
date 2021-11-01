import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    Rules rules;
    Info info;
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 650, 1);
        GreenfootImage bg = new GreenfootImage("startscreen.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        rules = new Rules();
        addObject(rules, 50, 600);
        info = new Info();
        addObject(info, 500, 610);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")) // if score1 equals 30, world moves to WinScreen
        {
            Greenfoot.setWorld(new Level1()); // moves to WinScreen
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int speed, direction;
    public Enemy()
    {
        GreenfootImage image = getImage(); // scales the size
        image.scale(50, 50);
        setImage(image);
        speed = 0;
        direction = 0;
        turn(direction);
    }
    public void act() 
    {
        move(speed);
        setLocation(getX() - speed, getY() + 1);
        if (isAtEdge())
        {
           setLocation(getX(), 100 + 2);
        }
    }    
}

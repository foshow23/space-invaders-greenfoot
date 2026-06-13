import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Upgrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForceField extends Actor
{
    int direction;
    private int timer = 0, second = 20; 
    public ForceField()
    {
        GreenfootImage image = getImage(); // scales the size
        image.scale(130, 130);
        setImage(image);
        direction = 90;
        turn(direction);
    }
    /**
     * Act - do whatever the Upgrade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet != null)
        {
            getWorld().removeObject(bullet);
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Retry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry extends Actor
{    
    public int lastLevel = 1;
    public Retry(int level)
    {
        GreenfootImage image = getImage(); // scales the size
        image.scale(75, 75);
        setImage(image);
        lastLevel = level;
    }
    /**
     * Act - do whatever the Retry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Actor enemy = getOneIntersectingObject(Enemy.class);
        //Actor ufo = getOneIntersectingObject(Enemy2.class);
        //Actor alien = getOneIntersectingObject(Enemy3.class);
        if (Greenfoot.mouseClicked(this)) 
        {
                if (lastLevel==1) 
                {
                    Greenfoot.setWorld(new Level1());
                }
        }
        if (Greenfoot.mouseClicked(this)) 
        {
                if (lastLevel==2) 
                {
                    Greenfoot.setWorld(new Level2());
                }
        }
        if (Greenfoot.mouseClicked(this)) 
        {
                if (lastLevel==3) 
                {
                    Greenfoot.setWorld(new Level3());
                }
        }
    }
}

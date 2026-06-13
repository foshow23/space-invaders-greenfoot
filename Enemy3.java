import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy3 extends Actor
{
    int speed;
    public Enemy3()
    {
       GreenfootImage image = getImage(); // scales the size
       image.scale(200, 200);
       setImage(image); 
       speed = 2;
    }
    public void act()
    {
        move(speed);
        Actor bullet = getOneIntersectingObject(Bullet.class);
        Actor plane = (Actor)getWorld().getObjects(Shooter.class).get(0);
        if (getWorld().getObjects(Shooter.class).isEmpty())return;
        {
            turnTowards(plane.getX(), plane.getY()); 
        }
        if (!getIntersectingObjects(ForceField.class).isEmpty()) 
        {
            move(-500);
        }
        if(bullet != null)
        {
            Level3 s = (Level3)getWorld();
            s.livesLeft(-1);
            getWorld().removeObject(bullet);
        }
    }
}

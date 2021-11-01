import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Actor
{
    private int speed, direction;
    private int timer = 1, ebulletDelay = 200;
    public Enemy2()
    {
        GreenfootImage image = getImage(); // scales the size
        image.scale(50, 50);
        setImage(image);
        speed = 3;
        direction = 1;
    }
    public void act()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if ((direction == -1 && getX() == 0) || (direction == 1 && getX() == getWorld().getWidth()-1)) direction = -direction;
        {
            move(direction*speed);
        }
        if (--timer<0)
        {
                timer = ebulletDelay;
                getWorld().addObject(new EnemyBullet(), getX(), getY());
        }
        if(bullet != null)
        {
            getWorld().removeObject(this);
        }
    }
}

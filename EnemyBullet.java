import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Actor
{
    private int speed, direction;
    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyBullet()
    {
        GreenfootImage image = getImage(); // scales Bullet size
        image.scale(75, 75);
        setImage(image);
        speed = 4; // speed value
        direction = -270;
        turn(90);
        setRotation(0);
    }
    public void act()
    {
        setLocation(getX(), getY() + speed);
        //Actor ss = getOneIntersectingObject(Shooter.class);
        Actor bb = getOneIntersectingObject(Bullet.class);
        /*if( ss != null )
        {
            getWorld().removeObject(ss);
        }*/
        if( bb != null )
        {
            getWorld().removeObject(bb);
        }
        if (isAtEdge())
        {
           getWorld().removeObject(this); 
        }
}
}

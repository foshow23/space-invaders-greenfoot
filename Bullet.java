import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bullet extends Actor
{
    private int speed, direction; // delcares speed
    private int bulletCounter = 4, bulletChecker = 0;
    public Bullet(int rotation)
    {
        GreenfootImage image = getImage(); // scales Bullet size
        image.scale(40, 20);
        setImage(image);
        speed = 15; // speed value
        direction = 270;
        turn(direction);
    }
    public void act() 
    {
        move(speed);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
            return;
        }
        if (Enemy.class != null) 
        {
            hitEnemy(); 
        }
    }   
    public void hitEnemy() 
    {
        Enemy enemy = (Enemy) getOneIntersectingObject(Enemy.class);
        if (enemy != null) 
        {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        }
    }
}
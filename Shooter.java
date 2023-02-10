import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Shooter extends Actor
{
    int speed = 5; // declares speed value
    private boolean isKeyPressed; // boolean value to check if space is pressed
    private int timer = 0, bulletDelay = 15;
    private  int countdown = 200; 
    public Shooter()
    {
        GreenfootImage image = getImage(); // scales the size
        image.scale(50, 50);
        setImage(image);
    }
    public void act()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        Actor ufo = getOneIntersectingObject(Enemy2.class);
        Actor bullet = getOneIntersectingObject(EnemyBullet.class);
        Actor alien = getOneIntersectingObject(Enemy3.class);
        Actor portal = getOneIntersectingObject(Portal.class);
        if (--timer<0)
        {
            if (Greenfoot.isKeyDown("space"))
            {
                timer = bulletDelay;
                getWorld().addObject(new Bullet(getRotation()), getX(), getY());
            }
        }
        if( enemy != null) // if Shooter touches Target, move to GameOver
        {
            World s = (World)getWorld();
            Greenfoot.setWorld(new GameOver(1));
        }
        if( ufo != null || bullet != null) // if Shooter touches Target, move to GameOver
        {
            World s = (World)getWorld();
            Greenfoot.setWorld(new GameOver(2));
        }
        if( alien != null) // if Shooter touches Target, move to GameOver
        {
            World s = (World)getWorld();
            Greenfoot.setWorld(new GameOver(3));
        }
        if( portal != null)
        {
            Greenfoot.setWorld(new Interlude());
        }
    }
    public void walkLeft()
    {
        if (Greenfoot.isKeyDown("left")) // if left key is pressed, move to the left
        setLocation (getX() - speed, getY());   
    }
    public void walkRight()
    {
        if (Greenfoot.isKeyDown("right")) //if right key is pressed, move to the right
        setLocation (getX() + speed, getY());  
    }
    public void walkDown()
    {
        if (Greenfoot.isKeyDown("down")) //if right key is pressed, move to the right
        setLocation (getX(), speed + getY());
    }
    public void walkUp()
    {
        if (Greenfoot.isKeyDown("up")) //if right key is pressed, move to the right
        setLocation (getX(), getY() - speed );
    }
}
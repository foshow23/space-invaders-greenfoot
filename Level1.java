import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Level1 extends World
{
    private int timer = 1000;
    private boolean isKeyPressed; // declares boolean for if keys are pressed
    Shooter plane; // declares Shooter as an instance 
    Bullet bullet; //declares Bullet.class as an instance 
    Enemy enemy; // declares Enemy.class as an instance 
    Portal portal; // declares Portal.class as an instance 
    public Level1()
    {    
        super(550, 650, 1);
        showText("LEVEL ONE", 60, 30); // displays Game Over
        plane = new Shooter();
        addObject(plane, 275, 550); // adds Shooter at the bottom of the map
        GreenfootImage bg = new GreenfootImage("world1.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        for (int i=0; i<8; i++)
        {
            enemy = new Enemy();
            addObject(enemy, 165+i*40, 50); 
        }
        for (int i=0; i<12; i++)
        {
            enemy = new Enemy();
            addObject(enemy, 50+i*40, 100); 
        }
        for (int i=0; i<12; i++)
        {
            enemy = new Enemy();
            addObject(enemy, 50+i*40, 150); 
        }
    }
    public void act()
    {
        showText("time remaining :" + timer/100 + "s", 440, 30);
        checkKeys(); // declares checkKeys method
        if (getObjects(Enemy.class).isEmpty())
        {
            portal  = new Portal();
            addObject(portal, 275, 50);    
        }
        else if(--timer<0)
        {
            Greenfoot.setWorld(new GameOver(1));
        }
    }
    private void checkKeys()
    {
        // boolean to check if either direction was pressed
        isKeyPressed = false;
        if (Greenfoot.isKeyDown("right")) // if right was pressed, move Shooter right
        {
            plane.walkRight();
            isKeyPressed = true;
        }
        if (Greenfoot.isKeyDown("left"))//if left key was pressed, move Shooter left
        {
            plane.walkLeft();
            isKeyPressed = true;
        }
        if (Greenfoot.isKeyDown("down"))//if left key was pressed, move Shooter left
        {
            plane.walkDown();
            isKeyPressed = true;
        }
        if (Greenfoot.isKeyDown("up"))//if left key was pressed, move Shooter left
        {
            plane.walkUp();
            isKeyPressed = true;
        }
    }
}
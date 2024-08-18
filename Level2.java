import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Level2 extends World
{
    private int timer = 3000;
    private boolean isKeyPressed; // declares boolean for if keys are pressed
    Shooter plane; // declares Shooter as a 
    Bullet bullet;
    Enemy2 ufo;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        super(550, 650, 1);
        GreenfootImage bg = new GreenfootImage("images.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        showText("LEVEL TWO!", 60, 30); // displays Game Over
        plane = new Shooter();
        addObject(plane, 250, 500); // adds Shooter at the bottom of the map
        ufo = new Enemy2();
        addObject(ufo, 500 ,70);
        ufo = new Enemy2();
        addObject(ufo, 0 ,100);
        ufo = new Enemy2();
        addObject(ufo, 100 ,100);
        ufo = new Enemy2();
        addObject(ufo, 275, 10);
        ufo = new Enemy2();
        addObject(ufo, 550, 30);
        ufo = new Enemy2();
        addObject(ufo, 0, 50);
    }
    public void act()
    {
        showText("time remaining :" + timer/100 + "s", 440, 30);
        checkKeys(); // declares checkKeys method
        if (getObjects(Enemy2.class ).isEmpty())
        {
           Greenfoot.setWorld(new Level3());
        }
        if(--timer<0)
        {
            Greenfoot.setWorld(new GameOver(2));
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
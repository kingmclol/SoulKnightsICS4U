import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Drop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Drop extends SuperSmoothMover
{
    /**
     * Act - do whatever the Drop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public abstract void checkCollisionWithPlayer();
}

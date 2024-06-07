import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Drop
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void checkCollisionWithPlayer() {
        Player player = (Player) getOneIntersectingObject(Player.class);
        if (player != null) {
            player.activatePowerUp();
            getWorld().removeObject(this);
        }
    }
}

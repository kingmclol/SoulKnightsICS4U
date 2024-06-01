import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
/**
 * Write a description of class RoomEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoomEditor extends SuperWorld
{

    /**
     * Constructor for objects of class RoomEditor.
     * 
     */
    private Board board;
    //private String buildString = "16~12~w/f/f/f/f/f/f/f/f/f/f/f/f/f/f/w/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/w/f/f/f/f/f/f/f/f/f/f/f/f/f/f/w/";
    private String buildString = "16~12~w/f/f/f/f/f/f/f/f/f/f/f/f/f/f/w/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/w/f/f/f/w/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/w/w/w/w/w/f/f/f/f/f/f/f/f/f/f/f/f/w/w/w/w/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/w/f/f/w/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/f/w/f/f/f/f/f/f/f/f/f/f/f/f/f/f/w/";
    Cell a, b;
    public RoomEditor()
    {    
        super();
        board = new Board(16, 12);
        addObject(board, 0,0);
    }
    public void act(){
        super.act();
        // Vector mousePosition = Mouse.getPosition();
        // if (mousePosition != null) {
            // board.rayCastToEdges((int)mousePosition.getX(), (int)mousePosition.getY());
        // }
        String key = Greenfoot.getKey();
       
        if (Greenfoot.mouseClicked(null)) {
            Cell c = Mouse.getClickedActor(Cell.class);
            if (c != null) {
                if (c.getTile() instanceof Wall) {
                    c.setTile(new EmptyFloor());
                } else {
                    c.setTile(new Wall());
                }
                board.convertTileMapToEdges();
                board.drawEdges();
            }
        }
        
        if (",".equals(key)) {
            a = Mouse.getHoveredActor(Cell.class);
            
        }
        else if (".".equals(key)) {
            b = Mouse.getHoveredActor(Cell.class);
            if (a == null || b == null) {
                System.out.println("missing node");
                return;
            }
            ArrayList<Cell> path = (ArrayList<Cell>) board.findPath(a,b);
            if (path == null) {
                System.out.println("no path");
                return;
            }
            for (int i = 0; i < path.size(); i++) {
                Cell c = path.get(i);
                c.applyEffect(new FadeEffect(Color.ORANGE, Utility.clamp(300/(path.size()-i), 0, 255)));
            }
        } else if ("p".equals(key)) {
            board.outputBuildString();
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(board.getBuildString()), null);
        } else if ("/".equals(key)) {
            board.removeFromWorld();
            board = Room.getRandomBoard();
            addObject(board, 0,0);
        }
    }
}
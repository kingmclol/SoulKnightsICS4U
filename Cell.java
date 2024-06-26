import java.util.ArrayList;
import greenfoot.*;
/**
 * </p>The Cell is the manager of everything that can happen within one unit of the Board. It manages the addition of CellEffects.</p>
 * 
 * <p>Cells can contain variuos CellEffects that are overlayed onto the Cell which are basically temporary tiles</p>
 * 
 * <p>Other than basically being a container for the tile, node, and cellEffects, there isn't much other stuff</p>
 * 
 * @author Freeman Wang
 * @version 0.1
 */
public class Cell extends SuperActor
{
    private Node node;
    private ArrayList<CellEffect> cellEffects;
    private Tile tile;
    private int boardX, boardY;
    public static final int SIZE = 64;
    private Board board; // easy reference to the board.
    // Stores the edge data for north, south, east and west respectivively.
    // Names were not mine (but copied for convenience form the tutorial) which is why they're kind of out of standard.
    private boolean[] edgeExist;
    private int[] edgeID;
    /**
     * Creates a Cell with a Tile.
     * @param board The Board that the Cell belongs to.
     * @param boardX The x coordinate of this Cell on the Board.
     * @param boardY The y coordinate of this Cell on the Board.
     * @param t The Tile that this Cell should have.
     */
    public Cell(Board board, int boardX, int boardY, Tile t)
    {
        // Initialize variables.
        this.board = board; // prob can remove
        this.boardX = boardX;
        this.boardY = boardY;
        tile = t;
        t.setCell(this);
        cellEffects = new ArrayList<CellEffect>();
        setImage(new GreenfootImage(SIZE, SIZE));
        node = new Node(true, boardX, boardY);
        setWalkable(t.isWalkable());
    }
    /**
     * When the Cell is added to the World, it will automagically add all of its corresponding Effects and Entities and its Tile.
     */
    public void addedToWorld(World w) {
        w.addObject(tile, getX(), getY()); // Tile at the background,
        for (CellEffect effect : cellEffects) { // Add the effects on the tile,
            w.addObject(effect, getX(), getY());
        }
    }
    /**
     * Removes thie Cell and any celleffects along with it.
     */
    public void removeFromWorld() {
        World w = getWorld();
        w.removeObject(tile);
        for (CellEffect effect : cellEffects) {
            w.removeObject(effect);
        }
        w.removeObject(this);
    }
    public void act() {
    }
    /**
     * Given an CellEffect, apply that effect onto this Cell and add it to the World.
     * @param e The CellEffect to apply.
     */
    public void applyEffect(CellEffect e) {
        cellEffects.add(e);
        e.setCell(this);
        //e.applyEffect();
        if (getWorld() != null) getWorld().addObject(e, getX(), getY()); // check if this cell is in the world first
    }
    /**
     * Given a CellEffect, remove that effect from this Cell and the World.
     * @param e The CellEffect to remove.
     */
    public void removeEffect(CellEffect e) {
        cellEffects.remove(e);
        //e.removeEffect();
        if (e.getWorld() != null) getWorld().removeObject(e); // Check if the effect is in the world first
    }
    /**
     * Returns the Y coordinate of this Cell on the Board.
     */
    public int getBoardY() {
        return boardY;
    }
    /**
     * Returns the X coordinate of this Cell on the Board.
     */
    public int getBoardX() {
        return boardX;
    }
    /**
     * Returns the board of this cell
     */
    public Board getBoard() {
        return board;
    }
    /**
     * Returns the Node associated with this Cell.
     */
    public Node getNode() {
        node.setWalkable(isWalkable());
        return node;
    }
    /**
     * Set this Cell's node to be walkable or not. Unused.
     */
    public void setWalkable(boolean walkable) {
        node.setWalkable(walkable);
    }
    /**
     * Check this Cell's node if it is walkable.
     */
    public boolean isWalkable() {
        return node.isWalkable();
    }
    /**
     * Returns the tile of this cell
     */
    public Tile getTile(){
        return tile;
    }
    /**
     * Sets the tile in this cell to the given tile
     * @param t the new tile to use
     */
    public void setTile(Tile t) {
        setWalkable(t.isWalkable());
        getWorld().removeObject(tile);
        tile = t;
        t.setCell(this);
        if (t instanceof EmptyFloor) { // Enemies can spawn in this cell now.
            board.addValidSpawnCell(this);
        } else {
            board.removeValidSpawnCell(this);
        }
        getWorld().addObject(t, getX(), getY());
    }
    /**
     * Returns whether this contains a cell effect
     */
    public boolean containsCellEffect() {
        return (!cellEffects.isEmpty());
    }
    // ============================SHADOWCASTING METHODS but i gave up===========================================
    /**
     * Do not use.
     */
    public void setEdgeID(int direction, int id) {
        edgeID[direction] = id;
    }
    /**
     * Do not use.
     */
    public int getEdgeID(int direction) {
        return edgeID[direction];
    }
    /**
     * Do not use.
     */
    public void setEdgeExist(int direction, boolean exists) {
        edgeExist[direction] = exists;
    }
    /**
     * Do not use.
     */
    public boolean edgeExist(int direction) {
        return edgeExist[direction];
    }
    /**
     * Do not use.
     */
    public void clearEdgeData() {
        edgeID = new int[4];
        edgeExist = new boolean[4];
    }
}

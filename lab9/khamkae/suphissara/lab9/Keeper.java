package khamkae.suphissara.lab9;
/**
ID: 613040397-0
* Sec: 1
* Date:  Febuary 24, 2020
*
**/
import java.awt.geom.Rectangle2D;

public class Keeper extends Rectangle2D.Double {

    private static final long serialVersionUID = 1L;
    public final static int KEEPER_WIDTH = 20, 
    KEEPER_HEIGHT = 50; 
    KEEPER_SPEED = 10;

  
    Keeper(int x, int y) {
        super(x , y, KEEPER_WIDTH, KEEPER_HEIGHT);
    }

    public void moveUp() {
        if (y - KEEPER_SPEED >= 150){
            y = y - KEEPER_SPEED;
        }
    }
    public void moveDown() {
        if (y + KEEPER_HEIGHT + KEEPER_SPEED <= 350)  {
            y = y + KEEPER_SPEED;
        }
    }

}
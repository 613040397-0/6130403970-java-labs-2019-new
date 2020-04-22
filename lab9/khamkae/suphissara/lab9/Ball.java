package khamkae.suphissara.lab9;
/**
ID: 613040397-0
* Sec: 1
* Date:  Febuary 24, 2020
*
**/
import java.awt.geom.Ellipse2D;

class Ball extends Ellipse2D.Double {

    private static final long serialVersionUID = 1L;

    
    public final static int BALL_DIAMETER = 30;
    private int xVelocity, yVelocity;


    Ball(int x, int y) {
        super(x, y ,BALL_DIAMETER, BALL_DIAMETER);
        xVelocity = 0;
        yVelocity = 0;
    }
    Ball(int x, int y, int _xVelocity, int _yVelocity) {
        super(x, y ,BALL_DIAMETER, BALL_DIAMETER);
        xVelocity = _xVelocity;
        yVelocity = _yVelocity;
    }

   
    protected int get_x_velo() {
        return this.xVelocity;
    }
    protected void set_x_velo(int _xVelocity) {
       this.xVelocity = _xVelocity;
    }

    protected int get_y_velo() {
        return this.yVelocity;
    }
    protected void set_y_velo(int _yVelocity) {
       this.yVelocity = _yVelocity;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }
}

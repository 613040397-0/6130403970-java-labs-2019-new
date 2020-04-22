package khamkae.suphissara.lab9;
/**
ID: 613040397-0
* Sec: 1
* Date:  Febuary 24, 2020
*
**/
import khamkae.suphissara.lab7.*;
import java.awt.*;


public class CanvasDrawerV2 extends CanvasDrawerV1{
    
    private static final long serialVersionUID = 1L;
    protected Ball ball;
    protected Keeper keeperLeft, keeperRight;

    CanvasDrawerV2() {
        super();
        ball = new Ball((CANVAS_WIDTH/2) - (Ball.BALL_DIAMETER / 2), (CANVAS_HEIGHT / 2) - (Ball.BALL_DIAMETER / 2));
        keeperLeft = new Keeper(0, (CANVAS_HEIGHT/2) - (Keeper.KEEPER_HEIGHT/2));
        keeperRight = new Keeper(CANVAS_WIDTH - Keeper.KEEPER_WIDTH, (CANVAS_HEIGHT/2) - (Keeper.KEEPER_HEIGHT/2));
    }

    @Override 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;


        g2D.setColor(Color.ORANGE);
        g2D.fill(ball);


        g2D.setColor(Color.BLUE);
        g2D.fill(keeperLeft);


        g2D.setColor(Color.RED);
        g2D.fill(keeperRight);
    }

    
}
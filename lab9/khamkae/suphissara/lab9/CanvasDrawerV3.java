package khamkae.suphissara.lab9;
/**
ID: 613040397-0
* Sec: 1
* Date:  Febuary 24, 2020
*
**/
import java.util.Random;


public class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable {
    private static final long serialVersionUID = 1L;

    protected Thread running;
    protected Random randomx, randomy;
    protected int max = 2, min = -2;

    public CanvasDrawerV3() {
        super();
        running = new Thread(this);
        randomx = new Random();
        randomy = new Random();

        int xv = randomx.nextInt(max- min + 1) + min;
        int yv = randomy.nextInt(max- min + 1) + min;

       
        if (xv == 0 ) xv += 1 ;
        else if(yv == 0) yv += 1 ;

        this.ball.set_x_velo(-2);
        this.ball.set_y_velo(0);

        running.start();
    }

    @Override
    public void run() {
        while(true) {
            if (isHitVerticalWall()) {
               if (isNotHitGoal()) {
                changeXVelocity();
               }
            } 
            else if (isHitHorizontalWall()) {
               changeYVelocity();
            }

            ball.move();

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

    protected boolean isHitVerticalWall() {
        return ball.getX() <= 0 ||  ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH;
    }
    protected boolean isHitHorizontalWall() {
        return ball.getY() <= 0 || ball.getY() + Ball.BALL_DIAMETER >= CANVAS_HEIGHT;
    }
    protected boolean isNotHitGoal() {
        return ball.getY() + Ball.BALL_DIAMETER <= 150 || ball.getY() + Ball.BALL_DIAMETER >= 350;
    }

    protected void changeXVelocity() {
        int xVelocity = this.ball.get_x_velo();
        this.ball.set_x_velo(xVelocity * -1);
    }
   
    protected void changeYVelocity() {
        int yVelocity = this.ball.get_y_velo();
        this.ball.set_y_velo(yVelocity * -1);
    }
    
}
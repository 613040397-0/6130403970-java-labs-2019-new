package khamkae.suphissara.lab9;
/**
ID: 613040397-0
* Sec: 1
* Date:  Febuary 24, 2020
*
**/
public class CanvasDrawerV5 extends CanvasDrawerV4 {

    private static final long serialVersionUID = 1L;

    @Override
    public void run() {
        while(true) {
            if (isHitVerticalWall()) {
               if (isNotHitGoal()) {
                changeXVelocity();
               } 
            }else if (isHitHorizontalWall()) {
               changeYVelocity();
            }else if (isHitKeeperRight()) {
                changeXVelocity();
            } else if (isHitKeeperLeft()) {
                changeXVelocity();
            }
            
 
           if (isBallDissaper()) { 
                resetBall();
                setBallVelocity();
            }

            ball.move();
            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

  
    protected boolean isBallDissaper() {
        return ball.getX() > CANVAS_WIDTH || ball.getX() + Ball.BALL_DIAMETER < 0;
    }

    protected void setBallVelocity() {
        int xv = random_x.nextInt(maxVal - minVal + 1) + minVal;
        int yv = random_y.nextInt(maxVal - minVal + 1) + minVal;
        
	if (xv == 0 ) xv++ ;
        else if (yv == 0) yv++ ;
 
        this.ball.set_x_velo(xv);
        this.ball.set_y_velo(yv);
    }

    protected void resetBall() {
        ball.x = (CANVAS_WIDTH / 2) - (Ball.BALL_DIAMETER / 2);
        ball.y = (CANVAS_HEIGHT / 2) - (Ball.BALL_DIAMETER / 2);
        setBallVelocity();
    }

}
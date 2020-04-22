public class CanvasDrawerV4 extends CanvasDrawerV3 {

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
            }else if (isHitKeeperLeft()) {
                changeXVelocity();
            }

            ball.move();
            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

 
    protected boolean isHitKeeperRight() {
        return ball.getX()  + Ball.BALL_DIAMETER >= keeperRight.getX() 
            && ball.getY() + Ball.BALL_DIAMETER >= keeperRight.getY()
            && ball.getY() + Ball.BALL_DIAMETER <= keeperRight.getY() + Keeper.KEEPER_HEIGHT; 
    }
    protected boolean isHitKeeperLeft() {
        return ball.getX() <= keeperLeft.getX() + Keeper.KEEPER_WIDTH
            && ball.getY() + Ball.BALL_DIAMETER >= keeperLeft.getY()
            && ball.getY() + Ball.BALL_DIAMETER <= keeperLeft.getY() + Keeper.KEEPER_HEIGHT;
    }
}
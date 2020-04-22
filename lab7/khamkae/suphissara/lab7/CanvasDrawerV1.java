package khamkae.suphissara.lab7;
/**
ID: 613040397-0
* Sec: 1
* Date:  Febuary 11, 2020
*
**/
import javax.swing.*;
import java.awt.*;

public class CanvasDrawerV1 extends JPanel {
    private static final long serialVersionUID = 1L;
    
    protected int CANVAS_HEIGHT = 500, CANVAS_WIDTH = 800;
    protected int CIRCLE_RADIUS = 50, DOT_CIRCLE_RADIUS = 5;
    protected float LINE_WIDTH = 4.0f;
    private Color CANVAS_BACKGROUND = Color.green;

  	public void paintComponent(Graphics g) {
       		super.paintComponent(g);
        	Graphics2D g2D = (Graphics2D) g;
        	int width = this.getWidth();
        	int height = this.getHeight();
		g2D.setColor(Color.WHITE);
        	g2D.drawOval((width/2) - CIRCLE_RADIUS, (height/2) - CIRCLE_RADIUS, 
				CIRCLE_RADIUS * 2,CIRCLE_RADIUS * 2);
		g2D.setStroke(new BasicStroke(LINE_WIDTH));
        	g2D.setColor(Color.BLACK);
		g2D.drawLine(width/2, 0, width/2, height);
		g2D.drawRect(0, 80, 150, height - 160);
		g2D.drawRect(width -150 , 80, 150, height - 160);
		g2D.drawRect(0, 150, 60, height - 300);
		g2D.drawRect(width - 60, 150, 60, height - 300);
		g2D.fillOval(105 - DOT_CIRCLE_RADIUS, height/2 + DOT_CIRCLE_RADIUS, 
        	DOT_CIRCLE_RADIUS*2, DOT_CIRCLE_RADIUS*2);  
		g2D.fillOval(width - (113 - DOT_CIRCLE_RADIUS), height/2 + DOT_CIRCLE_RADIUS, 
        	DOT_CIRCLE_RADIUS*2, DOT_CIRCLE_RADIUS*2);  
    }
}
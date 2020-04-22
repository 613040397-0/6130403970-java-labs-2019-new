package khamkae.suphissara.lab7;
/**
ID: 613040397-0
* Sec: 1
* Date:  January 13, 2020
*
**/
import javax.swing.*;
import java.awt.*;
import khamkae.suphissara.lab6.*;
public class GraphicsMoverV1 extends MySimpleWindow {

    private static final long serialVersionUID = 1L;

    protected JPanel buttonpanel, newWindowpanel;
    protected CanvasDrawerV1 canvasDrawerV1;
    protected JButton moveUpbutton, moveDownbutton, moveLeftbutton, moveRightbutton, resetbutton;
    
    protected GraphicsMoverV1(String title) {
        super(title);
    }
    protected void initComponents() {
        canvasDrawerV1 = new CanvasDrawerV1();
        buttonpanel = new JPanel(new FlowLayout());
        newWindowpanel= new JPanel(new BorderLayout());
        moveUpbutton = new JButton("UP");
        moveDownbutton = new JButton("DOWN");
        moveLeftbutton = new JButton("LEFT");
        moveRightbutton = new JButton("RIGHT");
        resetbutton = new JButton("RESET");
    }

    protected void addComponents() {
        setLayout(new BorderLayout());
        buttonpanel.add(moveUpbutton);
        buttonpanel.add(moveDownbutton);
        buttonpanel.add(moveLeftbutton);
        buttonpanel.add(moveRightbutton);
        buttonpanel.add(resetbutton);

        newWindowpanel.add(canvasDrawerV1, BorderLayout.CENTER);
        newWindowpanel.add(buttonpanel, BorderLayout.PAGE_END);

       
        add( newWindowpanel);
    }
    public static void createAndShowGUI() {
        GraphicsMoverV1 gpmvV1 = new GraphicsMoverV1("Graphics Mover Version 1");
        gpmvV1.initComponents();
        gpmvV1.addComponents();
        gpmvV1.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}


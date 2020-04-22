package khamkae.suphissara.lab9;
/**
ID: 613040397-0
* Sec: 1
* Date:  Febuary 24, 2020
*
**/
import java.awt.*;
import javax.swing.SwingUtilities;

public class FootballGameV2 extends FootballGameV1 implements ActionListener, KeyListener{

    private static final long serialVersionUID = 1L;
    protected CanvasDrawerV4 canvasDrawerFBG;

    protected FootballGameV2(String title) {
        super(title);
        setFocusable(true);
        requestFocus();
    }

    protected void initComponents() {
        super.initComponents();
        canvasDrawerFBG = new CanvasDrawerV4();
    }
    
   
    protected void addComponents() {
        super.addComponents();
        newWindowpanel.remove(canvasDrawerV3);
        newWindow.add(canvasDrawerFBG, BorderLayout.CENTER);
    }
    
  
    protected void addListeners() {
        moveUpbutton.addActionListener(this);
        moveDownbutton.addActionListener(this);
        moveLeftbutton.addActionListener(this);
        moveRightbutton.addActionListener(this);

        this.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();

        if (object == moveUpbutton) {
            canvasDrawerFBG.keeperLeft.moveUp();
        } else if (object == moveDownbutton) {
            canvasDrawerFBG.keeperLeft.moveDown();
        } else if (object == moveLeftbutton) {
            canvasDrawerFBG.keeperRight.moveUp();
        } else if (object == moveRightbutton) {
            canvasDrawerFBG.keeperRight.moveDown();
        }

        requestFocus();
    }

	public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_UP) {
            canvasDrawerFBG.keeperRight.moveUp();
        } else if (key == KeyEvent.VK_DOWN) {
            canvasDrawerFBG.keeperRight.moveDown();
        } else if (key == KeyEvent.VK_W) {
            canvasDrawerFBG.keeperLeft.moveUp();
        } else if (key == KeyEvent.VK_S) {
            canvasDrawerFBG.keeperLeft.moveDown();
        }
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
    }


    public static void createAndShowGUI() {
        FootballGameV2 footballV2 = new FootballGameV2("Football Game V2");
        footballV2.initComponents();
        footballV2.addComponents();
        footballV2.addListeners();
        footballV2.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
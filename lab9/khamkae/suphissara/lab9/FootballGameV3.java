package khamkae.suphissara.lab9;
/**
ID: 613040397-0
* Sec: 1
* Date:  Febuary 24, 2020
*
**/
import javax.swing.SwingUtilities;

public class FootballGameV3 extends FootballGameV2 {

    private static final long serialVersionUID = 1L;

    protected FootballGameV3(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void initComponents() {
        super.initComponents();
        this.canvasDrawerFBG = new CanvasDrawerV5();
    }

    protected void addListeners() {
        super.addListeners();
        resetbutton.addActionListener(this);
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        
        Object object = e.getSource();

        if (object == resetbutton) {
            resetScore();
            ((CanvasDrawerV5) canvasDrawerFBG).resetBall();
        }
    }
    
    protected void resetScore() {
        khonkaenfield.setText("0");
        udonfield.setText("0");
    }
    
    public static void createAndShowGUI() {
        FootballGameV3 footballV3 = new FootballGameV3("Football Game V3");
        footballV3.initComponents();
        footballV3.addListeners();
        footballV3.addComponents();
        footballV3.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
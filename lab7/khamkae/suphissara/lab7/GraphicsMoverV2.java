package khamkae.suphissara.lab7;
/**
ID: 613040397-0
* Sec: 1
* Date:  January 13, 2020
*
**/
import java.awt.*;
import javax.swing.*;

public class GraphicsMoverV2 extends GraphicsMoverV1 {

    private static final long serialVersionUID = 1L;

    private Font serif20_font;
    protected JPanel scorepanel, scoreMainpanel;
    protected JLabel khonkaenlabel, udonlabel;
    protected JTextField khonkaenfield, udonfield;

  protected void initComponents() {
        super.initComponents();
        serif20_font = new Font("Serif", Font.BOLD, 20);
        scorepanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        khonkaen_abel = new JLabel("Khonkaen");
        udonlabel = new JLabel("Udon Thani");
   
	khonkaenfield = new JTextField();
        udonfield = new JTextField();

        this.setValues();
    }
   protected void setValues() {
	
        khonkaenlabel.setForeground(Color.BLUE);
        udonlabel.setForeground(Color.RED);
        
      
        khonkaenfield.setText("3");
        udonfield.setText("1");

       
        khonkaenlabel.setFont(serif20_font);
        udonlabel.setFont(serif20_font);
        khonkaenfield.setFont(serif20_font);
        udonfield.setFont(serif20_font);

      
    }
   protected GraphicsMoverV2(String title) {
        super(title);
    }

    protected void addComponents() {
        super.addComponents();

 	scorepanel.add(khonkaenlabel);
        scorepanel.add(khonkaenfield);
        scorepanel.add(udonlabel);
        scorepanel.add(udonfield);

        add(scorepanel, BorderLayout.NORTH);
    }
   public static void createAndShowGUI() {
        GraphicsMoverV2 gpmvV2 = new GraphicsMoverV2("Graphics Mover Version 2");
        gpmvV2.initComponents();
        gpmvV2.addComponents();
        gpmvV2.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
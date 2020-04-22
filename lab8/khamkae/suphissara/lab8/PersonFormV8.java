package khamkae.suphissara.lab8;
/**
ID: 613040397-0
* Sec: 1
* Date:  Febuary 17, 2020
*
**/
import java.awt.event.*;
import java.awt.Image;
import javax.swing.*;

public class PersonFormV8 extends PersonFormV7 {
    
    private static final long serialVersionUID = 1L;  
    protected ImageIcon runningicon,swimmingicon, tennisicon;

    protected PersonFormV8(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        //add image icon 
        runningicon = new ImageIcon("images/runner4.png");
        swimmingicon = new ImageIcon("images/swimmer.png");
        tennisicon = new ImageIcon("images/tennisracket.png");

        Image runningimage = runningicon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        Image swimmingimage = swimmingicon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        Image tennisimage = tennisicon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);

        runningicon = new ImageIcon(runningimage);
        swimmingicon = new ImageIcon(swimmingimage);
        tennisicon = new ImageIcon(tennisimage);

      
        if (srcObject == sportBox) {
            if (sportBox.getSelectedItem() == "Running") {
                JOptionPane.showMessageDialog(this, "Your sport is now change to " + 
						sportBox.getSelectedItem(),"Person Information" , JOptionPane.INFORMATION_MESSAGE, runningicon);

            } else if (sportBox.getSelectedItem() == "Swimming") {
                JOptionPane.showMessageDialog(this, "Your sport is now change to " + 
						sportBox.getSelectedItem(),"Person Information" , JOptionPane.INFORMATION_MESSAGE, swimmingicon);

            } else if (sportBox.getSelectedItem() == "Tennis") {
                JOptionPane.showMessageDialog(this, "Your sport is now change to " + 
						sportBox.getSelectedItem(),"Person Information" , JOptionPane.INFORMATION_MESSAGE, tennisicon);
            }
        }
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        sportBox.addActionListener(this);
    }

    public static void createAndShowGUI() {
        PersonFormV8 personForm8 = new PersonFormV8("Person Form V8");
        personForm8.addComponents();
        personForm8.addListeners();
        personForm8.addMenus();
        personForm8.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}
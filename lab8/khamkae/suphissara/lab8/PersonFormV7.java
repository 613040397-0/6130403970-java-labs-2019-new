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
pupublic class PersonFormV7 extends PersonFormV6 {
    private static final long serialVersionUID = 1L;


    protected ImageIcon studenticon, teachericon;
    
    protected PersonFormV7(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        studenticon = new ImageIcon("images/student.png");
        teachericon = new ImageIcon("images/teacher.png");
        Image studentimage = studenticon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image teacherimage = teachericon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        studenticon = new ImageIcon(studentimage);
        teachericon = new ImageIcon(teacherimage);
        
        if (srcObject == studentradio) {
            JOptionPane.showMessageDialog(this, "Type : student has been selected",
					 "Person Information", JOptionPane.INFORMATION_MESSAGE, studenticon);
        } else if (srcObject == teacherradio) {
            JOptionPane.showMessageDialog(this, "Type : teacher has been selected", "Person Information",
					 JOptionPane.INFORMATION_MESSAGE, teachericon);
        }
    }    

    protected void addListeners() {
        super.addListeners();
        studentradio.addActionListener(this);
        teacherradio.addActionListener(this);
    }
    
    public static void createAndShowGUI() {
        PersonFormV7 personForm7 = new PersonFormV7("Person Form V7");
        personForm7.addComponents();
        personForm7.addListeners();
        personForm7.addMenus();
        personForm7.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}
package khamkae.suphissara.lab10;
/**
ID: 613040397-0
* Sec: 1
* Date:  March 7, 2020
*
**/
import khamkae.suphissara.lab8.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;


public class PersonFormV11 extends PersonFormV10 {
   
    private static final long serialVersionUID = 1L;
    protected JMenuItem customMI;
    protected JFileChooser fileChooser;

    protected PersonFormV11(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void initComponents() {
        super.initComponents();
        customMI = new JMenuItem("Custom");
        fileChooser = new JFileChooser();
    }

    protected void addMenus() {
        super.addMenus();
        colorMI.add(customIM);
    }

  
    protected void addComponents() {
        super.addComponents();
        addMenus();
    }
    
 
    protected void addListeners() {
        super.addListeners();
        customMI.addActionListener(this);
        openMI.addActionListener(this);
        saveMI.addActionListener(this);
        exitMI.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object sObject = e.getSource();

    
        if (sObject == customMI) {
            Color color = JColorChooser.showDialog(this, "Choose a color", Color.BLACK);
            
            nameTextField.setForeground(color);
            heightTextField.setForeground(color);
            weightTextField.setForeground(color);
            birthTextField.setForeground(color);
            noteArea.setForeground(color);
        } 

        if (sObject == openMI) {
            openFile();
        }
        
   
        if (sObject == saveMI) {
            saveFile();
        }

     
        if (sObject == exitMI) {
            System.exit(0);
        }
    }

    protected void openFile() {
        int returnVal = file_chooser.showOpenDialog(PersonFormV11.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(this, "Opening file " + file.getName(), "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Open command cancelled by user.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    protected void saveFile() {
        int returnVal = fileChooser.showSaveDialog(PersonFormV11.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(this, "Saving file " + file.getName(), "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Open command cancelled by user.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

   
    public static void createAndShowGUI() {
        PersonFormV11 personForm11 = new PersonFormV11("Person Form V11");
        personForm11.addComponents();
        personForm11.addListeners();
        personForm11.addKeys();
        personForm11.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}
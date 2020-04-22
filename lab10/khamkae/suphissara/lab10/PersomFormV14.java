package khamkae.suphissara.lab10;
/**
ID: 613040397-0
* Sec: 1
* Date:  March 7, 2020
*
**/
import java.io.*;
import java.swing.*;

public class PersonFormV14 extends PersonFormV13 {

    private static final long serialVersionUID = 1L;

    protected PersonFormV14(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }
   
    // open file method
    protected void openFile() {
        int returnVal = fileChooser.showOpenDialog(this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
             
                File file = fileChooser.getSelectedFile();
                FileInputStream file_input = new FileInputStream(file);
                ObjectInputStream object_input = new ObjectInputStream(file_input);
                JOptionPane.showMessageDialog(this, object_input.readObject());
                
            } catch (Exception e) {
                System.out.println("*********error*********");
            }
            
        }
        else if (returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Open command cancelled by user.");
        }
    }
    
    //save file method.
    protected void saveFile() {
        int returnVal = file_chooser.showSaveDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                FileOutputStream file_output = new FileOutputStream(file);
                ObjectOutputStream object_output = new ObjectOutputStream(file_output);
                String line = "";
                for (Person person : person_list) {
                    line += person + "\n";
                }
                object_output.writeObject(line);
                
                file_output.close();
                object_output.close();
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        } else if (returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Open command cancelled by user.");
        }
    }

    
    
    //run which create and show GUI
    public static void createAndShowGUI() {
        PersonFormV14 personForm14 = new PersonFormV14("Person Form V14");
        personForm14.addComponents();
        personForm14.addListeners();
        personForm14.addKeys();
        personForm14.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}
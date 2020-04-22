package khamkae.suphissara.lab8;
import khamkae.suphissara.lab6.*;
import java.awt.event.*;
import java.awt.Image;
import javax.swing.*;
public class PersonFormV6 extends PersonFormV5 implements ActionListener {
    private static final long serialVersionUID = 1L;
    
    protected Object srcObject; .
    protected ImageIcon dialogicon;  

    protected PersonFormV6(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void addListeners() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        srcObject = e.getSource();

       
        if (srcObject.equals(okButton)) {
            handleOkButton();
        } else if (srcObject == cancelButton) {
            this.setText();
        }
    }

    protected String getOkButtonInfo() {
       
        dialogicon = new ImageIcon("images/message_dialog.png");
        Image dialogimage = dialogicon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        dialogicon = new ImageIcon(dialogimage);
      
        String hobby = "";  
        int hobby_selected[] = hobbieValues.getSelectedIndices();
        for (int i : hobby_selected) {
            hobby += PersonFormV6.hobbies[i] + " ";
        }
       
        String type = "";  
        if (studentradio.isSelected()) {
            type = "Student";
        } else if (teacherradio.isSelected()) {
            type = "Teacher";
        }
        String info = "";
        info += "Name : " + nameTextField.getText();
        info += "\n" + "Height (cm.): " + heightTextField.getText();
        info += "\n" + "Weigth (km.) : " + weightTextField.getText();
        info += "\n" + "Date of birth : " + birthTextField.getText();
        info += "\n" + "Type : " + type;
        info += "\n" + "Sport : " + sportBOX.getSelectedItem();
        info += "\n" + "Hobbies : " + hobby;
        info += "\n" + "Note : " + noteArea.getText();

        return info;  

    protected void handleOkButton() {
        String info = getOkButtonInfo();
        JOptionPane.showMessageDialog(this, info, "Person Information", JOptionPane.INFORMATION_MESSAGE, dialogicon);
    }
    
    protected void setText() {
        nameTextField.setText("");
        heightTextField.setText("");
        weightTextField.setText("");
        birthTextField.setText("");
        noteArea.setText("");
    }

    public static void createAndShowGUI() {
        PersonFormV6 personForm6 = new PersonFormV6("Person Form V6");
        personForm6.addComponents();
        personForm6.addListeners();
        personForm6.addMenus();
        personForm6.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
    
}
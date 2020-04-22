package khamkae.suphissara.lab10;
/**
ID: 613040397-0
* Sec: 1
* Date:  March 7, 2020
*
**/

public class PersonFormV13 extends PersonFormV12 {

    private static final long serialVersionUID = 1L;

  
    private String message = "";
    private double MIN_DAY = 1, MAX_DAY = 31, MIN_MONTH = 1, MAX_MONTH = 12, 
    MIN_YEAR = 1900, MAX_YEAR = 2010,MIN_HEIGHT = 100, MAX_HEIGHT = 250, MIN_WEIGHT = 40, MAX_WEIGHT = 150 ;
    
    protected PersonFormV13(String title) {
        super(title);
       
    }

    
    public void actionPerformed(ActionEvent e) {
        Object sObject = e.getSource();

        if (sObject == okButton) {
            if (textBoxAlert()) {
                message = "";
                return;
            }
        }
        super.actionPerformed(e);
    }

    protected boolean textBoxAlert() {

     
        if (nameTextField.getText() == null) {
            message += "Please enter name. \n";
        }


        checkDecimalException(heightTextField.getText(), "height", MIN_HEIGHT, MAX_HEIGHT);

    
        checkDecimalException(weightTextField.getText(), "weight", MIN_WEIGHT, MAX_WEIGHT);

     
        String dob[] = birthTextField.getText().split("-");
        if (dob.length != 3) {
            message += "Please enter date. \n";
        } 
        else {
        
            checkDecimalException(dob[0], "day", MIN_DAY, MAX_DAY);
            checkDecimalException(dob[1], "month", MIN_MONTH, MAX_MONTH);
            checkDecimalException(dob[2], "year", MIN_YEAR, MAX_YEAR);
        }

        if (message == null ) {
            return false;  
        }

        JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);

        return true;
    }

    protected void checkDecimalException(String box_text, String name, double min_value, double max_value) {
        try {
            Double figure = Double.parseDouble(box_text);

            if (figure < min_value || figure > max_value) {
                message += String.format("Valid values for " + name + " are [%.2f, %.2f] \n", min_value, max_value);
            }

        } catch (NumberFormatException e) {
            message += "Please enter only numeric input for " + name + ". \n";
        }
    }

 
   
    //RUN TO CREATE AND SHOW GUI
    public static void createAndShowGUI() {
        PersonFormV13 personForm13 = new PersonFormV13("Person Form V13");
        personForm13.addComponents();
        personForm13.addListeners();
        personForm13.addKeys();
        personForm13.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }   
}
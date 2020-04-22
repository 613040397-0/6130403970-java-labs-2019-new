package khamkae.suphissara.lab6;

/* Name:Suphissara Khamkae
 * section : 2
 * ID : 613040397-0
 * Date: 6/2/2020
 *
 */
import java.awt.Color;
import java.awt.Font;
 
import javax.swing.SwingUtilities;
 
public class PersonFormV5 extends PersonFormV4 {

	private static final long serialVersionUID = -3169128892069577251L;
	protected Font font14Plain = new Font("Serif", Font.PLAIN, 14);
    protected Font font14Bold = new Font("Serif", Font.BOLD, 14);
 
    public PersonFormV5(String title) {
        super(title);
    }
     
    protected void initComponents() {
        super.initComponents();
        hobbiesLabel.setFont(font14Plain);
        noteLabel.setFont(font14Plain);
        typeLabel.setFont(font14Plain);
        nameLabel.setFont(font14Plain);
        heightLabel.setFont(font14Plain);
        weightLabel.setFont(font14Plain); 
        dateLabel.setFont(font14Plain);
        typeLabel.setFont(font14Plain);
         
        nameTxtField.setFont(font14Bold);
        heightTxtField.setFont(font14Bold);
        weightTxtField.setFont(font14Bold);
        dateTxtField.setFont(font14Bold);
        noteTxtArea.setFont(font14Bold);
         
        nameTxtField.setText("Manee");
        heightTxtField.setText("160");
        weightTxtField.setText("55");
        dateTxtField.setText("02-02-2000");
        sportBox.setSelectedItem("Running");
        cancelButton.setForeground(Color.RED); 
        okButton.setForeground(Color.BLUE);
    }
     
    public static void createAndShowGUI(){
        PersonFormV5 PersonFormV5 
                = new PersonFormV5("Person Form V5");
        PersonFormV5.addComponents();
        PersonFormV5.addMenus();
        PersonFormV5.setFrameFeatures();
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
package khamkae.suphissara.lab6;

/**This program create window which have two button ; ok botton , cancel botton .
  * This program have five textfield ;  name , weight ,height , price .
  * Moreover ,this program extends form MySimpleWindow
 * Name: Suphissara Khamkae
 * section : 2
 * ID : 613040397-0
 * Date: 6/2/2020
 *
 */
import java.awt.*;
import javax.swing.*;
public class PersonFormV1 extends MySimpleWindow {

    private static final long serialVersionUID = 1L;
    protected JLabel nameLabel, heightLabel, weightLabel, dateLabel, typeLabel;
	protected JTextField nameTxtField, heightTxtField, weightTxtField, dateTxtField;
	protected JPanel namePanel, heightPanel, weightPanel, datePanel, typePanel;
	protected JPanel overallPanel, textsPanel, typeChoicesPanel;
	protected JRadioButton student, teacher;
	protected ButtonGroup type;
	public final static int TXTFIELD_WIDTH = 15;

	public PersonFormV1(String title) {
		super(title);
	}

	protected void initComponents() {
		namePanel = new JPanel(new GridLayout(1, 2));
		heightPanel = new JPanel(new GridLayout(1, 2));
		weightPanel = new JPanel(new GridLayout(1, 2));
		datePanel = new JPanel(new GridLayout(1, 2));
		typePanel = new JPanel(new GridLayout(1, 2));
		typeChoicesPanel = new JPanel();
		nameLabel = new JLabel(" Name:");
		nameTxtField = new JTextField(TXTFIELD_WIDTH);
		heightLabel = new JLabel("Height(c.m):");
		heightTxtField = new JTextField(TXTFIELD_WIDTH);
		weightLabel = new JLabel("Weight (kg.):");
		weightTxtField = new JTextField(TXTFIELD_WIDTH);
		dateLabel = new JLabel("Date of birth (eg.,31-10-1990) :");
		dateTxtField = new JTextField(TXTFIELD_WIDTH);
		typeLabel = new JLabel("Type :");
		student = new JRadioButton("Student");
		teacher = new JRadioButton("Teacher");
		type = new ButtonGroup();
		type.add(student);
		type.add(teacher);
		textsPanel = new JPanel(new GridLayout(5, 1));
		overallPanel = new JPanel(new BorderLayout());
	}

	protected void setLabelTxtField(JPanel panel, JLabel label, JTextField txtField) {
		panel.add(label);
		panel.add(txtField);
	}

	protected void addComponents() {
		super.addComponents();
		initComponents();
		setLabelTxtField(namePanel, nameLabel, nameTxtField);
		setLabelTxtField(heightPanel, heightLabel, heightTxtField);
		setLabelTxtField(weightPanel, weightLabel, weightTxtField);
		setLabelTxtField(datePanel, dateLabel, dateTxtField);
		typePanel.add(typeLabel);
		typeChoicesPanel.add(student);
		typeChoicesPanel.add(teacher);
		typePanel.add(typeLabel);
		typePanel.add(typeChoicesPanel);
		textsPanel.add(namePanel);
		textsPanel.add(heightPanel);
		textsPanel.add(weightPanel);
		textsPanel.add(datePanel);
		textsPanel.add(typePanel);
		overallPanel.add(textsPanel, BorderLayout.NORTH);
		overallPanel.add(buttonsPanel, BorderLayout.SOUTH);
		setContentPane(overallPanel);
	}

	public static void createAndShowGUI() {
		PersonFormV1 personFormV1 = 
				new PersonFormV1(" Person Form V1 ");
		personFormV1.addComponents();
		personFormV1.setFrameFeatures();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
package khamkae.suphissara.lab6;
/**This program create window which have two button ; ok botton , cancel botton .
 * This program have five textfield ;  name , height ,weight and type
 * and import ComboBox for make a selection fill .
 * Moreover ,this program extends form PersonFormV1
*  Name:Suphissara Khamkae
* section : 2
* ID : 613040397-0
* Date: 6/2/2020
*
*/

import java.awt.*;
import javax.swing.*;

public class PersonFormV2 extends PersonFormV1 {
    private static final long serialVersionUID = 1L;
    protected JTextArea noteTxtArea;
	protected JScrollPane noteScrollPane;
	protected JPanel notePanel, contentPanel, sportPanel;
	protected JLabel noteLabel, sportLabel;
	protected JComboBox<String> sportBox;
	protected String[] sportsValues = { "Running", "Swimming", "Tennis" };

	public final static int NUM_TXTAREA_ROWS = 2;
	public final static int NUM_TXTAREA_COLS = 35;

	public PersonFormV2(final String title) {
        super(title);
    }

    protected void initComponents() {
        super.initComponents();
        noteTxtArea = new JTextArea(NUM_TXTAREA_ROWS, NUM_TXTAREA_COLS);
        noteTxtArea.setLineWrap(true);
        noteTxtArea.setWrapStyleWord(true);
        noteTxtArea.setText(
                "21st Century skills include Critical thinking, Creativity, Collaboration, Communication, etc");
        // To add more text use : noteTxtArea.append("");\\
        noteScrollPane = new JScrollPane(noteTxtArea);
        notePanel = new JPanel(new BorderLayout());
        contentPanel = new JPanel(new BorderLayout());
        sportPanel = new JPanel(new GridLayout(1, 2));
        noteLabel = new JLabel("note:");
        sportLabel = new JLabel("sport:");
        sportBox = new JComboBox<String>(sportsValues);
    }

    protected void addComponents() {
        super.addComponents();
        notePanel.add(noteLabel, BorderLayout.NORTH);
        notePanel.add(noteScrollPane, BorderLayout.SOUTH);
        sportPanel.add(sportLabel);
        sportPanel.add(sportBox);
        contentPanel.add(textsPanel, BorderLayout.NORTH);
        contentPanel.add(sportPanel, BorderLayout.CENTER);
        contentPanel.add(notePanel, BorderLayout.SOUTH);
        overallPanel.add(contentPanel, BorderLayout.NORTH);
    }

    public static void createAndShowGUI() {
        PersonFormV2 PersonFormV2 
                = new PersonFormV2("Person Form V2");
        PersonFormV2.addComponents();
        PersonFormV2.setFrameFeatures();
    }

    public static void main(final String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
    }
}
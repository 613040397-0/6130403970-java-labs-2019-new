package khamkae.suphissara.lab6;

/**This program create window which have two button ; ok botton , cancel botton .
 * This program have five textfield ;  name , height ,weight and type
 * and import ComboBox for make a selection fill . import JMenuBar to create Menu bar 
 * Moreover ,this program extends form PersonFormV1
*  Name:Suphissara Khamkae
* section : 2
* ID : 613040397-0
* Date: 6/2/2020
*
*/
import java.awt.*;
import javax.swing.*;

public class PersonFormV3 extends PersonFormV2 {

    private static final long serialVersionUID = 1L;
    protected JList<String> hobbies;
	protected String[] hobbieValues = { "Reading", "Taveling", "Cooking", "Photography" };
	protected JMenuBar menuBar;
	protected JMenu fileMenu, configMenu;
	protected JMenuItem newMI, openMI, saveMI, exitMI, colorMI, sizeMI;
	protected int NUM_VISIBLE_ROWS = 2;
	protected JPanel hobbiesPanel, comboListPanel;
	protected JLabel hobbiesLabel;

    public PersonFormV3(String title) {
		super(title);
	}

	protected void initComponents() {
		super.initComponents();
		hobbies = new JList<String>(hobbieValues);
		hobbies.setVisibleRowCount(NUM_VISIBLE_ROWS);
		hobbiesLabel = new JLabel("hobbies:");
		hobbiesPanel = new JPanel(new GridLayout(1, 2));
		comboListPanel = new JPanel(new GridLayout(2, 1));
	}

	protected void addComponents() {
		super.addComponents();
		hobbiesPanel.add(hobbiesLabel);
		hobbiesPanel.add(hobbies);
		contentPanel.remove(typePanel);
		comboListPanel.add(typePanel);
		comboListPanel.add(hobbiesPanel);
		contentPanel.add(comboListPanel, BorderLayout.CENTER);
	}

	protected void addMenus() {
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		configMenu = new JMenu("Config");
		newMI = new JMenuItem("New");
		openMI = new JMenuItem("Open");
		saveMI = new JMenuItem("Save");
		exitMI = new JMenuItem("Exit");
		colorMI = new JMenuItem("Color");
		sizeMI = new JMenuItem("Size");
		fileMenu.add(newMI);
		fileMenu.add(openMI);
		fileMenu.add(saveMI);
		fileMenu.add(exitMI);
		configMenu.add(colorMI);
		configMenu.add(sizeMI);
		menuBar.add(fileMenu);
		menuBar.add(configMenu);
		setJMenuBar(menuBar);
	}

	public static void createAndShowGUI() {
		PersonFormV3 personformv3 
				= new PersonFormV3(" Person Form V3");
		personformv3.addComponents();
		personformv3.addMenus();
		personformv3.setFrameFeatures();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
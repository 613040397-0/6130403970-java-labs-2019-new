package khamkae.suphissara.lab6 ;



/**This program create window which have two button ; ok botton , cancel botton . 
 * Name: Suphissara Khamkae
 * section : 2
 * ID : 613040397-0
 * Date: 6/2/2020
 * 
 */

import java.awt.*;
import javax.swing.*;
class MySimpleWindow extends JFrame{

	private static final long serialVersionUID = 1L;
    protected JButton okButton;
		protected JButton cancelButton;
		protected JPanel namePanel;
		protected JPanel buttonsPanel;
		protected JPanel windowPanel;
		public MySimpleWindow(String title) {
			super(title);
		}

		protected void addComponents() {
			okButton = new JButton("ok");
			cancelButton = new JButton("cancel");
			buttonsPanel = new JPanel(new FlowLayout());
			namePanel = new JPanel();
			buttonsPanel.add(cancelButton);
			buttonsPanel.add(okButton);
			windowPanel = (JPanel) this.getContentPane();
			windowPanel.setLayout(new BorderLayout());
			windowPanel.add(namePanel, BorderLayout.NORTH);
			windowPanel.add(buttonsPanel, BorderLayout.SOUTH);
		}
		
		protected void setFrameFeatures() {
			this.setLocationRelativeTo(null);
			pack();
			setVisible(true);
			}
			
			public static void createAndShowGUI() {
			MySimpleWindow msw = new MySimpleWindow("My Simple Window");
			msw.addComponents();
			msw.setFrameFeatures();
			}

			public static void main(String[] args) {
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							createAndShowGUI();
						}
					});
	}
}
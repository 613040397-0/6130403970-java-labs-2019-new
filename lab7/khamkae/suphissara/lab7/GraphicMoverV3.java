package khamkae.suphissara.lab7;
/**
ID: 613040397-0
* Sec: 1
* Date:  January 13, 2020
*
**/
import javax.swing.*;
import java.awt.*;
public class GraphicsMoverV3 extends GraphicsMoverV2 {

    private static final long serialVersionUID = 1L;
    protected JMenuBar menuBar;  
    protected JMenu filemenu;  
    protected JMenuItem openitem, saveitem, quititem; 
    protected ImageIcon openicon;  

    protected GraphicsMoverV3(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

     protected void initComponents() {
        super.initComponents();
        menuBar = new JMenuBar();
        filemenu = new JMenu("File");
        openitem = new JMenuItem("Open");
        saveitem = new JMenuItem("Save");
        quititem = new JMenuItem("Quit");
        openicon = new ImageIcon("images/open.png");
    }    

     protected void addComponents() {
        super.addComponents();
        addMenus();
    }

     protected void setIcon() {
        Image openimage = openicon.getImage().getScaledInstance(22, 22, Image.SCALE_SMOOTH);
        openicon = new ImageIcon(openimage);
        openitem.setIcon(openicon);
    }

    protected void addMenus() {   
        setIcon();
        menuBar.add(file_menu);
        filemenu.add(openitem);
        filemenu.add(saveitem);
        filemenu.add(quititem);
        setJMenuBar(menuBar);
	//add Menuitem to file menu 

    }
    
    public static void createAndShowGUI() {
        GraphicsMoverV3 gpmvV3 = new GraphicsMoverV3("Graphics Mover Version 3");
        gpmvV3.initComponents();
        gpmvV3.addComponents();
        gpmvV3.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
package khamkae.suphissara.lab8;
/**
ID: 613040397-0
* Sec: 1
* Date:  Febuary 17, 2020
*
**/
public class PersonFormV10 extends PersonFormV9 {
    private static final long serialVersionUID = 1L;
    protected PersonFormV10(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void setColor(Color color) {
        nameTextField.setForeground(color);
        heightTextField.setForeground(color);
        weightTextField.setForeground(color);
        birthTextField.setForeground(color);
        noteTxtArea.setForeground(color);
    }

    protected void setFontSize(int size) {
        Font font = new Font("Serif", Font.BOLD, size);
        nameTextField.setFont(font);
        heightTextField.setFont(font);
        weightTextField.setFont(font);
        birthTextField.setFont(font);
        noteTxtArea.setFont(font);
    }

    protected void addKeys() {
        redMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        greenMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        blueMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        size16MI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK));
        size20MI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.CTRL_MASK));
        size24MI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.CTRL_MASK));

     
        red_item.setMnemonic(KeyEvent.VK_R);
        green_item.setMnemonic(KeyEvent.VK_G);
        blue_item.setMnemonic(KeyEvent.VK_B);
        size16MI.setMnemonic(KeyEvent.VK_1);
        size20MI.setMnemonic(KeyEvent.VK_0);
        size24MI.setMnemonic(KeyEvent.VK_4);
        configMenu.setMnemonic(KeyEvent.VK_C);
        colorMenu.setMnemonic(KeyEvent.VK_L);
        sizeMenu.setMnemonic(KeyEvent.VK_Z);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (srcObject == redMI) {
            this.setColor(Color.RED);
        } else if (srcObject == greenMI) {
            this.setColor(Color.GREEN);
        } else if (srcObject == blueMI) {
            this.setColor(Color.BLUE);
        } 

  
        if (srcObject == size16MI) {
            this.setFontSize(16);
        } else if (srcObject == size20MI) {
            this.setFontSize(20);
        } else if (srcObject == size24MI) {
            this.setFontSize(24);
        }
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        redMI.addActionListener(this);
        greenMI.addActionListener(this);
        blueMI.addActionListener(this);
        size16MI.addActionListener(this);
        size20MI.addActionListener(this);
        size24MI.addActionListener(this);
    }

    public static void createAndShowGUI() {
        PersonFormV10 personForm10 = new PersonFormV10("Person Form V10");
        personForm10.addComponents();
        personForm10.addListeners();
        personForm10.addMenus();
        personForm10.addKeys();
        personForm10.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}
package khamkae.suphissara.lab8;
/**
ID: 613040397-0
* Sec: 1
* Date:  Febuary 17, 2020
*
**/
public class PersonFormV9 extends PersonFormV8 implements ListSelectionListener {

    private static final long serialVersionUID = 1L;

    protected ImageIcon readingicon, travellingicon, cookingicon, photographyicon;

    protected PersonFormV9(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void addListeners() {
        super.addListeners();
        hobbieValues.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // TODO Auto-generated method stub

        readingicon = new ImageIcon("images/book.png");
        travellingicon = new ImageIcon("images/suitcases.png");
        cookingicon = new ImageIcon("images/dish.png");
        photographyicon = new ImageIcon("images/camera.png");
        Image readingimage = readingicon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        Image travellingimage = travellingicon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        Image cookingimage = cookingicon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        Image photogaphyimage = photographyicon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        readingicon = new ImageIcon(readingimage);
        travellingicon = new ImageIcon(travellingimage);
        cookingicon = new ImageIcon(cookingimage);
        photographyicon = new ImageIcon(photogaphyimage);

        int hobby_selected[] = hobbieValues.getSelectedIndices();
        for (int i : hobby_selected) {
            if (hobbies[i] == "Reading") {
                JOptionPane.showMessageDialog(this, "Selected Hobbies : " + hobbies[i], "Person Information", JOptionPane.INFORMATION_MESSAGE, readingicon);
            } else if (hobbies[i] == "Tavelling") {
                JOptionPane.showMessageDialog(this, "Selected Hobbies : " + hobbies[i], "Person Information", JOptionPane.INFORMATION_MESSAGE, travellingicon);
            } else if (hobbies[i] == "Cooking") {
                JOptionPane.showMessageDialog(this, "Selected Hobbies : " + hobbies[i], "Person Information", JOptionPane.INFORMATION_MESSAGE, cookingicon);
            } else if (hobbies[i] == "Photogaphy") {
                JOptionPane.showMessageDialog(this, "Selected Hobbies : " + hobbies[i], "Person Information", JOptionPane.INFORMATION_MESSAGE, photographyicon);
            }
        }
    }

    public static void createAndShowGUI() {
        PersonFormV9 personForm9 = new PersonFormV9("Person Form V9");
        personForm9.addComponents();
        personForm9.addListeners();
        personForm9.addMenus();
        personForm9.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}

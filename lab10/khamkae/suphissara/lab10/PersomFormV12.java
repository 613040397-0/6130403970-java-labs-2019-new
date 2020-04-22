package khamkae.suphissara.lab10;
/**
ID: 613040397-0
* Sec: 1
* Date:  March 7, 2020
*
**/

import java.awt.event.*;
import java.time.*;
import java.util.*;
import javax.swing.*;

public class PersonFormV12 extends PersonFormV11{
   
    private static final long serialVersionUID = 1L;
    protected JMenu datamenu;
    protected JMenuItem displayMI, sortMI, searchMI, removeMI;
    protected ArrayList<Person> person_list;
    private Person person;

    protected PersonFormV12(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void initComponents() {
        super.initComponents();
        datamenu = new JMenu("Data");
        displayMI = new JMenuItem("Display");
        sortMI = new JMenuItem("Sort");
        searchMI = new JMenuItem("Search");
        removeMI = new JMenuItem("Remove");
        personMI = new ArrayList<Person>();
    }

    protected void addMenus() {
        super.addMenus();
        datamenu.add(displayMI);
        datamenu.add(sortMI);
        datamenu.add(searchMI);
        datamenu.add(removeMI);
        menuBar.add(datamenu);
    }

    protected void addComponents() {
        super.addComponents();
        addMenus();
    }

  
    protected void addListeners() {
        super.addListeners();
        displayMI.addActionListener(this);
        sortMI.addActionListener(this);
        searchMI.addActionListener(this);
        removeMI.addActionListener(this);
    }

    
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object sObject = e.getSource();

        if (sObject == displayMI) {
            showPersonList();
        } else if (sObject == sortMI) {
            sortPersonList();
            showPersonList();
        } else if (sObject == searchMI) {
            searchPersonList();
        } else if (sObject == removeMI) {
            removePersonList();
        }
    }

    

    protected void handleOkButton() {
        createPerson();

        person_list.add(person);  

        String info = getOkButtonInfo();
        info += "\n" + "\n" + "Adding this person into the list : " + person;
        JOptionPane.showMessageDialog(this, info, "Person Information", JOptionPane.INFORMATION_MESSAGE, dialogicon);
    }

    protected void showPersonList() {
        String list = "";
        for (Person person : person_list) {
            list += person + "\n";
        }
        JOptionPane.showMessageDialog(this, list, "Person List", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void sortPersonList() {
        Collections.sort(person_list);
    }

    protected void searchPersonList() {
        String name = JOptionPane.showInputDialog("Please enter a person name to search : ");
        Person person = searchName(name);

        if (person != null) {
            JOptionPane.showMessageDialog(this, person + " is found.", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, name + " is not found.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    protected void removePersonList() {
        String name = JOptionPane.showInputDialog("Please enter a person name to remove : ");
        Person person = searchName(name);

        if (person != null) {
            person_list.remove(person);
            JOptionPane.showMessageDialog(this, person + " is remove.", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, name + " is not found.", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
    }

    protected Person searchName(String name) {
        for (Person person : person_list) {
            if (person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }
    
    

    protected void createPerson() {
    
        String name = nameTextField.getText();
        double height = Double.parseDouble(heightTextField.getText());
        double weight = Double.parseDouble(weightTextField.getText());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(birthTextField.getText(), formatter);
        person = new Person(name, weight, height, dob);
    }

    public static void createAndShowGUI() {
        PersonFormV12 personForm12 = new PersonFormV12("Person Form V12");
        personForm12.addComponents();
        personForm12.addListeners();
        personForm12.addKeys();
        personForm12.setFrameFeatures();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }   
}
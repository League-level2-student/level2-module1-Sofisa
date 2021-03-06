package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	void createGUI() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	addName = new JButton();
	addName.addActionListener(this);
	view = new JButton();
	view.addActionListener(this);
	addName.setText("Add Name");
	view.setText("View Names");
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(addName);
	panel.add(view);
	frame.pack();
	names = new ArrayList<String>();
	names.add ("Bob Banders");
	names.add ("Sandy Summers");
	names.add("Greg Ganders");
	names.add("Donny Doners");
		
	}
	JButton addName;
	JButton view;
	ArrayList<String> names;
	public static void main(String[] args) {
		GuestBook g = new GuestBook();
		g.createGUI();
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource() == addName) {
	String namee = JOptionPane.showInputDialog("add a name here");
	names.add(namee);
	}
	if(e.getSource() == view) {
		for (int i = 0; i < names.size(); i++) {
			JOptionPane.showMessageDialog(null, names.get(i));
		}
		
		
	}
	}
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	
	// all the names added to the list. Format the list as follows:
	
	// Guest #1: Bob Banders
	
	// Guest #2: Sandy Summers
	
	// Guest #3: Greg Ganders
	
	// Guest #4: Donny Doners
	
}


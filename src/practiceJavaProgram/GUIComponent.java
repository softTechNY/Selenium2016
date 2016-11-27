import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class GUIComponent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// Create a button with text ok
		JButton jbtOk = new JButton("OK");
		//Create button with text Cancel
		JButton jbtCancel = new JButton("Cencel");
		//Create a label with text "Enter your name"
		JLabel jlblName = new JLabel("Enter you name:");
		// Create a text field with text "Type Name Here"
		JTextField jtfName = new JTextField("Type Name Here");
		
		// Create a check box with bold text
		JCheckBox jchkBold = new JCheckBox("Bold");
			//create a check box with text italic
			JCheckBox jchkItalic = new JCheckBox("Italic");
		// Create a radio button with text red
		JRadioButton jrbRed = new JRadioButton("Red");
		// Create a Radio Button with text yellow
		JRadioButton jrbYello = new JRadioButton("Yellow");
		// Create a combo box with several choices
		JComboBox jcboColor = new JComboBox(new String[]{"Freshman", "Sophomore", "Junior", "Senior"});
		
		// Create a panel to group componenets  
		JPanel panel = new JPanel();
		panel.add(jbtOk); // add the ok button to the panel
		panel.add(jbtCancel); //add the Cencel button to the pannel
		panel.add(jlblName); // add the  label to the panel
		panel.add(jtfName); // add the text field to th epanel
		panel.add(jchkBold); // add the check box to the panel
		panel.add(jchkItalic); // add the check box to the panel
		panel.add(jrbRed); // add the radio button to  the panel
		panel.add(jrbYellow); // add the radio button to te panel
		panel.add(jcboColor); // add the combo box to the panel
		
		JFrame frame = new JFrame(); //  Create a frame
		frame.add(panel); // Add the panel to the frame
		frame.setTittle("Show GUI Components");
		frame.setSize(450, 100;
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}

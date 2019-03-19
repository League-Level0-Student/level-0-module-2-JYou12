package random;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	
	String height = JOptionPane.showInputDialog("How tall are you in inches");
	int i = Integer.parseInt(height);
	
	if (i <= 48) {
		JOptionPane.showMessageDialog(null, "Get TALLER");
	}else {
		JOptionPane.showMessageDialog(null, "Go onto the coaster");
	}
	
}
}

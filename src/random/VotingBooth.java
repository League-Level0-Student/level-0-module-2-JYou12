package random;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
	String age = JOptionPane.showInputDialog("How old are you");
	int i = Integer.parseInt(age);
	
	if (i <= 18) {
		JOptionPane.showMessageDialog(null, "nobody cares what you think");
	}else {
		JOptionPane.showMessageDialog(null, "Who should be the next president?");
	}
	
}
}

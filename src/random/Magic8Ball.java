//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "This is 8 ball magic");
JOptionPane.showMessageDialog(null, "You get 5 questions");
JOptionPane.showMessageDialog(null, "And the magic 8 ball will awnser them");
for (int i=0; i<5; i++){
	JOptionPane.showInputDialog("Ask a yes or no question");	
// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int r = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(r);
	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0
if (r == 0) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "Yes");
}else if (r == 1) {
	JOptionPane.showMessageDialog(null, "no");
}else if (r == 2) {
	JOptionPane.showMessageDialog(null, "May you should ask Google");
}else if (r == 3) {
	JOptionPane.showMessageDialog(null, "Ask your friend");
}
	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
}
	// -- write your own answer
}
}

package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

		// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	
int	r = new Random().nextInt(4);
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

		// 3. Print out this variable
	System.out.println(r);
		// 4. Get the user to enter a question for the 8 ball
String question = JOptionPane.showInputDialog("enter a question");
		// 5. If the random number is 0
		// -- tell the user "Yes"
if(r==0) {
	JOptionPane.showMessageDialog(null, "yes");
}
		// 6. If the random number is 1
else if(r==1) {
	JOptionPane.showMessageDialog(null, "no");
}
		// -- tell the user "No"
else if(r==2)
		// 7. If the random number is 2
JOptionPane.showMessageDialog(null, "Maybe you should ask google");
		// -- tell the user "Maybe you should ask Google?"
if(r==3) {
	JOptionPane.showMessageDialog(null, "ask your mom");
}
		// 8. If the random number is 3

		// -- write your own answer
}
	}



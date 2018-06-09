import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class typingTutor implements KeyListener {
	JFrame frame;
	JLabel label;

	void getGoing() {
		frame = new JFrame("type or die");
		frame.setVisible(true);
		label = new JLabel();
		label.setText(currentLetter + "");
		frame.add(label);
		frame.addKeyListener(this);
	}

	public static void main(String[] args) {
		typingTutor tutor = new typingTutor();
		tutor.getGoing();
	}

	char currentLetter = generateRandomLetter();

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
e.getKeyChar();
if(currentLetter==e.getKeyChar()) {
	System.out.println("correct");
 frame.setBackground(Color.green);
}
else {
	System.out.println("incorrect");
	frame.setBackground(Color.red);
}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
System.out.println("You typed"+" "+currentLetter);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
currentLetter = generateRandomLetter();
label.setText(currentLetter+"");
	}
}

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

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}

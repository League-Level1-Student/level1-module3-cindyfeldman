import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackaMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	static Date one;
	static Random r;

	public static void main(String[] args) {
		WhackaMole mole = new WhackaMole();
		r = new Random();
		mole.drawButtons(r);
		one = new Date();

	}

	public void drawButtons(Random r) {
		frame = new JFrame();
		frame.setTitle("Whack-a-Button for Fame and Glory");
		frame.setVisible(true);
		panel = new JPanel();
		frame.add(panel);
		frame.setSize(300, 300);
		int randomNumber = r.nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton button2 = new JButton();

			panel.add(button2);
			if (randomNumber == i) {
				button2.setText("mole!!");
				button = button2;

			}
			button2.addActionListener(this);

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton ButtonPressed = (JButton) e.getSource();
		if (ButtonPressed != button) {
			speak("you missed");
			frame.dispose();
			drawButtons(r);
		} else if (ButtonPressed == button) {
			System.out.println("you hit one!");
			frame.dispose();
			drawButtons(r);
			endGame(one, 10);
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

}

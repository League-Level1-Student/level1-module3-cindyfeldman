import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JPanel panel;
	JFrame frame;
	JButton button1;
	JButton button2;

	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();
		clicker.makeButtons();

	}

	public void makeButtons() {
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		button1 = new JButton("joke");
		button2 = new JButton("punchline");
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();

		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "why shouldn't you write with a broken pencil?");
		} else {
			JOptionPane.showMessageDialog(null, "Because it's pointless");
		}
	}
}
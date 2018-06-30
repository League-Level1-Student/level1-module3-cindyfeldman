package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JLabel label;

	public static void main(String[] args) {
		slotMachine slot = new slotMachine();
		slot.getGoing();
	}

	public void getGoing() {
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		frame.add(panel);
		String watermelon = "watermelon.jpeg";
		String pineapple = "pineapple.jpeg";
		String blueberries = "blueberries.jpeg";
		label = Image(watermelon);
		frame.add(label);
		button = new JButton("Spin!!!");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = new JButton();
	}

	public JLabel Image(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}

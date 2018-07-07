package extra;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

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
	JLabel two;
	JLabel three ;
	static Random r=new Random();
	public static void main(String[] args) {
		slotMachine slot = new slotMachine();
		slot.getGoing();
	}

	public void getGoing() {
		frame = new JFrame();
		frame.setSize(300, 300);
		frame.setVisible(true);
		panel = new JPanel();
		frame.add(panel);
		label = new JLabel();
		two = new JLabel();
		three = new JLabel();
	button = new JButton("Spin!!!");
		panel.add(button);
		frame.pack();
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = new JButton();
		panel.remove(label);
		panel.remove(two);
		panel.remove(three);
		label =pictures(label);
		two =pictures(two);
		three =pictures(three);
	
		
		panel.add(label);
		panel.add(two);
		panel.add(three);
		frame.pack();
		
	}
	public JLabel pictures(JLabel l) {
		String watermelon = "watermelon.jpeg";
		String pineapple = "pineapple.jpeg";
		String blueberries = "blueberries.jpeg";
		int randomNumber = r.nextInt(3);
		if(randomNumber == 0) {
			l = Image(watermelon);
			
		}
		else if(randomNumber==1) {
			l = Image(pineapple);
			
		}
		else {
			l =Image(blueberries);
			
			
		}
		return l;
	}

	public JLabel Image(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}

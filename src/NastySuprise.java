import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JButton Trick;
	JButton Treat;
	JFrame frame;
	JPanel panel;
	
	public static void main(String[] args) {
		NastySuprise suprise = new NastySuprise();
		suprise.getGoing();
	}
	void getGoing()  {
		frame = new JFrame();
		frame.setVisible(true);
		 panel = new JPanel();
		frame.add(panel);
		 Trick = new JButton("Trick");
		 Treat = new JButton("Treat");
		 panel.add(Treat);
		 panel.add(Trick);
		 frame.pack();
		 Treat.addActionListener(this);
		 Trick.addActionListener(this);
	}
	/*1. Make a user interface that has 2 buttons. One says “Trick” the other says “Treat”. 

	2. When the user clicks on the Trick button, show them a picture of a cute puppy. 

	3. When they click Treat, show them a scary image.

	To show the pictures, use the showPictureFromTheInternet() method below.*/
	
	

	private void showPictureFromTheInternet(String imageUrl) {
		 
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.equals(Trick)) {
			showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_nVBsn7sdaNKwZcLVkW--yMT-15MCJk032f_ei-TZe-jk7sW0jg");
		
	}
		else {
			showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrtBtbRR5ZyGI-imit4L9mdChUayTEfctLFoDuXf40hEyJNumz");
			
		}
	}
}

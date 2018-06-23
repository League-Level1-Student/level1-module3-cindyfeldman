import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class getLatestTweet implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton search;
	JTextField field;
public static void main(String[] args) {
	getLatestTweet tweet = new getLatestTweet();
	tweet.getGoing();
}
void getGoing()  {
				frame = new JFrame();
				frame.setVisible(true);
				panel = new JPanel();
				field = new JTextField();
				frame.add(panel);
				frame.setTitle("get latest tweet");
				search = new JButton("search the twitterverse");
				panel.add(field);
				field.setSize(50,25);
				panel.add(search);
				frame.pack();
				search.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==search) {
		System.out.println();
	}
}
}
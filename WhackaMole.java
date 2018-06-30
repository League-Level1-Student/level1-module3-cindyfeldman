import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackaMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton  button;
	
public static void main(String[] args) {
	WhackaMole mole = new WhackaMole();
Random r = new Random();
	mole.drawButtons(r);
}
/*void getGoing(){*/
	
public  void drawButtons(Random r) {
	
	frame = new JFrame();
	frame.setTitle("Whack-a-Button for Fame and Glory");
	frame.setVisible(true);
	panel = new JPanel();
	frame.add(panel);
frame.setSize(200,150);

for (int i = 0; i < 24; i++) {
r=new Random();
	button= new JButton("");
	panel.add(button);}
button.addActionListener(this);


}


		
	
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton ButtonPressed = (JButton) e.getSource();
	if(ButtonPressed ==button) {
		speak("you missed");
	}
}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }}
    private void endGame(Date timeAtStart, int molesWhacked) {
        Date timeAtEnd = new Date();
        JOptionPane.showMessageDialog(null, "Your whack rate is "
             + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
             + " moles per second.");
   }

}



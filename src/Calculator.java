import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame;
	JLabel label;
	JPanel panel;
	JButton add;
	JButton divide;
	JButton multiply;
	JButton subtract;
	
	JTextField two;
public static void main(String[] args) {
Calculator one = new Calculator();
one.getGoing();
}
public static void multiply(int number1, int number2) {
	System.out.println(number1*number2);
}
public static void divide(int number1,int number2) {
	System.out.println(number1/number2);
}
public static void subtract(int number1,int number2) {
	System.out.println(number1- number2);
}
public static void add(int number1,int number2) {
	System.out.println(number1+number2);
}
void getGoing()  {
	frame = new JFrame();
	frame.setVisible(true);
	 panel = new JPanel();
	 two = new JTextField();
	frame.add(panel);
	add= new JButton("add");
	subtract= new JButton("subtract");
	multiply= new JButton("multiply");
	divide =  new JButton("divide");
	panel.add(add);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(divide);
	panel.add(two);
	frame.pack();
	add.addActionListener(this);
	multiply.addActionListener(this);
	divide.addActionListener(this);
	subtract.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==add) {
		add(10,5);
	}
	else if(buttonPressed==subtract) {
		subtract(5,6);
	}
	else if(buttonPressed==divide) {
		divide(10,5);
	}
	else {
		multiply(10,5);
	}
}
}

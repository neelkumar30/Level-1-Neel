import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener {
	boolean check = false;
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JTextField field;
	JLabel label;
	
	public void makeStuff() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton("Submit");
		field = new JTextField(25);
		button2 = new JButton("Hint");
		label = new JLabel("What has three feet but can't walk?");
		frame.add(panel);
		panel.add(label);
		panel.add(field);
		panel.add(button1);
		panel.add(button2);
		frame.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
		String answer = field.getText();
	}
	public static void main(String[] args) {
		PracticeTest test = new PracticeTest();
		test.makeStuff();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			check = true;
		}
	}
}

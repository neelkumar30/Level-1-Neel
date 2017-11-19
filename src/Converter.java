
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Converter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField field = new JTextField(40);
	JTextField field2 = new JTextField(40);
	JButton button = new JButton();

	Converter() {
		button.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);
		panel.add(field);
		panel.add(button);
		panel.add(field2);
		button.setText("Convert");
		frame.pack();

	}

	public static void main(String[] args) {
		Converter Ozil = new Converter();
	}

	String convert(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}

	String convert2(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		return "" + asciiValue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String binary = field.getText();
			String conversion = convert2(binary);
			field2.setText(conversion);

		}

	}

}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField field = new JTextField(30);
	JButton button = new JButton("Translate");
	JTextField field2 = new JTextField(30);
	PigLatinTranslator Plt = new PigLatinTranslator();
	
	public static void main(String[] args) {
		PigLatin pig = new PigLatin();
		pig.makeStuff();
	}
	void makeStuff() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		panel.add(field2);
		frame.pack();
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = field.getText();
		System.out.println(input);
		String translated = Plt.translate(input);
		System.out.println(translated);
		field2.setText(translated);
	}
}

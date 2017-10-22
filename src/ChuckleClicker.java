import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ChuckleClicker implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton jokeButton;
	JButton punchline;
	public static void main(String[] args) {
		ChuckleClicker Clay = new ChuckleClicker();
		Clay.makeButtons();
	}

	void makeButtons() {
		frame = new JFrame();
		panel = new JPanel();
		jokeButton = new JButton("Joke");
		punchline = new JButton("Punchline");
		frame.setVisible(true);
		frame.add(panel);
		panel.add(jokeButton);
		panel.add(punchline);
		jokeButton.addActionListener(this);
		punchline.addActionListener(this);
		frame.setSize(600, 600);
	}
	boolean check = false;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource() == jokeButton) {
			JOptionPane.showMessageDialog(null, "I can't believe I got fired from the Calendar Factory");
			check = true;
		}
		if(arg0.getSource() == punchline && check == true) {
			JOptionPane.showMessageDialog(null, "All I did was take a day off");
		}
		if(arg0.getSource() == punchline && check == false) {
			JOptionPane.showMessageDialog(null, "Go to the joke first");
		}
	}
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class getLatestTweet implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField field = new JTextField(20);
	getLatestTweet(){
		
		button.setText("Search the Twitterverse");
		button.addActionListener(this);
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		frame.setVisible(true);
		frame.pack();
	}
	public static void main(String[] args) {
		getLatestTweet hi = new getLatestTweet();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.button) {
			System.out.println("Tweet Tweet");
		}
	}
}

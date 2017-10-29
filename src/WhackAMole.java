import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton mole = new JButton();
Date timeAtStart;
	void whack() {	
		timeAtStart = new Date();
		System.out.println(timeAtStart.toString());
		panel.setSize(900,1500);
		frame.add(panel);
		frame.setSize(1100, 10000);
		Random gen = new Random();
		int num = gen.nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if(num == i) {
				mole = button;
				mole.setText("Mole");
			}
		
		}
	
		panel.setLayout(new GridLayout(8,3));
		frame.setVisible(true);		
		
	}
	void speak(String words) { 
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	
	
	int track = 0;
	public void actionPerformed(ActionEvent nadal) {
		// TODO Auto-generated method stub
		if(nadal.getSource() == mole) {
			speak("You did it");
			frame.dispose();
			whack();
			track = track + 1;
		}
		else {
			speak("You dork");
		}
		endGame(timeAtStart, track);
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}

}

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	JFrame typeOrDie = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;
	static typingTutor type = new typingTutor();
	int counter = 0;
	int correct = 0;
	static Date timeAtStart;

	void createGUI() {
		typeOrDie.setVisible(true);
		typeOrDie.add(panel);
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		typeOrDie.addKeyListener(this);
		typeOrDie.add(label);
		label.setOpaque(true);
		typeOrDie.pack();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public static void main(String[] args) {
		timeAtStart = new Date();
		type.createGUI();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		if (e.getKeyChar() == currentLetter) {
			System.out.println("Correct");
			label.setBackground(Color.GREEN);
			correct +=1;
		} else {
			label.setBackground(Color.RED);
		}
		counter = counter + 1;
		if(counter == 10) {
			showTypingSpeed(correct);
			correct = 0;
			counter = 0;
			timeAtStart = new Date();
		}
	}

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
	}
}

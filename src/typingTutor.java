import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	JFrame typeOrDie = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;
	
	void createGUI(){
		typeOrDie.setVisible(true);
		typeOrDie.add(panel);
		currentLetter = generateRandomLetter();
		label.setText(currentLetter +"");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		typeOrDie.addKeyListener(this);
	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public static void main(String[] args) {
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

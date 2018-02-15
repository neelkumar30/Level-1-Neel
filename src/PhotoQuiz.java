 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String nadal = "http://www.newnownext.com/wp-content/uploads/backlot/2014/06/1288503274_1352780689.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component Rafa;
		// 3. use the "createImage()" method below to initialize your Component
		Rafa = createImage(nadal);
		// 4. add the image to the quiz window
		quizWindow.add(Rafa);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String useranswer = JOptionPane.showInputDialog("Who is this great and majestic person? First and last name please");

		
		if(useranswer.equalsIgnoreCase("Rafael Nadal")|| useranswer.equalsIgnoreCase("Rafael Nadal")) {
			System.out.println("CORRECT");
			JOptionPane.showMessageDialog(null, "CORRECT! You know stuff. You don't have to go back to first grade.");
		}
		
		else {
			System.out.println("INCORRECT! The right answer was Rafael Nadal. You don't know anything so go and learn things.");
			JOptionPane.showMessageDialog(null,"INCORRECT! The right answer was Rafael Nadal. You don't know anything so go and learn things.");
		}
		
		
		String answer = JOptionPane.showInputDialog("How many French Open titles did he win in a row? Give the highest answer please. He has the most wins at a single major than everyone else");

		// 7. print "CORRECT" if the user gave the right answer
		if(answer.equalsIgnoreCase("5")|| answer.equalsIgnoreCase("Five")) {
			System.out.println("CORRECT");
			JOptionPane.showMessageDialog(null, "CORRECT! You know stuff. You don't have to go back to first grade.");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT! The right answer was 5. You don't know anything so go and learn things.");
			JOptionPane.showMessageDialog(null,"INCORRECT! The right answer was 5. You don't know anything so go and learn things.");
		}
		
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(Rafa);
		// 10. find another image and create it (might take more than one line of code)
			
		
		String koo = "https://bloximages.chicago2.vip.townnews.com/thegeorgeanne.com/content/tncms/assets/v3/editorial/7/08/7086de44-57d9-11e5-a853-0f9eacb05a2e/55f1b08c9825a.image.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component young;
		// 3. use the "createImage()" method below to initialize your Component
		young = createImage(koo);
		// 4. add the image to the quiz window
		quizWindow.add(young);
		// 5. call the pack() method on the quiz window
	quizWindow.pack();
		// 6. ask a question that relates to the image
		String useranswer2 = JOptionPane.showInputDialog("Who is this person? First and last name please");

		
		if(useranswer.equalsIgnoreCase("Younghoe Koo")|| useranswer.equalsIgnoreCase("Younghoe Koo")) {
			System.out.println("CORRECT");
			JOptionPane.showMessageDialog(null, "CORRECT! You know stuff. I am very impressed that you got the answer right.");
		}
		
		else {
			System.out.println("INCORRECT! The right answer was Younghoe Koo. You don't know anything so go and learn things.");
			JOptionPane.showMessageDialog(null,"INCORRECT! The right answer was Younghoe Koo. You don't know anything so go and learn things.");
		}
		
		
		String answer2 = JOptionPane.showInputDialog("At what age did he learn to speak English");

		// 7. print "CORRECT" if the user gave the right answer
		if(answer2.equalsIgnoreCase("12")|| answer2.equalsIgnoreCase("Twelve")) {
			System.out.println("CORRECT");
			JOptionPane.showMessageDialog(null, "CORRECT! You know stuff. You don't have to go back to first grade.");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT! The right answer was 12. You don't know anything so go and learn things.");
			JOptionPane.showMessageDialog(null,"INCORRECT! The right answer was 12. You don't know anything so go and learn things.");
		}
		
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}


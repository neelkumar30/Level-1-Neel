import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpellingBee {
	int lines;
	ArrayList<String> words = new ArrayList<>();

	/*
	 * Get a random word using the randomWord() method and ask the user how to
	 * spell it using the speak() method. If the user spells it right move on to
	 * a new word, but if they do not spell it right ask again. The only place
	 * that you need to write code in is the stuffForYouToDo() Method
	 */
	public void stuffForYouToDo() {
		String word = randomWord();
		
				
		for (int i = 0; true; i++) {
			System.out.println(word);
			Speak(word);
			String user = JOptionPane.showInputDialog("Type in the word here spelled correctly");
			if(user.equalsIgnoreCase(word)) {
				word = randomWord();
			}
			else {
				System.out.println("You lost");
				System.exit(0);
			}
		}
		
		//You write code in here
	}

	public String randomWord() {
		return words.get(new Random().nextInt(lines));
	}
	Voice voice = VoiceManager.getInstance().getVoice("kevin16");

	public SpellingBee() {
		
		System.out.println(" /--------------------------------------------\\ ");
		System.out.println(" | Warning: Some of the words are super hard! | ");
		System.out.println(" \\--------------------------------------------/ ");
		try {
			// Get the amount of lines
			LineNumberReader lnr = new LineNumberReader(new FileReader(new File("words")));
			lnr.skip(Long.MAX_VALUE);// Skip to the end
			lines = lnr.getLineNumber();// Get last line number
			//speakNoWait(lines + " words loaded");
			System.out.println("Number of words: " + lines);
			lnr.close();
			BufferedReader br = new BufferedReader(new FileReader(new File("words")));
			for (int i = 0; i < lines; i++) {
				words.add(br.readLine()); // adds every line to the array
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		stuffForYouToDo();
	}

	public static void main(String[] args) {
		new SpellingBee();
	}

	/* Don’t change this…. */
	void Speak(String words) {
		
				voice.allocate();
				voice.speak(words);
				voice.deallocate();

		
	}


	public void speakNoWait(String text) {
		try {
			Runtime.getRuntime().exec("say " + text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Hangman {
	public static void main(String[] args) {

		Hangman game = new Hangman();

	}

	ArrayList<String> words = new ArrayList<String>();

	Hangman() {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		JPanel panel = new JPanel(new GridLayout(4, 0));
		panel.setVisible(true);
		frame.add(panel);

		JLabel label = new JLabel("guessletter", SwingConstants.CENTER);
		panel.add(label);
		label.setVisible(true);

		JLabel label2 = new JLabel("empty", SwingConstants.CENTER);
		panel.add(label2);
		label2.setVisible(true);

		JLabel label3 = new JLabel("howmanyliveleft", SwingConstants.CENTER);
		panel.add(label3);

		label3.setVisible(true);
		String answer = JOptionPane.showInputDialog("HangMan!!How many words would you like to have");
		int  num = Integer.parseInt(answer);
		for (int i = 0; i < num; i++) {
		String word=Utilities.readRandomLineFromFile("src/dictionary.txt");
		words.add(word);
		
		}
		System.out.println(words);

	}
}

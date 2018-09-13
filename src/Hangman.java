import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hangman {
	public static void main(String[] args) {
		Hangman game = new Hangman();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		JLabel label = new JLabel();
		label.setName("guessletter");
		JLabel label2 = new JLabel();
		label2.setName("empty");
		JLabel label3 = new JLabel();
		label3.setName("howmanylivesleft");
	}
}

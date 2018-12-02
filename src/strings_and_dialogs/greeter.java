package strings_and_dialogs;
import javax.swing.JOptionPane;

public class greeter {

	public static void main(String[] args) {
		String y;
		y=JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null,"Welcome, "+y);

	}

}

package strings_and_dialogs;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class Check {

	public static void main(String[] args) {
		String answer;
		answer= JOptionPane.showInputDialog("What is your favorite color?");
		JOptionPane.showMessageDialog(null,answer+" is also my favorite color");
		Robot ryan= new Robot();
		ryan.setSpeed(50);
		ryan.penDown();
		ryan.setPenColor(255, 0, 0);
		for (int i = 0; i <3; i++) {
			ryan.setRandomPenColor();
			ryan.move(200);
			ryan.turn(120);
			
		}

	}

}

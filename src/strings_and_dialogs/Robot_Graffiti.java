package strings_and_dialogs;
import org.jointheleague.graphical.robot.Robot;

public class Robot_Graffiti {

	public static void main(String[] args) {
		Robot ryan= new Robot();
		
		ryan.penDown();
		ryan.setSpeed(75);
		ryan.move(200);
		ryan.turn(90);
		ryan.move(125);
		ryan.turn(90);
		ryan.move(100);
		ryan.turn(90);
		ryan.move(125);
		ryan.turn(180);
		ryan.move(160);
		ryan.turn(90);
		ryan.move(100);
	}

}

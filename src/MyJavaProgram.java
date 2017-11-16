import java.awt.Color;
import java.awt.event.ActionEvent;

import org.jointheleague.graphical.robot.KeyboardAdapter;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot robot1 =new Robot("superman");
		
		
		robot1.addKeyboardAdapter(new KeyboardAdapter());
		robot1.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			
			robot1.penDown();
			robot1.move(250);
			robot1.turn(90);
			
		}
		
		
	
	}
}

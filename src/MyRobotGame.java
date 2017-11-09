import org.jointheleague.graphical.robot.KeyboardAdapter;
import org.jointheleague.graphical.robot.Robot;

public class MyRobotGame {
	
	public static void main(String[] args) {
		
	Robot pen = new Robot();
	
	
	//pen variable
	pen.setPenColor(0, 100, 0);
	pen.sparkle();
	pen.penDown();
	pen.setPenWidth(20);
	pen.setSpeed(100);
	pen.moveTo(0, 850);
	pen.turn(90);
	pen.move(1950);
	pen.setPenColor(80, 41, 12);
	
	for (int i = 0; i < 9; i++) {
		pen.turn(90);
		pen.move(10);
		pen.turn(90);
		pen.move(1950);
		pen.turn(-90);
		pen.move(10);
		pen.turn(-90);
		pen.move(1950);
	}
	
	pen.penUp();
	pen.turn(-90);
	pen.move(200);
	pen.turn(-90);
	pen.move(300);
	
	Robot player = new Robot();
	
	
	//player variable
	player.setSpeed(12);
	player.addKeyboardAdapter(new KeyboardAdapter());
	
	
	
	}
}

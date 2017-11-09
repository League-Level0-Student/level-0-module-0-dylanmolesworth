import org.jointheleague.graphical.robot.KeyboardAdapter;
import org.jointheleague.graphical.robot.Robot;

public class MyRobotGame {
	
	public static void main(String[] args) {
		
	Robot pen = new Robot();
	
	pen.setWindowColor(15, 183, 255);
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
	
	
	pen.turn(-90);
	
	
	
	
	pen.penUp();
	
	
	pen.moveTo(100, 840);
	
	//second Tree
	
	
	
	for (int i = 0; i < 10; i++) {
		pen.setPenColor(107, 47, 12);
		pen.penDown();
		pen.move(500);	
		pen.setPenColor(17, 73, 8);
		pen.turn(90);
		pen.move(10);
		pen.turn(90);
		pen.move(10);
		pen.turn(90);
		pen.move(10);
		pen.move(10);
		pen.turn(90);
		pen.move(10);
		pen.penUp();
		pen.turn(-180);
		pen.move(500);
		pen.turn(-90);
		pen.move(50);
		pen.turn(-90);
			
	}
	pen.moveTo(50, 300);
	pen.turn(90);
	pen.setPenColor(255, 255, 255);
	for (int i = 0; i < 10; i++) {
		
		
	}
	
	Robot player = new Robot();
	
	
	//player variable
	player.setSpeed(12);
	player.addKeyboardAdapter(new KeyboardAdapter());
	
	
	
	}
}

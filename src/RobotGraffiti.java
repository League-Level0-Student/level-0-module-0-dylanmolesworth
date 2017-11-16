import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	
	public static void main(String[] args) {
		Robot graffitibot =new Robot();
		
		graffitibot.miniaturize();
		graffitibot.setSpeed(15);
		graffitibot.penDown();
		graffitibot.move(100);
		graffitibot.turn(110);
		graffitibot.move(40);
		graffitibot.turn(20);
		graffitibot.move(20);
		graffitibot.turn(50);
		graffitibot.move(50);
		graffitibot.turn(50);
		graffitibot.move(20);
		graffitibot.turn(20);
		graffitibot.move(40);
		graffitibot.penUp();
		graffitibot.move(100);
		
		
		
	}

}

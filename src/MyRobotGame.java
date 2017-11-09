import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.KeyboardAdapter;
import org.jointheleague.graphical.robot.Robot;

public class MyRobotGame {
	
	public static void main(String[] args) {
		
		//PopUp Dialogue conversation
		
		JOptionPane.showMessageDialog(null, "Please Do Not Enter Your Real Name. Thank You.");
		
		String first_name;
		first_name = JOptionPane.showInputDialog("What Is Your Name?");
		
		String family_name;
		family_name = JOptionPane.showInputDialog("What Is your Last Name?");
		
		String full_name;
		full_name = "Hello " + first_name + " from the " + family_name + " Family. I will just call you " + first_name;
		
		JOptionPane.showMessageDialog(null, full_name);
		
		Object[] options = { "Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Pink" };
		  int choice =  JOptionPane.showOptionDialog(null,
				"What Is Your Favorite Color?", 
				"Favorite Color",
				JOptionPane.YES_NO_OPTION, 
			      JOptionPane.QUESTION_MESSAGE,  
			      null, 
			      options, 
			      options[0]);
		  
		  Object[] options1 = { "Male", "Female" };
		  int choice1 =  JOptionPane.showOptionDialog(null,
				"What gender would you like to be?", 
				"Gender",
				JOptionPane.YES_NO_OPTION, 
			      JOptionPane.QUESTION_MESSAGE,  
			      null, 
			      options1, 
			      options1[0]);
		
		JOptionPane.showMessageDialog(null, "Lets Make This World AMAZING!");
		
		
		
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
	
	
	//dirt
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
	
	//snow Forest
	
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
	
	//snow on trees
	pen.moveTo(70, 335);
	pen.turn(90);
	pen.setPenColor(255, 255, 255);
	pen.setPenWidth(5);
	for (int i = 0; i < 10; i++) {
		pen.penUp();
		pen.move(20);
		pen.penDown();
		pen.move(20);
				
		
	}
	//snow on ground
			pen.moveTo(0, 845);
			pen.move(525);
	
	pen.moveTo(600, 840);
	pen.turn(-90);
	pen.setPenWidth(20);
	
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
	
	//desert
	pen.moveTo(1000, 850);
	pen.turn(90);
	pen.penDown();
	pen.setPenColor(211, 181, 103);
	for (int i = 0; i < 10; i++) {
		
	pen.move(500);
	pen.turn(90);
	pen.move(10);
	pen.turn(90);
	pen.move(500);
	pen.turn(-90);
	pen.move(10);
	pen.turn(-90);
	
	}
	pen.moveTo(1600, 850);
	pen.setPenColor(31, 31, 226);
	
	for (int i = 0; i < 10; i++) {
	
	pen.move(500);
	pen.turn(90);
	pen.move(10);
	pen.turn(90);
	pen.move(500);
	pen.turn(-90);
	pen.move(10);
	pen.turn(-90);

	
	}
	
	//sun
	pen.setPenColor(255, 93, 0);
	pen.moveTo(1675, 0);
	
	for (int i = 0; i < 9; i++) {
		pen.move(300);
		pen.turn(90);
		pen.move(10);
		pen.turn(90);
		pen.move(300);
		pen.turn(-90);
		pen.move(10);
		pen.turn(-90);
		
		
	}
	
	pen.moveTo(-10, -10);
	
	Robot player = new Robot("player");
	
	
	//player variable
	player.setSpeed(12);
	player.addKeyboardAdapter(new KeyboardAdapter());
	
	
}
}

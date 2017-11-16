import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
	
	public static void main(String[] args) {
		
		String color = JOptionPane.showInputDialog("What is your favorite color");
		JOptionPane.showMessageDialog(null, "My favorite color is " + color + " too");
		
		Robot pen = new Robot();
		pen.setPenWidth(20);
		pen.setPenColor(235, 244, 66);
		pen.setSpeed(100);
		pen.penDown();
		for (int i = 0; i < 3; i++) {
		
			pen.move(200);
			pen.turn(120);
			
		}
		
		
		
		
	}

}

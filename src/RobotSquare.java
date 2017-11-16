/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
    	
    	Robot robot2 =new Robot();


        // 3. Put the robot's pen down
    	
    	robot2.penDown();


        // 6. Make the robot move as fast as possible
    	
    	robot2.setSpeed(100);


        // 5. Do everything below here 4 times
    	
    	for (int i = 0; i < 4; i++) {
    		robot2.move(200);
    		robot2.turn(90);
    		
			
		}
    	
    	for (int i = 0; i < 4; i++) {
    		robot2.move(200);
    		robot2.turn(120);
			
		}
    	for (int i = 0; i < 5; i++) {
    		robot2.move(200);
    		robot2.turn(360/5);
			
		}
    	}
    	


        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }


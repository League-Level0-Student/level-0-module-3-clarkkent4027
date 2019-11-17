//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		 Robot Damian = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog(null, "What color should my robot draw? Red, Blue, or Green");
		//5. Use an if/else statement to set the pen color that the user requested
	

        //6. If the user doesn’t enter anything, choose a random color
if (color == " ") {
	Damian.setPenColor(255, 255, 0);
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		Damian.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)------------------
		if (color.equalsIgnoreCase("red")) {
			Damian.setPenColor(255, 0, 0);
		}
		if (color.equalsIgnoreCase("green")) {
			Damian.setPenColor(0, 255, 0);
		}
		if (color.equalsIgnoreCase("blue")) {
			Damian.setPenColor(0, 0, 255);
		}
	Damian.setSpeed(100);
	Damian.penDown();
	Damian.turn(90);
	Damian.move(150);
	Damian.turn(90);
	Damian.move(150);
	Damian.turn(90);
	Damian.move(150);
	Damian.turn(90);
	Damian.move(150);
	
	}
	
}
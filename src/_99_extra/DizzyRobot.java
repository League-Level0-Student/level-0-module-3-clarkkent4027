//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();

	public static void main(String[] args) {

		// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number
		// of times.
		String dizzy = JOptionPane.showInputDialog(null, "How dizzy do you want the robot from 1 to 10");
		// 1. Use the dance method to make the robot spin.
		int numberOfSpins = Integer.parseInt(dizzy);
dance(numberOfSpins);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.setSpeed(255);
			robot.turn(360);
		}
	}
}

package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obeidientRobot {
	static Robot kara = new Robot();

	public static void main(String[] args) {

		kara.setSpeed(255);

		String Shape = JOptionPane.showInputDialog(null, "Which shape would you like? Square, Triangle, or Circle?");
		String color = JOptionPane.showInputDialog(null, "What color should my robot draw? Red, Blue, or Green");
		if (color.equalsIgnoreCase("red")) {
			kara.setPenColor(255, 0, 0);
		}
		if (color.equalsIgnoreCase("green")) {
			kara.setPenColor(0, 255, 0);
		}
		if (color.equalsIgnoreCase("blue")) {
			kara.setPenColor(0, 0, 255);
		}
		if (Shape.equalsIgnoreCase("square")) {
			drawSquare();
		} else if (Shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		} else if (Shape.equalsIgnoreCase("circle")) {
			drawCircle();
		}
	}

	static void drawSquare() {
		kara.penDown();
		kara.turn(90);
		kara.move(200);
		kara.turn(90);
		kara.move(200);
		kara.turn(90);
		kara.move(200);
		kara.turn(90);
		kara.move(200);
		kara.penUp();
	}

	static void drawTriangle() {
		kara.penDown();
		kara.turn(60);
		kara.move(200);
		kara.turn(60);
		kara.move(200);
		kara.turn(60);
		kara.move(200);
		kara.penUp();
	}

	static void drawCircle() {
		for (int i = 0; i < 361; i++) {
			kara.turn(1);
			kara.move(1);
		}

	}

}

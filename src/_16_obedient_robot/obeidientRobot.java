package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class obeidientRobot { 
	static Robot kara = new Robot();
public static void main(String[] args) {
	
	 kara.setSpeed(255);
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
           kara.penUp();        }
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
		kara.penDown();
		kara.turn(5);
		
		
		
		


}
}


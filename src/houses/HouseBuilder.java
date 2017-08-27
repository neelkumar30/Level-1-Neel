package houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HouseBuilder {
	Robot Ozil = new Robot();

	void movetoBottomLeftCorner() {

		Ozil.moveTo(30, 600);
	}

	void drawHouse(int height) {
		Ozil.setSpeed(100);
		Ozil.penDown();
		
			Ozil.setPenColor(Color.blue);
			Ozil.move(height);
			Ozil.turn(90);
			Ozil.move(45);
			Ozil.turn(90);
			Ozil.move(height);
			Ozil.turn(-90);
			Ozil.setPenColor(Color.green);
			Ozil.move(45);
			Ozil.turn(-90);
		
	}

}

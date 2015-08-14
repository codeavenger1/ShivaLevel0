
import javax.swing.JOptionPane;

import org.teachingextensions.logo.*;

public class ObedientTortoise {
	public static void main(String[] args) {

		Tortoise.show();
		Tortoise.setSpeed(10);
		String shape = JOptionPane
				.showInputDialog("which shape do you want??? Square, Triangle, or Circle"
						+ " Which ");

		if (shape.equals("square")) {
			drawSquare();
		}

		else if (shape.equals("triangle")) {
			drawTriangle();
		}

		else if (shape.equals("circle")) {
			drawCircle();
		}
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);

		}
	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(100);
			Tortoise.turn(120);
		}
	}

	static void drawCircle() {
		for (int i = 0; i < 130; i++) {
			{
				Tortoise.move(2);
				Tortoise.turn(360 / 100);
			}
		}
	}
}

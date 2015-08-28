
import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		
		for (int i = 0; i < 20; i++) {
			int randomNumber = new Random().nextInt(5);
			
			System.out.println(randomNumber);

			if (randomNumber == 1) {
				JOptionPane.showInputDialog("You have a great smile!!");
			}

			if (randomNumber == 2) {
				JOptionPane.showInputDialog("You have nice shirt!!");

			}

			if (randomNumber == 3) {
				JOptionPane.showInputDialog("You have awesome cheekbones!!");

			}

			if (randomNumber == 4) {
				JOptionPane.showInputDialog("Love ur hat!!");

			}

			if (randomNumber == 5) {
				JOptionPane.showInputDialog("Great hair!!");

			}
		}




		
		
		
		
		
		
		
	}
}



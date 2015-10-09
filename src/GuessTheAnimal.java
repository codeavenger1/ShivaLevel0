import javax.swing.JOptionPane;

import sun.security.tools.keytool.Main;

public class GuessTheAnimal {
	public static void main(String[] args) {
		int legs = JOptionPane.showConfirmDialog(null, "does it have 4 legs?",
				"", JOptionPane.YES_NO_OPTION);
		if (legs == 0) {
			int stripes = JOptionPane.showConfirmDialog(null,
					"does it have stripes?", "", JOptionPane.YES_NO_OPTION);

			if (stripes == 0) {
				JOptionPane.showMessageDialog(null, "It might be a zebra");
				
				
			}
			
			else {
				JOptionPane.showMessageDialog(null,
						"it might be a pig"); 

			}
		}

		else {
			int two = JOptionPane.showConfirmDialog(null,
					"does it have 2 legs?", "", JOptionPane.YES_NO_OPTION);
			
			{
				int fur =JOptionPane.showConfirmDialog(null,
						"does it have fur?", "", JOptionPane.YES_NO_OPTION);

			}
		}

	}
}

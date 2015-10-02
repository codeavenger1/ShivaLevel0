import javax.swing.JOptionPane;


public class MakeUrOwnAdventure { 
	
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Here is a riddle for you:");
	JOptionPane.showMessageDialog(null, "You were walking in the rain forest when you came across three bridges.");
	JOptionPane.showMessageDialog(null, "1. A troll bridge");
	JOptionPane.showMessageDialog(null, "2. A watermelon bridge");
	JOptionPane.showMessageDialog(null, "3. A cobweb bridge");
	String bridge = JOptionPane.showInputDialog( "Choose a bridge. (troll, watermelon, cobweb)");
	if (bridge.equals("troll")) {
		JOptionPane.showMessageDialog(null, "good choice.");
	}
	
	else if (bridge.equals("watermelon")) {
		JOptionPane.showMessageDialog(null, "You died.");
		return;
	}
	
	else if (bridge.equals("cobweb")) {
		JOptionPane.showMessageDialog(null, "good choice.");
	}

	else {
		JOptionPane.showMessageDialog(null, "You fell off the bridge, you died.");
	}

	JOptionPane.showMessageDialog(null, "You come across two rainbows.");
	JOptionPane.showMessageDialog(null, "One of which has a pink fluffy unicorn dancing on it.");
	JOptionPane.showMessageDialog(null, "The other one has a big fat troll dancing on it.");
	String rainbow = JOptionPane.showInputDialog(null, "Choose a rainbow. (unicorn or troll)");
	if (rainbow.equals("unicorn")) {
		JOptionPane.showMessageDialog(null, "You died.");
		return;
	}
	else if (rainbow.equals("troll")) {
		JOptionPane.showMessageDialog(null, "good choice.");
	}
	
	else {
		JOptionPane.showMessageDialog(null, "You fell off the bridge, you died.");
	}

}

}














































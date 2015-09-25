import javax.swing.JOptionPane;


public class VotingBooth {
public static void main(String[] args) {
	String agester = JOptionPane.showInputDialog("how old are you?");
	int age = Integer.parseInt(agester);
	
	
	if (age >= 18) {
		JOptionPane.showInputDialog("who should the next president be?????");	
		JOptionPane.showMessageDialog(null, "That is a great choice!");	
	}
	
	if (age <= 18); {
		JOptionPane.showInputDialog("who should the next president be?????");	
		JOptionPane.showMessageDialog(null, "Shut up!!");	
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!!");	
	}
	
}
}

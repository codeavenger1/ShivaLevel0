import javax.swing.JOptionPane;


public class rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("how tall are you?");
	
	int ride =Integer.parseInt(height);
	
	if (ride == (4))
	{
	JOptionPane.showMessageDialog(null, "You may proceed.");	
	}
	
	if (ride < (4))
	{
		JOptionPane.showMessageDialog(null, "go find another ride shorty!!!!!!!");
	}
	
	if (ride > (4))
	{
		JOptionPane.showMessageDialog(null, "your too tall. See ya later.");
	}
	
}
}

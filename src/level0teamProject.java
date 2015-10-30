import javax.swing.JOptionPane;


public class level0teamProject {
public static void main(String[] args) {
	String num = JOptionPane.showInputDialog(null, "Type in a number, 1-4");
	String numer = JOptionPane.showInputDialog(null, "Type in a number again, 1-4");
	int nun = Integer.parseInt(num);
	int nume = Integer.parseInt(numer);
	System.out.println(nun + nume+ "");
}
}

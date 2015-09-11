// Copyright Wintriss Technical Schools 2013
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {
public static void main (String arg []){
	

	
String pi ="3.14159265358979323846264338327950288419716939937510582097494459230781640628620";
	for (int i = 0; i < pi.length(); i++) {
	System.out.print(pi.charAt(i));	
	speak(pi.charAt(i));
	String number = JOptionPane.showInputDialog("enter next value");
	char num = number.charAt(0);
	if (num == pi.charAt(i+1)) {
		JOptionPane.showMessageDialog(null, "correct");
	}
	else {
		JOptionPane.showMessageDialog(null, "incorrect");
	}
	
}

}
	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}




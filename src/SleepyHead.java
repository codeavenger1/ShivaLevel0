
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		
		boolean isWeekday, isVacation;
		
//		/*
//		 * Ask the user for these values using
		int sleep =  JOptionPane.showConfirmDialog(null, "is it a weekday?", "",JOptionPane.YES_NO_OPTION);
//		 * JOptionPane.YES_NO_OPTION);
//		 */
	
		if (sleep == 1) {
			JOptionPane.showMessageDialog(null, "sleep in");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "GET UP LAZYBONES!");
		}
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}



import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {
public static void main(String[] args) {
	speak("setup"); 
}
    
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014



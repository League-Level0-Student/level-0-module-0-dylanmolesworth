import java.awt.Choice;

import javax.swing.JOptionPane;

public class Snooper {
	
	public static void main(String[] args) {
		
		JOptionPane.showConfirmDialog(null, "Hello. Whould you like to win 500 dollars and a new iphone every year?!?!?!");
				 System.exit(0);
		String name = JOptionPane.showInputDialog(null, "Cool! What is your name");
		String address = JOptionPane.showInputDialog(null, "Ok " + name + " what is your Street name?");
		String credit = JOptionPane.showInputDialog(null, "Ok " + name + " what is credit card number");
		String awnser = JOptionPane.showInputDialog(null, "Ok " + name + " you are about to be charged 1000 dollars a month. Is that Ok");
		JOptionPane.showInputDialog(null, "Ohhhh you chose " + awnser + "?");
		JOptionPane.showInputDialog(null, "Ok " + name + " on " + address + " street. I can use your credit card number, " + credit + " to "
				+ "buy stuff. You already have no credit left and you will not be receving an iphone because of that.");
		
		
	}

}

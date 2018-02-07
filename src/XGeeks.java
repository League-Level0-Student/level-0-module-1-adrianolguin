
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String Facundo = "Sharingan";
		String Eduardo = "Time Travel";
		String Andrew = "Teleportation";
		String Shanie = "Genericism";
		String Michelle = "Water bending";
		String Laysa = "Genericism";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String superName = JOptionPane.showInputDialog(null, "Type in a superHero Name");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (superName.equalsIgnoreCase("Facundo")) {
			JOptionPane.showMessageDialog(null, Facundo);
		}
		if (superName.equalsIgnoreCase("Eduardo")) {
			JOptionPane.showMessageDialog(null, Eduardo);
		}
		if (superName.equalsIgnoreCase("Andrew")) {
			JOptionPane.showMessageDialog(null, Andrew);
		}
		if (superName.equalsIgnoreCase("Shanie")) {
			JOptionPane.showMessageDialog(null, Shanie);
		}
		if (superName.equalsIgnoreCase("Michelle")) {
			JOptionPane.showMessageDialog(null, Michelle);
		}
		if (superName.equalsIgnoreCase("Laysa")) {
			JOptionPane.showMessageDialog(null, Laysa);
		}

	}
}

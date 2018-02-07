import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;

		String input1 = JOptionPane.showInputDialog("Imagine you are in a dark room, how do you get out?");

		if (input1.equalsIgnoreCase("Stop Imagining")) {
			score++;
			JOptionPane.showMessageDialog(null, "score: " + score);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong the correct answer was, \"Stop Imagining\"");
		}

		String input2 = JOptionPane.showInputDialog(null, "Take of my skin, i wont cry but you will, who am I?");
		if (input2.equalsIgnoreCase("An onion")) {
			score++;
			JOptionPane.showMessageDialog(null, "Score: " + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong, the correct answer is \"An Onion\"");
		}
		}
	}


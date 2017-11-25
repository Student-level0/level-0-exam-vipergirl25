

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		
	
	String Age = JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(Age);
	int yearBorn = 0;
	if(age>17) {
		yearBorn = 2017 - age;
	}
	else {
		int ageSince2000 = age - 17;
		yearBorn = 2000 - ageSince2000;
	}
	if(age>30) {
		JOptionPane.showMessageDialog(null, "You are too old to play this game.");
		JOptionPane.showMessageDialog(null, "You were born in " + yearBorn);
	}
	else {
		JOptionPane.showMessageDialog(null, "You were born in " + yearBorn);
	}
	}
}




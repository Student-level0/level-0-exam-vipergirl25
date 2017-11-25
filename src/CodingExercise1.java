import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot rob = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw
    	String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
   
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if(color.equals("pink") || color.equals("Pink")) {
    		rob.setPenColor(Color.pink);
    	}
    	else if(color.equals("blue") || color.equals("Blue")) {
    		rob.setPenColor(Color.BLUE);
    	}
    	else if(color.equals("black") || color.equals("Black")) {
    		rob.setPenColor(Color.BLACK);
    	}
    	else {
    		rob.setPenColor(Color.MAGENTA);
    	}

   	 // 2. set the pen width to 10
    	rob.setPenWidth(10);
    	rob.setSpeed(10);
    	rob.hide();

   	 // 1. make the Robot draw a shape
    	rob.penDown();
    	rob.sparkle();
    	for (int i = 0; i < 200; i++) {
    		rob.move(100);
    		rob.turn(90);
			
		}
   	 
    }

}

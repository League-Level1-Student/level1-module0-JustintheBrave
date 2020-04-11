package _01_houses;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot house = new Robot();
	public void run() {
		house.miniaturize();
		house.setSpeed(25);
		house.setX(20);
		house.setY(500);
		house.penDown();
		for (int i = 0; i < 10; i++) {
			String tall = JOptionPane.showInputDialog("small medium or large");
			String color = JOptionPane.showInputDialog("red, green, blue, or purple?");
			extract(tall);
		}
		
	}
	
	static void extract(String height, String look) {
		int tallness=0;
		String colors;
		if(height.equalsIgnoreCase("small")) {
			tallness=60;
		}
		else if(height.equalsIgnoreCase("medium")) {
			tallness=120;
		}
		else if(height.equalsIgnoreCase("large")) {
			tallness=250;
		}
		
		if(look.equalsIgnoreCase("red")) {
			house.setPenColor(255,0,0);
		}
		
		
		house.move(tallness);
		house.turn(90);
		house.move(20);
		house.turn(90);
		house.move(tallness);
		house.turn(-90);
		house.move(20);
		house.turn(-90);
		
	}
}

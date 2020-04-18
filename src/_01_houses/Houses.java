package _01_houses;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot house = new Robot();
	public void run() {
		house.hide();
		house.setSpeed(25);
		house.setX(20);
		house.setY(500);
		house.penDown();
		house.setWindowColor(0,0,0);
		for (int i = 0; i < 10; i++) {
			String tall = JOptionPane.showInputDialog("small medium or large");
			String color = JOptionPane.showInputDialog("red, green, blue, or purple?");
			
			if(tall.equalsIgnoreCase("large")) {
				extract(tall, color);
			}
			
			
			else if(tall.equalsIgnoreCase("medium") || tall.equalsIgnoreCase("small")) {
				drawPeakedRoof(tall, color);
			}
		}
		
	}
	
	static void extract(String height, String look) {
		int tallness=0;
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
		
		else if(look.equalsIgnoreCase("green")) {
			house.setPenColor(0,255,10);
		}
		
		else if(look.equalsIgnoreCase("blue")) {
			house.setPenColor(0,10,255);
		}
		
		else if(look.equalsIgnoreCase("purple")) {
			house.setPenColor(198,0,255);
		}
		
		house.move(tallness);
		house.turn(90);
		house.move(20);
		house.turn(90);
		house.move(tallness);
		house.setPenColor(35,255,104);
		house.turn(-90);
		house.move(20);
		house.turn(-90);
		
	}
	
	static void drawPeakedRoof(String height, String look){
		int tallness=0;
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
		
		else if(look.equalsIgnoreCase("green")) {
			house.setPenColor(0,255,10);
		}
		
		else if(look.equalsIgnoreCase("blue")) {
			house.setPenColor(0,10,255);
		}
		
		else if(look.equalsIgnoreCase("purple")) {
			house.setPenColor(198,0,255);
		}
		
		house.move(tallness);
		house.turn(60);
		house.move(15);
		house.turn(60);
		house.move(15);
		house.turn(60);
		house.move(tallness);
		house.setPenColor(35,255,104);
		house.turn(-90);
		house.move(20);
		house.turn(-90);
		
		
	}
	
	
	static void drawFlatRoof(String height, String look) {
		int tallness=0;
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
		
		else if(look.equalsIgnoreCase("green")) {
			house.setPenColor(0,255,10);
		}
		
		else if(look.equalsIgnoreCase("blue")) {
			house.setPenColor(0,10,255);
		}
		
		else if(look.equalsIgnoreCase("purple")) {
			house.setPenColor(198,0,255);
		}
		
		house.move(tallness);
		house.turn(90);
		house.move(20);
		house.turn(90);
		house.move(tallness);
		house.setPenColor(35,255,104);
		house.turn(-90);
		house.move(20);
		house.turn(-90);
		

	}
}

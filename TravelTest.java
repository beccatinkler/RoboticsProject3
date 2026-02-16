//Import packages
import lejos.nxt.*;
import lejos.robotics.navigation.*;
public class TravelTest 
{

	/**
	 * Robot traces out square w/ side lengths of 1 meter
	 * 
	 * author: Becca Tinkler
	 * 
	 */
	
	// Global variables
	DifferentialPilot pilot;
	
	public void go()
	{
		pilot.travel(93.5);
	}
	
	public void turn()
	{
		pilot.travel(100, true);
		pilot.rotate(90.0);
	}
	
	public static void main(String[] args) 
	{
		// Display program name
		LCD.drawString("Square", 0, 0);
			
		// Wait for button press to start
		Button.waitForPress();
		LCD.clear();
				
		// Create new RotationTest object then call go method
		TravelTest robot = new TravelTest();
		robot.pilot = new DifferentialPilot(3.1, 17.25, Motor.A, Motor.C);
		robot.pilot.setTravelSpeed(25);
		
		for (int i = 0; i < 4; i++)
		{
			robot.go();
			robot.turn();
		}
		Button.waitForPress();
	}

	
}
